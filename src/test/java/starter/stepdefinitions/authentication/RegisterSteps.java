package starter.stepdefinitions.authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.authentication.Register;

public class RegisterSteps {
    @Steps
    Register register;
    @Given("User set POST valid endpoint for register")
    public void userSetPOSTValidEndpointForRegister() {
        register.setPostValidEndpointForRegister();
    }

    @When("User send POST HTTP request with valid endpoint for register")
    public void userSendPOSTHTTPRequestWithValidEndpointForRegister() {
        register.sendPOSTHTTPRequestWithValidEndpointForRegister();
    }

    @Then("User received POST HTTP response code {int} for register")
    public void userReceivedPOSTHTTPResponseCodeForRegister(int arg0) {
        register.validateHTTPResponseCode200ForRegister();
    }

    @Given("User set POST invalid endpoint for register")
    public void userSetPOSTInvalidEndpointForRegister() {
        register.setPostInvalidEndpointForRegister();
    }

    @When("User send POST HTTP request with invalid endpoint for register")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForRegister() {
        register.sendPOSTHTTPRequestWithInvalidEndpointForRegister();
    }

    @Then("User received POST HTTP responses code {int} for register")
    public void userReceivedPOSTHTTPResponsesCodeForRegister(int arg0) {
        register.validateHTTPResponseCode404WithInvalidEndpointForRegister();
    }

    @When("User send POST HTTP request without req data for register")
    public void userSendPOSTHTTPRequestWithoutReqDataForRegister() {
        register.sendPOSTHTTPRequestWithoutReqDataForRegister();
    }

    @Then("User received POST HTTP response code {int} for register without request data")
    public void userReceivedPOSTHTTPResponseCodeForRegisterWithEmptyRequestBody(int arg0) {
        register.validateHTTPResponseCode400ForRegisterWithoutReqData();
    }
}
