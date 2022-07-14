
@ResetButton
Feature:  "Reset" button on <Car Entitles> page

  User Story: US151 As a user when I am on Vytrack => Fleet => Vehicles,
              I should be able to see Export Grid dropdown,
              Refresh, Reset and Grid Settings Buttons

  Tests:
        TC4 Verification the click functionality of the "Reset" button

  Accounts:  Truck Driver, Store Manager, Sales Manager


#  TC4 Verification the click functionality of the "Reset" button

  @ResetButtonFunctionality  @TruckDriver
  Scenario Outline:
    Given  User enters "<username.TruckDriver>" with "<password>" to get to <CarEntitles> page
    When select a few changes at <Grid settings>
    And see few changes to be applied
    And  click  <Reset> button
    Then  selected changes at <Grid settings> should be reseted
    Examples:
      |  username.TruckDriver   |  password  |
      |  username.TruckDriver1  |  password  |
      |  username.TruckDriver2  |  password  |
      |  username.TruckDriver3  |  password  |

  @ResetButtonFunctionality  @StoreManager
  Scenario Outline:
    Given  User enters "<username.StoreMan>" with "<password>" to get to <CarEntitles> page
    When select a few changes at <Grid settings>
    And see few changes to be applied
    And  click  <Reset> button
    Then  selected changes at <Grid settings> should be reseted
    Examples:
      |  username.StoreMan   |  password  |
      |  username.StoreMan1  |  password  |
      |  username.StoreMan2  |  password  |
      |  username.StoreMan3  |  password  |

  @ResetButtonFunctionality  @SalesManager
  Scenario Outline:
    Given  User enters "<username.SalesMan>" with "<password>" to get to <CarEntitles> page
    When select a few changes at <Grid settings>
    And see few changes to be applied
    And  click  <Reset> button
    Then  selected changes at <Grid settings> should be reseted
    Examples:
      |  username.SalesMan   |  password  |
      |  username.SalesMan1  |  password  |
      |  username.SalesMan2  |  password  |
      |  username.SalesMan3  |  password  |


#  TC6 Verification of the Refresh Button Right side Location left from Reset Button