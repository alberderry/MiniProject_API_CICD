@GetAllCategories
Feature: GET - All categories
  As a user
  I want to see list of categories
  So that i can see all categories

  @GetAllCategoriesValidEndpoint
  Scenario: Get All Categories Valid Endpoint - As a user i want to get all categories with valid endpoint
    Given user set GET valid endpoint for all categories
    When user send GET HTTP request with valid endpoint for all categories
    Then user received valid GET HTTP response code 200 for all categories

  @GetAllCategoriesInvalidEndpoint
  Scenario: Get All Categories Valid Endpoint - As a user i want to get all categories with invalid endpoint
    Given user set GET invalid endpoint for all categories
    When user send GET HTTP request with invalid endpoint for all categories
    Then user received GET HTTP response code 404 for all categories