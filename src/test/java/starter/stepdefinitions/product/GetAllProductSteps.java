package starter.stepdefinitions.product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.GetAllProducts;

public class GetAllProductSteps {
    @Steps
    GetAllProducts getAllProducts;

    @Given("user set GET valid endpoint")
    public void userSetGETValidEndpoint() {
        getAllProducts.setGETValidEndpoint();
    }

    @When("user send GET HTTP request with valid endpoint")
    public void userSendGETHTTPRequestWithValidEndpoint() {
        getAllProducts.sendGETHTTPRequestWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code {int}")
    public void userReceivedValidGETHTTPResponseCode(int arg0) {
        getAllProducts.validateGETHTTPResponseCode200();
    }

    @Given("user set GET invalid endpoint")
    public void userSetGETInvalidEndpoint() {
        getAllProducts.setGETInvalidEndpoint();
    }

    @When("user send GET HTTP request with invalid endpoint")
    public void userSendGETHTTPRequestWithInvalidEndpoint() {
        getAllProducts.sendGETHTTPRequestWithInvalidQueryEndpoint();
    }

    @Then("user received GET HTTP response code {int}")
    public void userReceivedGETHTTPResponseCode(int arg0) {
        getAllProducts.validateValidGETHTTPResponseCode404();
    }
}
