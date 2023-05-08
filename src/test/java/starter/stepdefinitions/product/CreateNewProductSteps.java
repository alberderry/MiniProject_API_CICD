package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.CreateNewProduct;

public class CreateNewProductSteps {
    @Steps
    CreateNewProduct createNewProduct;

    @Given("user set POST valid endpoint")
    public void userSetPOSTValidEndpoint() {
        createNewProduct.setPostValidEndpoint();
    }

    @When("user send POST HTTP request")
    public void userSendPOSTHTTPRequest() {
        createNewProduct.sendPOSTHTTPRequest();
    }

    @Then("user received HTTP response code {int}")
    public void userReceivedHTTPResponseCode(int arg0) {
        createNewProduct.validateHTTPResponseCode200();
    }

    @Given("user set POST invalid endpoint")
    public void userSetPOSTInvalidEndpoint() {
        createNewProduct.setPostEndpointWithInvalidendpoint();
    }

    @When("user send POST HTTP request with invalid endpoint")
    public void userSendPOSTHTTPRequestWithInvalidEndpoint() {
        createNewProduct.sendPOSTHTTPRequestWithInvalidEndpoint();
    }

    @Then("user received POST HTTP response code {int}")
    public void userReceivedPOSTHTTPResponseCode(int arg0) {
        createNewProduct.validateHTTPResponseCode404WithInvalidEndpoint();
    }

    @When("user send POST HTTP request without request data")
    public void userSendPOSTHTTPRequestWithInputWithoutRequestData() {
        createNewProduct.sendPOSTHTTPRequestWithInputWithoutRequestData();
    }

    @Then("user received HTTP response code {int} without request data")
    public void userReceivedHTTPResponseCodeWithoutRequestData(int arg0) {
        createNewProduct.validateHTTPResponseCode500WithoutRequestData();
    }

    @And("user received valid data for new product")
    public void userReceivedValidDataForNewProduct() {
        createNewProduct.validateValidDataForNewProduct();
    }
}
