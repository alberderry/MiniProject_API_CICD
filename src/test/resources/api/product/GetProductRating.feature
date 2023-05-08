@GetProductRating
Feature: GET - Product ratings
  As a user
  I want to see list of products
  So that i can see product ratings

  @GetProductRatingValidEndpoint
  Scenario: Get Product Rating Valid Endpoint - As a user i want to get product ratings with valid endpoint
    Given user set GET valid endpoint for get product ratings
    When user send GET HTTP request for get product ratings with valid endpoint
    Then user received valid GET HTTP response code 200 for get product ratings

  @GetProductRatingInvalidEndpoint
  Scenario: Get Product Rating Invalid Endpoint - As a user i want to get product ratings with invalid endpoint
    Given user set GET invalid endpoint for get product ratings
    When user send GET HTTP request for get product ratings with invalid endpoint
    Then user received GET HTTP response code 404 for get product ratings