package starter.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.AuthenticationAccount;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserInformation {
    public String ValidEndpointGetUserInformation = "https://altashop-api.fly.dev/api/auth/info";
    public String InvalidEndpointGetUserInformation = "https://altashop-api.fly.dev/api/auth//info";

    @Step("User set GET valid endpoint for user information")
    public String setGETValidEndpointForUserInformation(){
        return ValidEndpointGetUserInformation;
    }

    @Step("User send GET HTTP request with valid endpoint for user information")
    public void sendGETHTTPRequestWithValidEndpointForUserInformation(){
        SerenityRest.given().header("Authorization", "Bearer " + AuthenticationAccount.token).get(setGETValidEndpointForUserInformation());
    }

    @Step("User received valid GET HTTP response code 200 for user information")
    public void validateGETHTTPResponseCode200ForUserInformation(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("User set GET invalid endpoint for user information")
    public String setGETInvalidEndpointForUserInformation(){
        return InvalidEndpointGetUserInformation;
    }

    @Step("User send GET HTTP request with invalid endpoint for user information")
    public void sendGETHTTPRequestWithInvalidEndpointForUserInformation(){
        SerenityRest.given().header("Authorization", "Bearer " + AuthenticationAccount.token).get(setGETInvalidEndpointForUserInformation());
    }

    @Step("User received GET HTTP response code 404 for user information")
    public void validateValidGETHTTPResponseCode404ForUserInformation(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
