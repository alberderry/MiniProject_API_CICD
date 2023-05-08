package starter.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.AuthenticationAccount;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllOrder {
    public String ValidEndpointGetAllOrders = "https://altashop-api.fly.dev/api/orders";
    public String InvalidEndpointGetAllOrders = "https://altashop-api.fly.dev/api/order";

    @Step("set GET valid endpoint for all orders")
    public String setGETValidEndpointForAllOrders(){
        return ValidEndpointGetAllOrders;
    }

    @Step("send GET HTTP request with valid endpoint for all orders")
    public void sendGETHTTPRequestWithValidEndpointForAllOrders(){
        SerenityRest.given().header("Authorization", "Bearer " + AuthenticationAccount.token).get(setGETValidEndpointForAllOrders());
    }

    @Step("received valid GET HTTP response code 200 for all orders")
    public void validateGETHTTPResponseCode200ForAllOrders(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set GET invalid endpoint for all orders")
    public String setGETInvalidEndpointForAllOrders(){
        return InvalidEndpointGetAllOrders;
    }

    @Step("send GET HTTP request with invalid endpoint for all orders")
    public void sendGETHTTPRequestWithInvalidQueryEndpointForAllOrders(){
        SerenityRest.given().header("Authorization", "Bearer " + AuthenticationAccount.token).get(setGETInvalidEndpointForAllOrders());
    }

    @Step("received GET HTTP response code 404 for all orders")
    public void validateValidGETHTTPResponseCode404ForAllOrders(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
