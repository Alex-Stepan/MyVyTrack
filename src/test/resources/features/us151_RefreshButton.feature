
@RefreshButton
Feature:  "Refresh" button functionality on <Car Entitles> page

  US 151 :  As a user when I am on Vytrack => Fleet => Vehicles,
            I should be able to see Export Grid dropdown,
            Refresh, Reset and Grid Settings Buttons
  Tests:  TC3 Verification the click functionality of the "Refresh" button

  Accounts:  Truck Driver, Store Manager, Sales Manager


  @RefreshButtonFunctionality  @TruckDriver
  Scenario Outline:
    Given  User enters "<username.TruckDriver>" with "<password>" to get to <CarEntitles> page
    When  click <Refresh> button
    Then  Vehicle Grid should be refreshed
    Examples:
      |  username.TruckDriver   |  password  |
      |  username.TruckDriver1  |  password  |
      |  username.TruckDriver2  |  password  |
      |  username.TruckDriver3  |  password  |


  @RefreshButtonFunctionality  @StoreManager
  Scenario Outline:
    Given  User enters "<username.StoreMan>" with "<password>" to get to <CarEntitles> page
    When  click <Refresh> button
    Then  Vehicle Grid should be refreshed
    Examples:
      |  username.StoreMan   |  password  |
      |  username.StoreMan1  |  password  |
      |  username.StoreMan2  |  password  |
      |  username.StoreMan3  |  password  |


  @RefreshButtonFunctionality  @SalesManager
  Scenario Outline:
    Given  User enters "<username.SalesMan>" with "<password>" to get to <CarEntitles> page
    When  click <Refresh> button
    Then  Vehicle Grid should be refreshed
    Examples:
      |  username.SalesMan   |  password  |
      |  username.SalesMan1  |  password  |
      |  username.SalesMan2  |  password  |
      |  username.SalesMan3  |  password  |