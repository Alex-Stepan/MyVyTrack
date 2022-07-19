
  @Login  @smoke
  Feature:  Login Functionality with valid credentials

    User Story:  User should be able to login to "Dashboard" page with valid credentials
      Accounts:  Truck Driver, Store Manager, Sales Manager,  and testUser (as one of first 3)

    #1. Verify all credentials for login functionality
      @TruckDriver
      Scenario Outline: Verify all credentials for login functionality
        Given  User is on VyTrack <Login> page
        When  User enters "<truckdriver>" with "<password>"
        Then  User should navigate to <Dashboard> page
        Examples:
            |  truckdriver            |  password  |
            |  username.TruckDriver1  |  password  |
            |  username.TruckDriver2  |  password  |
            |  username.TruckDriver3  |  password  |

      @StoreManager
      Scenario Outline: Verify all credentials for login functionality
        Given  User is on VyTrack <Login> page
        When  User enters "<storemanager>" with "<password>"
        Then  User should navigate to <Dashboard> page
        Examples:
          |  storemanager        |  password  |
          |  username.StoreMan1  |  password  |
          |  username.StoreMan2  |  password  |
          |  username.StoreMan3  |  password  |

      @SalesManager
      Scenario Outline: Verify all credentials for login functionality
        Given  User is on VyTrack <Login> page
        When  User enters "<salesmanager>" with "<password>"
        Then  User should navigate to <Dashboard> page
        Examples:
          |  salesmanager        |  password  |
          |  username.SalesMan1  |  password  |
          |  username.SalesMan2  |  password  |
          |  username.SalesMan3  |  password  |



    #2. testUser login functionality
      @Tester
      Scenario: Login as testUser
        Given User is on VyTrack <Login> page
        When  User login as a <Tester>
        Then  User should navigate to <Dashboard> page



    #3. Login with Parameters

      Scenario Outline: Login with parameters
        Given User is on VyTrack <Login> page
        When  User login as "<user>"
        Then  User should navigate to <Dashboard> page
        Examples:
          | user         |
          | TruckDriver  |
          | StoreManager |
          | SalesManager |


