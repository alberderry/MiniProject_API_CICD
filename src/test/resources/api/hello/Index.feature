@Index
Feature: GET - Index
  As a user
  I want to see list of index
  So that i can see index

  @IndexValidEndpoint
  Scenario: Get Valid Endpoint - As a user i want to get index with valid endpoint
    Given user set GET valid endpoint for index
    When user send GET HTTP request with valid endpoint for index
    And  user received valid data for index
    Then user received valid GET HTTP response code 200 for index

  @IndexInvalidEndpoint
  Scenario: Get Invalid Endpoint - As a user i want to get index with invalid endpoint
    Given user set GET invalid endpoint for index
    When user send GET HTTP request with invalid endpoint for index
    Then user received GET HTTP response code 404 for index