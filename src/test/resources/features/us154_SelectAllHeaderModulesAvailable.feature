  @wip
  Feature: US154 Select all Header Modules Available and Make a list of All Modules

    User Story: US154 As a user, when hover over to each module,
                then should be able to see all submodules
    Accounts:  Truck Driver, Store Manager, Sales Manager

    Scenario: TruckDriver modules displayed
      Given  User is logged as TruckDriver
      When Hover over to each module
      Then All Modules and submodules should be visible for the module