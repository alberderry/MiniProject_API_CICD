package starter.productCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCategory {
    public String ValidEndpoint = "https://altashop-api.fly.dev/api/categories/1";
    public String InvalidEndpoint = "https://altashop-api.fly.dev/api/category/1";

    @Step("user set DELETE valid endpoint for delete category")
    public String setDELETEValidEndpointForDeleteCategory(){
        return ValidEndpoint;
    }
    @Step("user send DELETE HTTP request with valid endpoint for delete category")
    public void sendDELETEHTTPRequestWithValidEndpointForDeleteCategory(){
        SerenityRest.given().delete(setDELETEValidEndpointForDeleteCategory());
    }
    @Step("user received DELETE HTTP response code 200 with valid endpoint for delete category")
    public void validateDELETEResponsesCode200WithValidEndpointForDeleteCategory(){
        restAssuredThat(responses -> responses.statusCode(200));
    }

    @Step("user set DELETE invalid endpoint for delete category")
    public String setDELETEInvalidEndpointForDeleteCategory(){
        return InvalidEndpoint;
    }
    @Step("user send DELETE HTTP request with invalid endpoint for delete category")
    public void sendDELETEHTTPRequestWithInvalidEndpointForDeleteCategory(){
        SerenityRest.given().delete(setDELETEInvalidEndpointForDeleteCategory());
    }
    @Step("user received DELETE HTTP response code 404 with invalid endpoint for delete category")
    public void validateDELETEResponseCode404WithInvalidEndpointForDeleteCategory(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
