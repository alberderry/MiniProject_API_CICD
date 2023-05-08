package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class  GetProductRating {
    public String ValidEndpointGetProductRating = "https://altashop-api.fly.dev/api/products/1/ratings";
    public String InvalidEndpointGetProductRating = "https://altashop-api.fly.dev/api/products/1/rating";

    @Step("user set GET valid endpoint for get product ratings")
    public String setGETValidEndpointForGetProductRatings(){
        return ValidEndpointGetProductRating;
    }

    @Step("user send GET HTTP request for get product ratings with valid endpoint")
    public void sendGETHTTPRequestForGetProductRatingsWithValidEndpoint(){
        SerenityRest.given().get(setGETValidEndpointForGetProductRatings());
    }

    @Step("user received valid GET HTTP response code 200 for get product ratings")
    public void validateGETHTTPResponseCode200ForGetProductRatings(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint for get product ratings")
    public String setGETInvalidEndpointForGetProductRatings(){
        return InvalidEndpointGetProductRating;
    }

    @Step("user send GET HTTP request for get product ratings with invalid endpoint")
    public void sendGETHTTPRequestForGetProductRatingsWithInvalidQueryEndpoint(){
        SerenityRest.given().get(setGETInvalidEndpointForGetProductRatings());
    }

    @Step("user received GET HTTP response code 404 for get product ratings")
    public void validateValidGETHTTPResponseCode404ForGetProductRatings(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
