
@ExportGrid  @smoke
Feature:  Export Grid dropdown on <CarEntitles> page

  User Story: US151 As a user when on Vytrack => Fleet => Vehicles,
              I should be able to see Export Grid dropdown,
              Refresh, Reset and Grid Settings Buttons
  Accounts:  Truck Driver, Store Manager, Sales Manager and testUser (as one of first 3)

  @ExportGridFunctionality
  Scenario Outline: T1. click functionality of "Export Grid" dropdown
    Given  User is logged as "<user>"
    When  User navigates to <CarEntitles> page
    And  click  <Export Grid> dropdown
    Then  links CSV & XLSX  should be visible
    Examples:
      | user         |
      | TruckDriver  |
      | StoreManager |
      | SalesManager |






#  @ExportGridLocation
#  Scenario: T2 "Export Grid" dropdown location
#    Given  User navigates to "CarEntitles" page
#    When  User is on  "Car-Entitles..."  page
#    Then  export grid should be visible on the left of the page