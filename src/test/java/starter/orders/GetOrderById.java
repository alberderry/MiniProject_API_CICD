package starter.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.AuthenticationAccount;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetOrderById {
    public String ValidEndpointGetOrderByID = "https://altashop-api.fly.dev/api/orders/11031";
    public String InvalidEndpointGetOrderByID = "https://altashop-api.fly.dev/api/order/9827";

    @Step("user set GET valid endpoint for order by ID")
    public String setGETValidEndpointForOrderByID(){
        return ValidEndpointGetOrderByID;
    }

    @Step("user send GET HTTP request with valid endpoint for order by ID")
    public void sendGETHTTPRequestWithValidEndpointForOrderByID(){
        SerenityRest.given().header("Authorization", "Bearer " + AuthenticationAccount.token).get(setGETValidEndpointForOrderByID());
    }

    @Step("user received valid GET HTTP response code 200 for order by ID")
    public void validateGETHTTPResponseCode200ForOrderByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint for order by ID")
    public String setGETInvalidEndpointForOrderByID(){
        return InvalidEndpointGetOrderByID;
    }

    @Step("user send GET HTTP request with invalid endpoint for order by ID")
    public void sendGETHTTPRequestWithInvalidQueryEndpointForOrderByID(){
        SerenityRest.given().header("Authorization", "Bearer " + AuthenticationAccount.token).get(setGETInvalidEndpointForOrderByID());
    }

    @Step("user received GET HTTP response code 404 for order by ID")
    public void validateValidGETHTTPResponseCode404ForOrderByID(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
