package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.AssignProductRating;

public class AssignProductRatingSteps {
    @Steps
    AssignProductRating assignProductRating;
    @When("user set POST valid endpoint for assign product rating")
    public void userSetPOSTValidEndpointForAssignProductRating() {
        assignProductRating.setPostValidEndpointForAssignProductRating();
    }

    @And("user send POST HTTP request for assign product rating")
    public void userSendPOSTHTTPRequestForAssignProductRating() {
        assignProductRating.sendPOSTHTTPRequestForAssignProductRating();
    }

    @Then("user received HTTP response code {int} for assign product rating")
    public void userReceivedHTTPResponseCodeForAssignProductRating(int arg0) {
        assignProductRating.validateHTTPResponseCode200ForAssignProductRating();
    }

    @When("user set POST invalid endpoint for assign product rating")
    public void userSetPOSTInvalidEndpointForAssignProductRating() {
        assignProductRating.setPostEndpointWithInvalidEndpointForAssignProductRating();
    }

    @And("user send POST HTTP request with invalid endpoint for assign product rating")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForAssignProductRating() {
        assignProductRating.sendPOSTHTTPRequestWithInvalidEndpointForAssignProductRating();
    }

    @Then("user received POST HTTP response code {int} for assign product rating")
    public void userReceivedPOSTHTTPResponseCodeForAssignProductRating(int arg0) {
        assignProductRating.validateHTTPResponseCode404WithInvalidEndpointForAssignProductRating();
    }

    @When("user set POST valid endpoint without request data for assign product rating")
    public void userSetPOSTValidEndpointWithEmptyRequestBodyForAssignProductRating() {
        assignProductRating.setPostValidEndpointWithEmptyRequestBodyForAssignProductRating();
    }

    @And("user send POST HTTP request without request data for assign product rating")
    public void userSendPOSTHTTPRequestWithEmptyRequestBodyForAssignProductRating() {
        assignProductRating.sendPOSTHTTPRequestWithEmptyRequestBodyForAssignProductRating();
    }

    @Then("user received HTTP response code {int} without request data for assign product rating")
    public void userReceivedHTTPResponseCodeWithEmptyRequestBodyForAssignProductRating(int arg0) {
        assignProductRating.validateHTTPResponseCode200WithEmptyRequestBodyForAssignProductRating();
    }
}
