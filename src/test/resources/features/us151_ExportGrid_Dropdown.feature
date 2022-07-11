
@ExportGrid
Feature:  "Export Grid" dropdown on <Car Entitles> page

  User Story: US151 As a user when I am on Vytrack => Fleet => Vehicles,
              I should be able to see Export Grid dropdown,
              Refresh, Reset and Grid Settings Buttons

    Tests:  T1 click functionality of "Export Grid" dropdown ( @ExportGridFunctionality )
            T2 "Export Grid" dropdown location ( @ExportGridLocation )

  Accounts:  Truck Driver, Store Manager, Sales Manager


  @ExportGridFunctionality  @TruckDriver
  Scenario Outline:
    Given  User enters "<username.TruckDriver>" with "<password>" to get to <CarEntitles> page
    When  click  <Export Grid> dropdown
    Then  links CSV & XLSX  should be visible
      Examples:
        |  username.TruckDriver   |  password  |
        |  username.TruckDriver1  |  password  |
        |  username.TruckDriver2  |  password  |
        |  username.TruckDriver3  |  password  |


    @ExportGridFunctionality  @StoreManager
      Scenario Outline: T1 click functionality of "Export Grid" dropdown
        Given  User enters "<username.StoreMan>" with "<password>" to get to <CarEntitles> page
        When  click  <Export Grid> dropdown
        Then  links CSV & XLSX  should be visible
          Examples:
            |  username.StoreMan   |  password  |
            |  username.StoreMan1  |  password  |
            |  username.StoreMan2  |  password  |
            |  username.StoreMan3  |  password  |


      @ExportGridFunctionality  @SalesManager
      Scenario Outline: T1 click functionality of "Export Grid" dropdown
        Given  User enters "<username.SalesMan>" with "<password>" to get to <CarEntitles> page
        When  click  <Export Grid> dropdown
        Then  links CSV & XLSX  should be visible
          Examples:
            |  username.SalesMan   |  password  |
            |  username.SalesMan1  |  password  |
            |  username.SalesMan2  |  password  |
            |  username.SalesMan3  |  password  |


#  @ExportGridLocation
#  Scenario: T2 "Export Grid" dropdown location
#    Given  User navigates to "CarEntitles" page
#    When  User is on  "Car-Entitles..."  page
#    Then  export grid should be visible on the left of the page