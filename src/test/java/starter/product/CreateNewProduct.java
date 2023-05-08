package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateNewProduct {
    public String ValidEndpointCreateNewProduct = "https://altashop-api.fly.dev/api/products";
    public String InvalidEndpointCreateNewProduct = "https://altashop-api.fly.dev/api/product";

    @Step("user set POST valid endpoint")
    public String setPostValidEndpoint(){
        return ValidEndpointCreateNewProduct;
    }

    @Step("user send POST HTTP request with valid endpoint")
    public void sendPOSTHTTPRequest(){
        String body = "{ \"name\":\"Sony PS5\", \"description\": \"play has no limits\",\"price\":299,\"categories\":[1] }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpoint());
    }

    @Step("user received HTTP response code 200")
    public void validateHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set POST endpoint with invalid endpoint")
    public String setPostEndpointWithInvalidendpoint(){
        return InvalidEndpointCreateNewProduct;
    }

    @Step("user send POST HTTP request with invalid endpoint")
    public void sendPOSTHTTPRequestWithInvalidEndpoint(){
        String body = "{ \"name\":\"Sony PS5\", \"description\": \"play has no limits\",\"price\":299,\"categories\":[1] }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpointWithInvalidendpoint());
    }

    @Step("user received HTTP response code 404 with invalid endpoint")
    public void validateHTTPResponseCode404WithInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("user send POST HTTP request without request data")
    public void sendPOSTHTTPRequestWithInputWithoutRequestData(){
        String body = "{ }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpoint());
    }

    @Step("user received HTTP response code 500 without request data")
    public void validateHTTPResponseCode500WithoutRequestData(){
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("received valid data for new product")
    public void validateValidDataForNewProduct(){
        restAssuredThat(response->response.body("data.Name",equalTo("Sony PS5")));
        restAssuredThat(response->response.body("data.Description",equalTo("play has no limits")));
        restAssuredThat(response->response.body("data.Price",equalTo(299)));
    }
}
