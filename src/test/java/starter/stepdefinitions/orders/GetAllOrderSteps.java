package starter.stepdefinitions.orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.orders.GetAllOrder;

public class GetAllOrderSteps {
    @Steps
    GetAllOrder getAllOrder;
    @When("user set GET valid endpoint for all orders")
    public void userSetGETValidEndpointForAllOrders() {
        getAllOrder.setGETValidEndpointForAllOrders();
    }

    @And("user send GET HTTP request with valid endpoint for all orders")
    public void userSendGETHTTPRequestWithValidEndpointForAllOrders() {
        getAllOrder.sendGETHTTPRequestWithValidEndpointForAllOrders();
    }

    @Then("user received valid GET HTTP response code {int} for all orders")
    public void userReceivedValidGETHTTPResponseCodeForAllOrders(int arg0) {
        getAllOrder.validateGETHTTPResponseCode200ForAllOrders();
    }

    @When("user set GET invalid endpoint for all orders")
    public void userSetGETInvalidEndpointForAllOrders() {
        getAllOrder.setGETInvalidEndpointForAllOrders();
    }

    @And("user send GET HTTP request with invalid endpoint for all orders")
    public void userSendGETHTTPRequestWithInvalidEndpointForAllOrders() {
        getAllOrder.sendGETHTTPRequestWithInvalidQueryEndpointForAllOrders();
    }

    @Then("user received GET HTTP response code {int} for all orders")
    public void userReceivedGETHTTPResponseCodeForAllOrders(int arg0) {
        getAllOrder.validateValidGETHTTPResponseCode404ForAllOrders();
    }
}
