@fun
Feature: Flights functionalities negative

  @tag1
  Scenario: perform serachFlights with invalid fields
    Given user should be in serachflights page
    When user should enter invalid fileds
    Then user should get error msg

 