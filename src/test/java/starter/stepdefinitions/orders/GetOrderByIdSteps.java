package starter.stepdefinitions.orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.orders.GetOrderById;

public class GetOrderByIdSteps {
    @Steps
    GetOrderById getOrderById;
    @When("user set GET valid endpoint for order by ID")
    public void userSetGETValidEndpointForOrderByID() {
        getOrderById.setGETValidEndpointForOrderByID();
    }

    @And("user send GET HTTP request with valid endpoint for order by ID")
    public void userSendGETHTTPRequestWithValidEndpointForOrderByID() {
        getOrderById.sendGETHTTPRequestWithValidEndpointForOrderByID();
    }

    @Then("user received valid GET HTTP response code {int} for order by ID")
    public void userReceivedValidGETHTTPResponseCodeForOrderByID(int arg0) {
        getOrderById.validateGETHTTPResponseCode200ForOrderByID();
    }

    @When("user set GET invalid endpoint for order by ID")
    public void userSetGETInvalidEndpointForOrderByID() {
        getOrderById.setGETInvalidEndpointForOrderByID();
    }

    @And("user send GET HTTP request with invalid endpoint for order by ID")
    public void userSendGETHTTPRequestWithInvalidEndpointForOrderByID() {
        getOrderById.sendGETHTTPRequestWithInvalidQueryEndpointForOrderByID();
    }

    @Then("user received GET HTTP response code {int} for order by ID")
    public void userReceivedGETHTTPResponseCodeForOrderByID(int arg0) {
        getOrderById.validateValidGETHTTPResponseCode404ForOrderByID();
    }
}
