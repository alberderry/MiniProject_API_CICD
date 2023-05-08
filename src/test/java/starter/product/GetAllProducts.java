package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProducts {
    public String ValidEndpointGetAllOrder = "https://altashop-api.fly.dev/api/products";
    public String InvalidEndpointGetAllOrder = "https://altashop-api.fly.dev/api/product";

    @Step("user set GET valid endpoint")
    public String setGETValidEndpoint(){
        return ValidEndpointGetAllOrder;
    }

    @Step("user send GET HTTP request with valid endpoint")
    public void sendGETHTTPRequestWithValidEndpoint(){
        SerenityRest.given().get(setGETValidEndpoint());
    }

    @Step("user received valid GET HTTP response code 200")
    public void validateGETHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user GET invalid endpoint")
    public String setGETInvalidEndpoint(){
        return InvalidEndpointGetAllOrder;
    }

    @Step("user send GET HTTP request with invalid endpoint")
    public void sendGETHTTPRequestWithInvalidQueryEndpoint(){
        SerenityRest.given().get(setGETInvalidEndpoint());
    }

    @Step("user received GET HTTP response code 404")
    public void validateValidGETHTTPResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
