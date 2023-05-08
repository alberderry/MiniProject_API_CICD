@Register
Feature: POST - register
  As a user
  I want to register
  So that i can login

  @RegisterValidEndpoint
  Scenario: Register Valid Endpoint - as a user i want to register with valid endpoint
    Given User set POST valid endpoint for register
    When User send POST HTTP request with valid endpoint for register
    Then User received POST HTTP response code 200 for register

  @RegisterInvalidEndpoint
  Scenario: Register Invalid Endpoint - as a user i want to register with invalid endpoint
    Given User set POST invalid endpoint for register
    When User send POST HTTP request with invalid endpoint for register
    Then User received POST HTTP responses code 404 for register

  @RegisterWithoutReqData
  Scenario: Register Without Req Data - as a user i want to register without request data
    Given User set POST valid endpoint for register
    When User send POST HTTP request without req data for register
    Then User received POST HTTP response code 400 for register without request data