@AssignProductRating
Feature: POST - assign a product rating
  As a user
  I want to see list of products
  So that i can assign a product rating

  Background:
    Given User set authentication endpoint
    And User send authentication endpoint

  @AssignProductRatingValidEndpoint
  Scenario: Assign Product Rating Valid Endpoint - as a user i want to assign a product rating with valid endpoint
    When user set POST valid endpoint for assign product rating
    And user send POST HTTP request for assign product rating
    Then user received HTTP response code 200 for assign product rating

  @AssignProductRatingInvalidEndpoint
  Scenario: Assign Product Rating Invalid Endpoint - as a user i want to assign a product rating with invalid endpoint
    When user set POST invalid endpoint for assign product rating
    And user send POST HTTP request with invalid endpoint for assign product rating
    Then user received POST HTTP response code 404 for assign product rating

  @AssignProductRatingWithoutReqData
  Scenario: Assign Product Rating Without Req Data - as a user i want to assign a product rating without request data
    When user set POST valid endpoint without request data for assign product rating
    And user send POST HTTP request without request data for assign product rating
    Then user received HTTP response code 200 without request data for assign product rating