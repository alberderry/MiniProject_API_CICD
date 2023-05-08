package starter.productCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategories {
    public String ValidEndpointGetAllCategory = "https://altashop-api.fly.dev/api/categories";
    public String InvalidEndpointGetAllCategory = "https://altashop-api.fly.dev/api/category";

    @Step("user set GET valid endpoint for all categories")
    public String setGETValidEndpointForAllCategories(){
        return ValidEndpointGetAllCategory;
    }

    @Step("user send GET HTTP request with valid endpoint for all categories")
    public void sendGETHTTPRequestWithValidEndpointForAllCategories(){
        SerenityRest.given().get(setGETValidEndpointForAllCategories());
    }

    @Step("user received valid GET HTTP response code 200 for all categories")
    public void validateGETHTTPResponseCode200ForAllCategories(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint for all categories")
    public String setGETInvalidEndpointForAllCategories(){
        return InvalidEndpointGetAllCategory;
    }

    @Step("user send GET HTTP request with invalid endpoint for all categories")
    public void sendGETHTTPRequestWithInvalidEndpointForAllCategories(){
        SerenityRest.given().get(setGETInvalidEndpointForAllCategories());
    }

    @Step("user received GET HTTP response code 404 for all categories")
    public void validateValidGETHTTPResponseCode404ForAllCategories(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
