package starter.stepdefinitions.productCategories;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.productCategories.GetAllCategories;

public class GetAllCategoriesSteps {
    @Steps
    GetAllCategories getAllCategories;
    @Given("user set GET valid endpoint for all categories")
    public void userSetGETValidEndpointForAllCategories() {
        getAllCategories.setGETValidEndpointForAllCategories();
    }

    @When("user send GET HTTP request with valid endpoint for all categories")
    public void userSendGETHTTPRequestWithValidEndpointForAllCategories() {
        getAllCategories.sendGETHTTPRequestWithValidEndpointForAllCategories();
    }

    @Then("user received valid GET HTTP response code {int} for all categories")
    public void userReceivedValidGETHTTPResponseCodeForAllCategories(int arg0) {
        getAllCategories.validateGETHTTPResponseCode200ForAllCategories();
    }

    @Given("user set GET invalid endpoint for all categories")
    public void userSetGETInvalidEndpointForAllCategories() {
        getAllCategories.setGETInvalidEndpointForAllCategories();
    }

    @When("user send GET HTTP request with invalid endpoint for all categories")
    public void userSendGETHTTPRequestWithInvalidEndpointForAllCategories() {
        getAllCategories.sendGETHTTPRequestWithInvalidEndpointForAllCategories();
    }

    @Then("user received GET HTTP response code {int} for all categories")
    public void userReceivedGETHTTPResponseCodeForAllCategories(int arg0) {
        getAllCategories.validateValidGETHTTPResponseCode404ForAllCategories();
    }
}
