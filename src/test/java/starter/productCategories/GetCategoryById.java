package starter.productCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetCategoryById {
    public String ValidEndpointGetCategoryById = "https://altashop-api.fly.dev/api/categories/13617";
    public String InvalidEndpointGetCategoryById = "https://altashop-api.fly.dev/api/category/10212";

    @Step("user set GET valid endpoint for category by ID")
    public String setGETValidEndpointForCategoryByID(){
        return ValidEndpointGetCategoryById;
    }

    @Step("user send GET HTTP request with valid endpoint for category by ID")
    public void sendGETHTTPRequestWithValidEndpointForCategoryByID(){
        SerenityRest.given().get(setGETValidEndpointForCategoryByID());
    }

    @Step("user received valid GET HTTP response code 200 for category by ID")
    public void validateGETHTTPResponseCode200ForCategoryByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint for category by ID")
    public String setGETInvalidEndpointForCategoryByID(){
        return InvalidEndpointGetCategoryById;
    }

    @Step("user send GET HTTP request with invalid endpoint for category by ID")
    public void sendGETHTTPRequestWithInvalidEndpointForCategoryByID(){
        SerenityRest.given().get(setGETInvalidEndpointForCategoryByID());
    }

    @Step("received GET HTTP response code 404 for category by ID")
    public void validateValidGETHTTPResponseCode404ForCategoryByID(){
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("received valid data for category by ID")
    public void validateValidDataForCategoryByID(){
        restAssuredThat(response->response.body("data.Name",equalTo("gaming")));
        restAssuredThat(response->response.body("data.Description",equalTo("for gaming purposes")));
    }
}
