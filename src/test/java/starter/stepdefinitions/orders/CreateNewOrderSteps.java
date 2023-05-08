package starter.stepdefinitions.orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.orders.CreateNewOrder;

public class CreateNewOrderSteps {
    @Steps
    CreateNewOrder createNewOrder;
    @When("user set POST valid endpoint for create new order")
    public void userSetPOSTValidEndpointForCreateNewOrder() {
        createNewOrder.setPostValidEndpointForCreateNewOrder();
    }

    @And("user send POST HTTP request for create new order")
    public void userSendPOSTHTTPRequestForCreateNewOrder() {
        createNewOrder.sendPOSTHTTPRequestForCreateNewOrder();
    }

    @Then("user received HTTP response code {int} for create new order")
    public void userReceivedHTTPResponseCodeForCreateNewOrder(int arg0) {
        createNewOrder.validateHTTPResponseCode200ForCreateNewOrder();
    }

    @When("user set POST invalid endpoint for create new order")
    public void userSetPOSTInvalidEndpointForCreateNewOrder() {
        createNewOrder.setPostEndpointWithInvalidEndpointForCreateNewOrder();
    }

    @And("user send POST HTTP request with invalid endpoint for create new order")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForCreateNewOrder() {
        createNewOrder.sendPOSTHTTPRequestWithInvalidEndpointForCreateNewOrder();
    }

    @Then("user received POST HTTP response code {int} for create new order")
    public void userReceivedPOSTHTTPResponseCodeForCreateNewOrder(int arg0) {
        createNewOrder.validateHTTPResponseCode404WithInvalidEndpointForCreateNewOrder();
    }

    @And("user send POST HTTP request for create new order without request data")
    public void userSendPOSTHTTPRequestForCreateNewOrderWithEmptyRequestBody() {
        createNewOrder.sendPOSTHTTPRequestWithEmptyRequestBodyForCreateNewOrder();
    }
}
