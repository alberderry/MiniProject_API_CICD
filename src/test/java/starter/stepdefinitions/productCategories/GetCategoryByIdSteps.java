package starter.stepdefinitions.productCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.productCategories.GetCategoryById;

public class GetCategoryByIdSteps {
    @Steps
    GetCategoryById getCategoryById;
    @Given("user set GET valid endpoint for category by ID")
    public void userSetGETValidEndpointForCategoryByID() {
        getCategoryById.setGETValidEndpointForCategoryByID();
    }

    @When("user send GET HTTP request with valid endpoint for category by ID")
    public void userSendGETHTTPRequestWithValidEndpointForCategoryByID() {
        getCategoryById.sendGETHTTPRequestWithValidEndpointForCategoryByID();
    }

    @Then("user received valid GET HTTP response code {int} for category by ID")
    public void userReceivedValidGETHTTPResponseCodeForCategoryByID(int arg0) {
        getCategoryById.validateGETHTTPResponseCode200ForCategoryByID();
    }

    @Given("user set GET invalid endpoint for category by ID")
    public void userSetGETInvalidEndpointForCategoryByID() {
        getCategoryById.setGETInvalidEndpointForCategoryByID();
    }

    @When("user send GET HTTP request with invalid endpoint for category by ID")
    public void userSendGETHTTPRequestWithInvalidEndpointForCategoryByID() {
        getCategoryById.sendGETHTTPRequestWithInvalidEndpointForCategoryByID();
    }

    @Then("user received GET HTTP response code {int} for category by ID")
    public void userReceivedGETHTTPResponseCodeForCategoryByID(int arg0) {
        getCategoryById.validateValidGETHTTPResponseCode404ForCategoryByID();
    }

    @And("user received valid data for category by ID")
    public void userReceivedValidDataForCategoryByID() {
        getCategoryById.validateValidDataForCategoryByID();
    }
}
