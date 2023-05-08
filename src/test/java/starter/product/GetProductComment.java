package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductComment {
    public String ValidEndpointGetProductComment = "https://altashop-api.fly.dev/api/products/3/comments";
    public String InvalidEndpointGetProductComment = "https://altashop-api.fly.dev/api/products/3/comment";

    @Step("user set GET valid endpoint for get product comments")
    public String setGETValidEndpointForGetProductComments(){
        return ValidEndpointGetProductComment;
    }

    @Step("user send GET HTTP request for get product comments with valid endpoint")
    public void sendGETHTTPRequestForGetProductCommentsWithValidEndpoint(){
        SerenityRest.given().get(setGETValidEndpointForGetProductComments());
    }

    @Step("user received valid GET HTTP response code 200 for get product comments")
    public void validateGETHTTPResponseCode200ForGetProductComments(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint for get product comments")
    public String setGETInvalidEndpointForGetProductComments(){
        return InvalidEndpointGetProductComment;
    }

    @Step("user send GET HTTP request for get product comments with invalid endpoint")
    public void sendGETHTTPRequestForGetProductCommentsWithInvalidQueryEndpoint(){
        SerenityRest.given().get(setGETInvalidEndpointForGetProductComments());
    }

    @Step("user received GET HTTP response code 404 for get product comments")
    public void validateValidGETHTTPResponseCode404ForGetProductComments(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
