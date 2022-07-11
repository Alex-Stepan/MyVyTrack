
  @Login
  Feature:  Login Functionality with valid credentials

    User Story:  User should be able to login to "Dashboard" page with valid credentials
      Accounts:  Truck Driver, Store Manager, Sales Manager




      @TruckDriver
      Scenario Outline:
        Given  User is on VyTrack <Login> page
        When  User enters "<username.TruckDriver>" with "<password>"
        Then  User should navigate to <Dashboard> page
        And   User logging out
        Examples:
            |  username.TruckDriver   |  password  |
            |  username.TruckDriver1  |  password  |
            |  username.TruckDriver2  |  password  |
            |  username.TruckDriver3  |  password  |


      @StoreManager
      Scenario Outline:
        Given  User is on VyTrack <Login> page
        When  User enters "<username.StoreMan>" with "<password>"
        Then  User should navigate to <Dashboard> page
        And   User logging out
        Examples:
          |  username.StoreMan   |  password  |
          |  username.StoreMan1  |  password  |
          |  username.StoreMan2  |  password  |
          |  username.StoreMan3  |  password  |


      @SalesManager
      Scenario Outline:
        Given  User is on VyTrack <Login> page
        When  User enters "<username.SalesMan>" with "<password>"
        Then  User should navigate to <Dashboard> page
        And   User logging out
        Examples:
          |  username.SalesMan   |  password  |
          |  username.SalesMan1  |  password  |
          |  username.SalesMan2  |  password  |
          |  username.SalesMan3  |  password  |

