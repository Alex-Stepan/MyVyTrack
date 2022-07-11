

Feature:  Navigation from <Dashboard> page to <Car Entitles> page

  Scenario: Navigation to Car Entitles page
    Given  User is on VyTrack <Login> page
    When  User logging to the Dashboard System
    And User selects Vehicles under Fleet
    Then  User should navigate to CarEntitles page