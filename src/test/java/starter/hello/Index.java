package starter.hello;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Index {
    public String ValidEndpointIndex = "https://altashop-api.fly.dev/api/hello";
    public String InvalidEndpointIndex = "https://altashop-api.fly.dev/api//hello";

    @Step("User set GET valid endpoint for index")
    public String setGETValidEndpointForIndex(){
        return ValidEndpointIndex;
    }

    @Step("User send GET HTTP request with valid endpoint for index")
    public void sendGETHTTPRequestWithValidEndpointForIndex(){
        SerenityRest.given().get(setGETValidEndpointForIndex());
    }

    @Step("user received valid GET HTTP response code 200 for index")
    public void validateGETHTTPResponseCode200ForIndex(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint for index")
    public String setGETInvalidEndpointForIndex(){
        return InvalidEndpointIndex;
    }

    @Step("user send GET HTTP request with invalid endpoint for index")
    public void sendGETHTTPRequestWithInvalidQueryEndpointForIndex(){
        SerenityRest.given().get(setGETInvalidEndpointForIndex());
    }

    @Step("user received GET HTTP response code 404 for index")
    public void validateValidGETHTTPResponseCode404ForIndex(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("user received valid data for index")
    public void validateValidDataForIndex(){
        restAssuredThat(response->response.body("'data'",equalTo("hello")));
    }
}
