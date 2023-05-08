@GetOrderById
Feature: GET - Order by ID
  As a user
  I want to see list of orders
  So that i can see order by ID

  Background:
    Given User set authentication endpoint
    And User send authentication endpoint

  @GetOrderByIdValidEndpoint
  Scenario: Get Order By Id Valid Endpoint - As a user i want to get order by ID with valid endpoint
    When user set GET valid endpoint for order by ID
    And user send GET HTTP request with valid endpoint for order by ID
    Then user received valid GET HTTP response code 200 for order by ID

  @GetOrderByIdValidEndpoint
  Scenario: Get Order By Id Invalid Endpoint - As a user i want to get order by ID with invalid endpoint
    When user set GET invalid endpoint for order by ID
    And user send GET HTTP request with invalid endpoint for order by ID
    Then user received GET HTTP response code 404 for order by ID