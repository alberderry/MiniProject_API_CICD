@GetCommentProduct
Feature: GET - Product comments
  As a user
  I want to see list of products
  So that i can see product comments

  @GetCommentProductValidEndpoint
  Scenario: Get Product Valid Endpoint - As a user i want to get product comments with valid endpoint
    Given user set GET valid endpoint for get product comments
    When user send GET HTTP request for get product comments with valid endpoint
    Then user received valid GET HTTP response code 200 for get product comments

  @GetCommentProductInvalidEndpoint
  Scenario: Get Product Invalid Endpoint - As a user i want to get product comments with invalid endpoint
    Given user set GET invalid endpoint for get product comments
    When user send GET HTTP request for get product comments with invalid endpoint
    Then user received GET HTTP response code 404 for get product comments