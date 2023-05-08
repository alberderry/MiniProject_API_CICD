package starter.stepdefinitions.authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.authentication.Login;

public class LoginSteps {
    @Steps
    Login login;
    @Given("user set POST valid endpoint for login")
    public void userSetPOSTValidEndpointForLogin() {
        login.setPostValidEndpointForLogin();
    }

    @When("user send POST HTTP request for login")
    public void userSendPOSTHTTPRequestForLogin() {
        login.sendPOSTHTTPRequestForLogin();
    }

    @Then("user received POST HTTP response code {int} for login")
    public void userReceivedPOSTHTTPResponseCodeForLogin(int arg0) {
        login.validateHTTPResponseCode200ForLogin();
    }

    @Given("user set POST endpoint with invalid endpoint for login")
    public void userSetPOSTEndpointWithInvalidEndpointForLogin() {
        login.setPostEndpointWithInvalidEndpointForLogin();
    }

    @When("user send POST HTTP request with invalid endpoint for login")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForLogin() {
        login.sendPOSTHTTPRequestWithInvalidEndpointForLogin();
    }

    @Then("user received POST HTTP responses code {int} for login")
    public void userReceivedPOSTHTTPResponsesCodeForLogin(int arg0) {
        login.validateHTTPResponseCode404WithInvalidEndpointForLogin();
    }

    @When("user send POST HTTP request for login with empty email and password")
    public void userSendPOSTHTTPRequestForLoginWithEmailAndPassword() {
        login.sendPOSTHTTPRequestForLoginWithEmptyEmailAndPassword();
    }

    @Then("user received POST HTTP response code {int} bad request for login")
    public void userReceivedPOSTHTTPResponseCode400BadRequestForLogin(int arg0) {
        login.validateHTTPResponseCode400BadRequestForLogin();
    }

    @When("user send POST HTTP request for login with input invalid email and password")
    public void userSendPOSTHTTPRequestForLoginWithInputInvalidEmailAndPassword() {
        login.sendPOSTHTTPRequestForLoginWithInputInvalidEmailAndPassword();
    }
}
