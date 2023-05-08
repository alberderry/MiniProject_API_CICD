package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProduct {
    public String ValidEndpointDeleteProduct = "https://altashop-api.fly.dev/api/products/1";
    public String InvalidEndpointDeleteProduct = "https://altashop-api.fly.dev/api/product/1";

    @Step("user set DELETE valid endpoint")
    public String setDELETEValidEndpoint(){
        return ValidEndpointDeleteProduct;
    }
    @Step("user send DELETE HTTP request with valid endpoint")
    public void sendDELETEHTTPRequestWithValidEndpoint(){
        SerenityRest.given().delete(setDELETEValidEndpoint());
    }
    @Step("user received DELETE HTTP response code 200 with valid endpoint")
    public void validateDELETEResponsesCode200WithValidEndpoint(){
        restAssuredThat(responses -> responses.statusCode(200));
    }

    @Step("user set DELETE invalid endpoint")
    public String setDELETEInvalidEndpoint(){
        return InvalidEndpointDeleteProduct;
    }
    @Step("user send DELETE HTTP request with invalid endpoint")
    public void sendDELETEHTTPRequestWithInvalidEndpoint(){
        SerenityRest.given().delete(setDELETEInvalidEndpoint());
    }
    @Step("user received DELETE HTTP response code 404 with invalid endpoint")
    public void validateDELETEResponseCode404WithInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
