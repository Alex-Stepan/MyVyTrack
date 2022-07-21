   @smoke
  Feature: US154 Select all Header Modules Available and Make a list of All Modules

    User Story: US154 As a user, when hover over to each module,
                then should be able to see all submodules
    Accounts:  Truck Driver, Store Manager, Sales Manager

    Scenario: TruckDriver modules displayed
      Given  User is logged as TruckDriver
      When Hover over to each module
      Then All Modules and submodules should be visible for the module

    Scenario: StoreManager modules displayed
      Given  User is logged as StoreManager
      When Hover over to each module
      Then All Modules and submodules should be visible for the module

    Scenario: SalesManager modules displayed
      Given  User is logged as SalesManager
      When Hover over to each module
      Then All Modules and submodules should be visible for the module


    @wip
    Scenario Outline: Navigation to All SubModules from DASHBOARD Module
      Given User is logged as "<user>"
      Then User navigates through each subModule from Dashboard Module
        Examples:
        | user         |
        | StoreManager |
        | SalesManager |

    Scenario: Navigation to All SubModules from FLEET Module
      Given User is logged as {string}
      Then User navigates through each subModule from Fleet Module

    Scenario: Navigation to All SubModules from CUSTOMERS Module
      Given User is logged as {string}
      Then User navigates through each subModule from Customers Module



