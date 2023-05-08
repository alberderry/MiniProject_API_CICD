package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.GetProductRating;

public class GetProductRatingSteps {
    @Steps
    GetProductRating get_product_ratings;

    @Given("user set GET valid endpoint for get product ratings")
    public void userSetGETValidEndpointForGetProductRatings() {
        get_product_ratings.setGETValidEndpointForGetProductRatings();
    }

    @When("user send GET HTTP request for get product ratings with valid endpoint")
    public void userSendGETHTTPRequestToGetProductRatingsWithValidEndpoint() {
        get_product_ratings.sendGETHTTPRequestForGetProductRatingsWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code {int} for get product ratings")
    public void userReceivedValidGETHTTPResponseCodeForGetProductRatings(int arg0) {
        get_product_ratings.validateGETHTTPResponseCode200ForGetProductRatings();
    }

    @Given("user set GET invalid endpoint for get product ratings")
    public void userSetGETInvalidEndpointForGetProductRatings() {
        get_product_ratings.setGETInvalidEndpointForGetProductRatings();
    }

    @When("user send GET HTTP request for get product ratings with invalid endpoint")
    public void userSendGETHTTPRequestForGetProductRatingsWithInvalidEndpoint() {
        get_product_ratings.sendGETHTTPRequestForGetProductRatingsWithInvalidQueryEndpoint();
    }

    @Then("user received GET HTTP response code {int} for get product ratings")
    public void userReceivedGETHTTPResponseCodeForGetProductRatings(int arg0) {
        get_product_ratings.validateValidGETHTTPResponseCode404ForGetProductRatings();
    }
}
