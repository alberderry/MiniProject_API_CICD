@DeleteProduct
Feature: DELETE - A product
  As a user
  I want to see list of product
  So that i can delete a product

  @DeleteProductValidEndpoint
  Scenario: Delete Product Valid Endpoint - as a user i want to delete a product with valid endpoint
    Given user set DELETE valid endpoint
    When user send DELETE HTTP request with valid endpoint
    Then user received DELETE HTTP response code 200 with valid endpoint

  @DeleteProductInvalidEndpoint
  Scenario: Delete Product Invalid Endpoint - as a user i want to delete a product with invalid endpoint
    Given user set DELETE endpoint with invalid endpoint
    When user send DELETE HTTP request with invalid endpoint
    Then user received DELETE HTTP response code 404 with invalid endpoint