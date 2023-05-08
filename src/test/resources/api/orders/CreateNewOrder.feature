@CreateOrder
Feature: POST - Create a new order
  As a user
  I want to see list of orders
  So that i can create a new order

  Background:
    Given User set authentication endpoint
    And User send authentication endpoint

  @CreateOrderValidEndpoint
  Scenario: Create Order Valid Endpoint - as a user i want to create a new order with valid endpoint
    When user set POST valid endpoint for create new order
    And user send POST HTTP request for create new order
    Then user received HTTP response code 200 for create new order

  @CreateOrderInvalidEndpoint
  Scenario: Create Order Invalid Endpoint - as a user i want to create a new order with invalid endpoint
    When user set POST invalid endpoint for create new order
    And user send POST HTTP request with invalid endpoint for create new order
    Then user received POST HTTP response code 404 for create new order

  @CreateOrderWithoutReqData
  Scenario: Create Order Without Req Data - as a user i want to create a new order without request data
    When user set POST valid endpoint for create new order
    And user send POST HTTP request for create new order without request data
    Then user received HTTP response code 200 for create new order