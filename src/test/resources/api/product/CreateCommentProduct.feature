@CreateComment
Feature: POST - Create a comment for product
  As a user
  I want to see list of products
  So that i can create a comment for product

  Background:
    Given User set authentication endpoint
    And User send authentication endpoint

  @CreateCommentValidEndpoint
  Scenario: Create Comment Valid Endpoint - as a user i want to create a comment for product with valid endpoint
    When user set POST valid endpoint for create comment product
    And user send POST HTTP request for create comment product
    Then user received HTTP response code 200 for create comment product

  @CreateCommentInvalidEndpoint
  Scenario: Create Comment Invalid Endpoint - as a user i want to create a comment for product with invalid endpoint
    When user set POST invalid endpoint for create comment product
    And user send POST HTTP request with invalid endpoint for create comment product
    Then user received POST HTTP response code 404 for create comment product

  @CreateCommentWithoutReqData
  Scenario: Create Comment Without Req Data - as a user i want to create a comment for product without request data
    When user set POST valid endpoint for create comment product
    And user send POST HTTP request for create comment product without request data
    Then user received HTTP response code 500 Internal Server Error for create comment product