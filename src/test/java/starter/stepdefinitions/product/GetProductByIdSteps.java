package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.GetProductById;

public class GetProductByIdSteps {
    @Steps
    GetProductById getProductById;

    @Given("user set GET valid endpoint for product by ID")
    public void userSetGETValidEndpointForProductByID() {
        getProductById.setGETValidEndpointForProductByID();
    }

    @When("user send GET HTTP request with valid endpoint for product by ID")
    public void userSendGETHTTPRequestWithValidEndpointForProductByID() {
        getProductById.sendGETHTTPRequestWithValidEndpointForProductByID();
    }

    @Then("user received valid GET HTTP response code {int} for product by ID")
    public void userReceivedValidGETHTTPResponseCodeForProductByID(int arg0) {
        getProductById.validateGETHTTPResponseCode200ForProductByID();
    }

    @Given("user set GET invalid endpoint for product by ID")
    public void userSetGETInvalidEndpointForProductByID() {
        getProductById.setGETInvalidEndpointForProductByID();
    }

    @When("user send GET HTTP request with invalid endpoint for product by ID")
    public void userSendGETHTTPRequestWithInvalidEndpointForProductByID() {
        getProductById.sendGETHTTPRequestWithInvalidEndpointForProductByID();
    }

    @Then("user received GET HTTP response code {int} for product by ID")
    public void userReceivedGETHTTPResponseCodeForProductByID(int arg0) {
        getProductById.validateValidGETHTTPResponseCode404ForProductByID();
    }

    @And("user received valid data for product by ID")
    public void userReceivedValidDataForProductByID() {
        getProductById.validateValidDataForProductByID();
    }
}
