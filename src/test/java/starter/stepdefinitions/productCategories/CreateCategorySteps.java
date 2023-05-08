package starter.stepdefinitions.productCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.productCategories.CreateCategory;

public class CreateCategorySteps {
    @Steps
    CreateCategory createCategory;
    @Given("user set POST valid endpoint for create a category")
    public void userSetPOSTValidEndpointForCreateACategory() {
        createCategory.setPostValidEndpointForCreateACategory();
    }

    @When("user send POST HTTP request for create a category")
    public void userSendPOSTHTTPRequestForCreateACategory() {
        createCategory.sendPOSTHTTPRequestForCreateACategory();
    }

    @Then("user received HTTP response code {int} for create a category")
    public void userReceivedHTTPResponseCodeForCreateACategory(int arg0) {
        createCategory.validateHTTPResponseCode200ForCreateACategory();
    }

    @Given("user set POST invalid endpoint for create a category")
    public void userSetPOSTInvalidEndpointForCreateACategory() {
        createCategory.setPostInvalidEndpointForCreateACategory();
    }

    @When("user send POST HTTP request with invalid endpoint for create a category")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForCreateACategory() {
        createCategory.sendPOSTHTTPRequestWithInvalidEndpointForCreateACategory();
    }

    @Then("user received POST HTTP response code {int} for create a category")
    public void userReceivedPOSTHTTPResponseCodeForCreateACategory(int arg0) {
        createCategory.validatePOSTHTTPResponseCode404ForCreateACategory();
    }

    @When("user send POST HTTP request for create a category without request data")
    public void userSendPOSTHTTPRequestForCreateACategoryWithoutRequestData() {
        createCategory.sendPOSTHTTPRequestForCreateACategoryWithoutRequestData();
    }

    @Then("user received HTTP response code {int} for create a category without request data")
    public void userReceivedHTTPResponseCodeForCreateACategoryWithoutRequestData(int arg0) {
        createCategory.validateHTTPResponseCode500ForCreateACategory();
    }

    @And("user received valid data for new category")
    public void userReceivedValidDataForNewCategory() {
        createCategory.validateValidDataForNewCategory();
    }
}
