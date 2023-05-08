package starter.stepdefinitions.authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.authentication.GetUserInformation;

public class GetUserInformationSteps {
    @Steps
    GetUserInformation getUserInformation;
    @When("user set GET valid endpoint for user information")
    public void userSetGETValidEndpointForUserInformation() {
        getUserInformation.setGETValidEndpointForUserInformation();
    }

    @And("user send GET HTTP request with valid endpoint for user information")
    public void userSendGETHTTPRequestWithValidEndpointForUserInformation() {
        getUserInformation.sendGETHTTPRequestWithValidEndpointForUserInformation();
    }

    @Then("user received valid GET HTTP response code {int} for user information")
    public void userReceivedValidGETHTTPResponseCodeForUserInformation(int arg0) {
        getUserInformation.validateGETHTTPResponseCode200ForUserInformation();
    }

    @When("user set GET invalid endpoint for user information")
    public void userSetGETInvalidEndpointForUserInformation() {
        getUserInformation.setGETInvalidEndpointForUserInformation();
    }

    @And("user send GET HTTP request with invalid endpoint for user information")
    public void userSendGETHTTPRequestWithInvalidEndpointForUserInformation() {
        getUserInformation.sendGETHTTPRequestWithInvalidEndpointForUserInformation();
    }

    @Then("user received GET HTTP response code {int} for user information")
    public void userReceivedGETHTTPResponseCodeForUserInformation(int arg0) {
        getUserInformation.validateValidGETHTTPResponseCode404ForUserInformation();
    }
}
