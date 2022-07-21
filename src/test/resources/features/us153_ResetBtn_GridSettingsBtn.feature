
@ResetBtn  @GridSettingsBtn  @smoke
Feature:  "Grid Settings" button on <Car Entitles> page

  User Story: US153 As a user when I am on Vytrack => Fleet => Vehicles,
              I should be able to see Export Grid dropdown,
              Refresh, Reset and Grid Settings Buttons

  Tests:
  TC4 Verification the click functionality of the "Reset" button

  Accounts:  Truck Driver, Store Manager, Sales Manager


  Scenario Outline: TC4 Verification the click functionality of the "Reset" button
    Given  User is logged as "<user>"
    When  User navigates to <CarEntitles> page
    And Apply a few changes at <Grid settings>
    Then  After clicking <Reset> button should be reseted selected changes at <Grid settings>
    Examples:
      | user         |
      | TruckDriver  |
      | StoreManager |
      | SalesManager |


