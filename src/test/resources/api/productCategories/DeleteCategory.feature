@DeleteCategory
Feature: DELETE - A category
  As a user
  I want to see list of category
  So that i can delete a category

  @DeleteCategoryValidEndpoint
  Scenario: Delete Category Valid Endpoint - as a user i want to delete a category with valid endpoint
    Given user set DELETE valid endpoint for delete category
    When user send DELETE HTTP request with valid endpoint for delete category
    Then user received DELETE HTTP response code 200 with valid endpoint for delete category

  @DeleteCategoryInvalidEndpoint
  Scenario: Delete Category Invalid Endpoint - as a user i want to delete a category with invalid endpoint
    Given user set DELETE endpoint with invalid endpoint for delete category
    When user send DELETE HTTP request with invalid endpoint for delete category
    Then user received DELETE HTTP response code 404 with invalid endpoint for delete category