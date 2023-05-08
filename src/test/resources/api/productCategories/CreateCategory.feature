@CreateCategories
Feature: POST - create a category
  As a user
  I want to see list of categories
  So that i can create a category

  @CreateCategoriesValidEndpoint
  Scenario: Create Categories Valid Endpoint - as a user i want to create a category with valid endpoint
    Given user set POST valid endpoint for create a category
    When user send POST HTTP request for create a category
    And user received valid data for new category
    Then user received HTTP response code 200 for create a category

  @CreateCategoriesInvalidEndpoint
  Scenario: Create Categories Invalid Endpoint - as a user i want to create a category with invalid endpoint
    Given user set POST invalid endpoint for create a category
    When user send POST HTTP request with invalid endpoint for create a category
    Then user received POST HTTP response code 404 for create a category

  @CreateCategoriesWithoutReqData
  Scenario: Create Categories Without Req Data - as a user i want to create a category without request data
    Given user set POST valid endpoint for create a category
    When user send POST HTTP request for create a category without request data
    Then user received HTTP response code 400 for create a category without request data