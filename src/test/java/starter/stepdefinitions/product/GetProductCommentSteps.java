package starter.stepdefinitions.product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.GetProductComment;

public class GetProductCommentSteps {
    @Steps
    GetProductComment getProductComment;
    @Given("user set GET valid endpoint for get product comments")
    public void userSetGETValidEndpointToGetProductComments() {
        getProductComment.setGETValidEndpointForGetProductComments();
    }

    @When("user send GET HTTP request for get product comments with valid endpoint")
    public void userSendGETHTTPRequestToGetProductCommentsWithValidEndpoint() {
        getProductComment.sendGETHTTPRequestForGetProductCommentsWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code {int} for get product comments")
    public void userReceivedValidGETHTTPResponseCodeToGetProductComments(int arg0) {
        getProductComment.validateGETHTTPResponseCode200ForGetProductComments();
    }

    @Given("user set GET invalid endpoint for get product comments")
    public void userSetGETInvalidEndpointToGetProductComments() {
        getProductComment.setGETInvalidEndpointForGetProductComments();
    }

    @When("user send GET HTTP request for get product comments with invalid endpoint")
    public void userSendGETHTTPRequestToGetProductCommentsWithInvalidEndpoint() {
        getProductComment.sendGETHTTPRequestForGetProductCommentsWithInvalidQueryEndpoint();
    }

    @Then("user received GET HTTP response code {int} for get product comments")
    public void userReceivedGETHTTPResponseCodeToGetProductComments(int arg0) {
        getProductComment.validateValidGETHTTPResponseCode404ForGetProductComments();
    }
}
