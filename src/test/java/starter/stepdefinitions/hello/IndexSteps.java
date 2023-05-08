package starter.stepdefinitions.hello;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.hello.Index;

public class IndexSteps {
    @Steps
    Index index;
    @Given("user set GET valid endpoint for index")
    public void userSetGETValidEndpointForIndex() {
        index.setGETValidEndpointForIndex();
    }

    @When("user send GET HTTP request with valid endpoint for index")
    public void userSendGETHTTPRequestWithValidEndpointForIndex() {
        index.sendGETHTTPRequestWithValidEndpointForIndex();
    }

    @Then("user received valid GET HTTP response code {int} for index")
    public void userReceivedValidGETHTTPResponseCodeForIndex(int arg0) {
        index.validateGETHTTPResponseCode200ForIndex();
    }

    @Given("user set GET invalid endpoint for index")
    public void userSetGETInvalidEndpointForIndex() {
        index.setGETInvalidEndpointForIndex();
    }

    @When("user send GET HTTP request with invalid endpoint for index")
    public void userSendGETHTTPRequestWithInvalidEndpointForIndex() {
        index.sendGETHTTPRequestWithInvalidQueryEndpointForIndex();
    }

    @Then("user received GET HTTP response code {int} for index")
    public void userReceivedGETHTTPResponseCodeForIndex(int arg0) {
        index.validateValidGETHTTPResponseCode404ForIndex();
    }

    @And("user received valid data for index")
    public void userReceivedValidDataForIndex() {
        index.validateValidDataForIndex();
    }
}
