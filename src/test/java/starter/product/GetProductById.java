package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetProductById {
    public String ValidEndpointGetProductById = "https://altashop-api.fly.dev/api/products/13538";
    public String InvalidEndpointGetProductById = "https://altashop-api.fly.dev/api/product/11289";

    @Step("user set GET valid endpoint for product by ID")
    public String setGETValidEndpointForProductByID(){
        return ValidEndpointGetProductById;
    }

    @Step("user send GET HTTP request with valid endpoint for product by ID")
    public void sendGETHTTPRequestWithValidEndpointForProductByID(){
        SerenityRest.given().get(setGETValidEndpointForProductByID());
    }

    @Step("user received valid GET HTTP response code 200 for product by ID")
    public void validateGETHTTPResponseCode200ForProductByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint for product by ID")
    public String setGETInvalidEndpointForProductByID(){
        return InvalidEndpointGetProductById;
    }

    @Step("user send GET HTTP request with invalid endpoint for product by ID")
    public void sendGETHTTPRequestWithInvalidEndpointForProductByID(){
        SerenityRest.given().get(setGETInvalidEndpointForProductByID());
    }

    @Step("user received GET HTTP response code 404 for product by ID")
    public void validateValidGETHTTPResponseCode404ForProductByID(){
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("user received valid data for product by ID")
    public void validateValidDataForProductByID(){
        restAssuredThat(response->response.body("data.Name",equalTo("Sony PS5")));
        restAssuredThat(response->response.body("data.Description",equalTo("play has no limits")));
        restAssuredThat(response->response.body("data.Price",equalTo(299)));
    }
}
