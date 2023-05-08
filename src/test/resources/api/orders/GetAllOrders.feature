@GetAllOrder
Feature: GET - All orders
  As a user
  I want to see list of orders
  So that i can see all orders

  Background:
    Given User set authentication endpoint
    And User send authentication endpoint

  @GetAllOrderValidEndpoint
  Scenario: Get All Order Valid Endpoint - As a user i want to get all orders with valid endpoint
    When user set GET valid endpoint for all orders
    And user send GET HTTP request with valid endpoint for all orders
    Then user received valid GET HTTP response code 200 for all orders

  @GetAllOrderInvalidEndpoint
  Scenario: Get All Order Invalid Endpoint - As a user i want to get all orders with invalid endpoint
    When user set GET invalid endpoint for all orders
    And user send GET HTTP request with invalid endpoint for all orders
    Then user received GET HTTP response code 404 for all orders