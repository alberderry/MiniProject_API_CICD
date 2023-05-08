package starter.stepdefinitions.productCategories;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.productCategories.DeleteCategory;

public class DeleteCategorySteps {
    @Steps
    DeleteCategory deleteCategory;
    @Given("user set DELETE valid endpoint for delete category")
    public void userSetDELETEValidEndpointForDeleteCategory() {
        deleteCategory.setDELETEValidEndpointForDeleteCategory();
    }

    @When("user send DELETE HTTP request with valid endpoint for delete category")
    public void userSendDELETEHTTPRequestWithValidEndpointForDeleteCategory() {
        deleteCategory.sendDELETEHTTPRequestWithValidEndpointForDeleteCategory();
    }

    @Then("user received DELETE HTTP response code {int} with valid endpoint for delete category")
    public void userReceivedDELETEHTTPResponseCodeWithValidEndpointForDeleteCategory(int arg0) {
        deleteCategory.validateDELETEResponsesCode200WithValidEndpointForDeleteCategory();
    }

    @Given("user set DELETE endpoint with invalid endpoint for delete category")
    public void userSetDELETEEndpointWithInvalidEndpointForDeleteCategory() {
        deleteCategory.setDELETEInvalidEndpointForDeleteCategory();
    }

    @When("user send DELETE HTTP request with invalid endpoint for delete category")
    public void userSendDELETEHTTPRequestWithInvalidEndpointForDeleteCategory() {
        deleteCategory.sendDELETEHTTPRequestWithInvalidEndpointForDeleteCategory();
    }

    @Then("user received DELETE HTTP response code {int} with invalid endpoint for delete category")
    public void userReceivedDELETEHTTPResponseCodeWithInvalidEndpointForDeleteCategory(int arg0) {
        deleteCategory.validateDELETEResponseCode404WithInvalidEndpointForDeleteCategory();
    }
}
