@CreateNewProduct
Feature: POST - create a new product
  As a user
  I want to see list of products
  So that i can create new product

  @CreateNewProductValidEndpoint
  Scenario: Create New Product Valid Endpoint - as a user i want to create a new product with valid endpoint
    Given user set POST valid endpoint
    When user send POST HTTP request
    And user received valid data for new product
    Then user received HTTP response code 200

  @CreateNewProductInvalidEndpoint
  Scenario: Create New Product Invalid Endpoint - as a user i want to add new product with invalid endpoint
    Given user set POST invalid endpoint
    When user send POST HTTP request with invalid endpoint
    Then user received POST HTTP response code 404

  @CreateNewProductWithoutReqData
  Scenario: Create Product Without Req Data - as a user i want to create a new product with input Without request data
    Given user set POST valid endpoint
    When user send POST HTTP request without request data
    Then user received HTTP response code 500 without request data
