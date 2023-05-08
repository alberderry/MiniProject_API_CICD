package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.CreateCommentProduct;

public class CreateCommentProductSteps {
    @Steps
    CreateCommentProduct createCommentProduct;
    @When("user set POST valid endpoint for create comment product")
    public void userSetPOSTValidEndpointForCreateCommentProduct() {
        createCommentProduct.setPostValidEndpointForCreateCommentProduct();
    }

    @And("user send POST HTTP request for create comment product")
    public void userSendPOSTHTTPRequestForCreateCommentProduct() {
        createCommentProduct.sendPOSTHTTPRequestForCreateCommentProduct();
    }

    @Then("user received HTTP response code {int} for create comment product")
    public void userReceivedHTTPResponseCodeForCreateCommentProduct(int arg0) {
        createCommentProduct.validateHTTPResponseCode200ForCreateCommentProduct();
    }

    @When("user set POST invalid endpoint for create comment product")
    public void userSetPOSTInvalidEndpointForCreateCommentProduct() {
        createCommentProduct.setPostEndpointWithInvalidEndpointForCreateCommentProduct();
    }

    @And("user send POST HTTP request with invalid endpoint for create comment product")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForCreateCommentProduct() {
        createCommentProduct.sendPOSTHTTPRequestWithInvalidEndpointForCreateCommentProduct();
    }

    @Then("user received POST HTTP response code {int} for create comment product")
    public void userReceivedPOSTHTTPResponseCodeForCreateCommentProduct(int arg0) {
        createCommentProduct.validateHTTPResponseCode404WithInvalidEndpointForCreateCommentProduct();
    }

    @When("user send POST HTTP request for create comment product without request data")
    public void userSendPOSTHTTPRequestForCreateCommentProductWithEmptyRequestBody() {
        createCommentProduct.sendPOSTHTTPRequestWithEmptyRequestBodyForCreateCommentProduct();
    }

    @Then("user received HTTP response code {int} Internal Server Error for create comment product")
    public void userReceivedHTTPResponseCodeInternalServerErrorForCreateCommentProduct(int arg0) {
        createCommentProduct.validateHTTPResponseCode500InternalServerErrorWithEmptyRequestBodyForCreateCommentProduct();
    }
}
