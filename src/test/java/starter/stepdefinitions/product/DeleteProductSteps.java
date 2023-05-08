package starter.stepdefinitions.product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.DeleteProduct;

public class DeleteProductSteps {
    @Steps
    DeleteProduct deleteProduct;

    @Given("user set DELETE valid endpoint")
    public void userSetDELETEValidEndpoint() {
        deleteProduct.setDELETEValidEndpoint();
    }

    @When("user send DELETE HTTP request with valid endpoint")
    public void userSendDELETEHTTPRequestWithValidEndpoint() {
        deleteProduct.sendDELETEHTTPRequestWithValidEndpoint();
    }

    @Then("user received DELETE HTTP response code {int} with valid endpoint")
    public void userReceivedDELETEHTTPResponseCodeWithValidEndpoint(int arg0) {
        deleteProduct.validateDELETEResponsesCode200WithValidEndpoint();
    }

    @Given("user set DELETE endpoint with invalid endpoint")
    public void userSetDELETEEndpointWithInvalidEndpoint() {
        deleteProduct.setDELETEInvalidEndpoint();
    }

    @When("user send DELETE HTTP request with invalid endpoint")
    public void userSendDELETEHTTPRequestWithInvalidEndpoint() {
        deleteProduct.sendDELETEHTTPRequestWithInvalidEndpoint();
    }

    @Then("user received DELETE HTTP response code {int} with invalid endpoint")
    public void userReceivedDELETEHTTPResponseCodeWithInvalidEndpoint(int arg0) {
        deleteProduct.validateDELETEResponseCode404WithInvalidEndpoint();
    }
}
