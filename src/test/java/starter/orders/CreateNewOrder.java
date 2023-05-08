package starter.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.AuthenticationAccount;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateNewOrder {
    public String ValidEndpointCreateNewOrder = "https://altashop-api.fly.dev/api/orders";
    public String InvalidEndpointCreateNewOrder = "https://altashop-api.fly.dev/api/order";

    @Step("user set POST valid endpoint for create new order")
    public String setPostValidEndpointForCreateNewOrder(){
        return ValidEndpointCreateNewOrder;
    }

    @Step("user send POST HTTP request with valid endpoint for create new order")
    public void sendPOSTHTTPRequestForCreateNewOrder(){
        String body = "{\n" +
                "        \"product_id\":11788,\n" +
                "        \"quantity\":1\n" +
                "    }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + AuthenticationAccount.token).contentType("application/json").body("[\n"+reqBody.toString()+"\n]").post(setPostValidEndpointForCreateNewOrder());
    }

    @Step("user received HTTP response code 200 for create new order")
    public void validateHTTPResponseCode200ForCreateNewOrder(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set POST endpoint with invalid endpoint for create new order")
    public String setPostEndpointWithInvalidEndpointForCreateNewOrder(){
        return InvalidEndpointCreateNewOrder;
    }

    @Step("user send POST HTTP request with invalid endpoint for create new order")
    public void sendPOSTHTTPRequestWithInvalidEndpointForCreateNewOrder(){
        String body = "{\n" +
                "        \"product_id\": 11788,\n" +
                "        \"quantity\":1\n" +
                "    }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + AuthenticationAccount.token).contentType("application/json").body("[\n"+reqBody.toString()+"\n]").post(setPostEndpointWithInvalidEndpointForCreateNewOrder());
    }

    @Step("user received HTTP response code 404 with invalid endpoint for create new order")
    public void validateHTTPResponseCode404WithInvalidEndpointForCreateNewOrder(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("user send POST HTTP request without request data for create new order")
    public void sendPOSTHTTPRequestWithEmptyRequestBodyForCreateNewOrder(){
        String body = "{ }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + AuthenticationAccount.token).contentType("application/json").body("[\n"+reqBody.toString()+"\n]").post(setPostValidEndpointForCreateNewOrder());
    }
}
