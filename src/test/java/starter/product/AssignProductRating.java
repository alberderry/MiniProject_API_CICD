package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.AuthenticationAccount;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AssignProductRating {
    public String ValidEndpointAssignProductRating = "https://altashop-api.fly.dev/api/products/13538/ratings";
    public String InvalidEndpointAssignProductRating = "https://altashop-api.fly.dev/api/products/12237/rating";
    public String EndpointProductAssignRatingWithoutReqData = "https://altashop-api.fly.dev/api/products/12893/ratings";

    @Step("user set POST valid endpoint for assign product rating")
    public String setPostValidEndpointForAssignProductRating(){
        return ValidEndpointAssignProductRating;
    }

    @Step("user send POST HTTP request with valid endpoint for assign product rating")
    public void sendPOSTHTTPRequestForAssignProductRating(){
        String body = "{ \"count\":\"4\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + AuthenticationAccount.token).contentType("application/json").body(reqBody.toString()).post(setPostValidEndpointForAssignProductRating());
    }

    @Step("user received HTTP response code 200 for assign product rating")
    public void validateHTTPResponseCode200ForAssignProductRating(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set POST endpoint with invalid endpoint for assign product rating")
    public String setPostEndpointWithInvalidEndpointForAssignProductRating(){
        return InvalidEndpointAssignProductRating;
    }

    @Step("user send POST HTTP request with invalid endpoint for assign product rating")
    public void sendPOSTHTTPRequestWithInvalidEndpointForAssignProductRating(){
        String body = "{ \"count\":\"4\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + AuthenticationAccount.token).contentType("application/json").body(reqBody.toString()).post(setPostEndpointWithInvalidEndpointForAssignProductRating());
    }

    @Step("user received HTTP response code 404 with invalid endpoint for assign product rating")
    public void validateHTTPResponseCode404WithInvalidEndpointForAssignProductRating(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("user set POST valid endpoint without request data for assign product rating")
    public String setPostValidEndpointWithEmptyRequestBodyForAssignProductRating(){
        return EndpointProductAssignRatingWithoutReqData;
    }

    @Step("user send POST HTTP request without request data for assign product rating")
    public void sendPOSTHTTPRequestWithEmptyRequestBodyForAssignProductRating(){
        String body = "{ }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + AuthenticationAccount.token).contentType("application/json").body(reqBody.toString()).post(setPostValidEndpointWithEmptyRequestBodyForAssignProductRating());
    }

    @Step("user received HTTP response code 200 without request data for assign product rating")
    public void validateHTTPResponseCode200WithEmptyRequestBodyForAssignProductRating(){
        restAssuredThat(response -> response.statusCode(500));
    }
}
