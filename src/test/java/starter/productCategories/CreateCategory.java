package starter.productCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateCategory {
    public String ValidEndpointCreateCategory = "https://altashop-api.fly.dev/api/categories";
    public String InvalidEndpointCreateCategory = "https://altashop-api.fly.dev/api/category";

    @Step("user set POST valid endpoint for create a category")
    public String setPostValidEndpointForCreateACategory(){
        return ValidEndpointCreateCategory;
    }

    @Step("user send POST HTTP request for create a category")
    public void sendPOSTHTTPRequestForCreateACategory(){
        String body = "{ \"name\":\"gaming\", \"description\": \"for gaming purposes\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForCreateACategory());
    }

    @Step("user received HTTP response code 200 for create a category")
    public void validateHTTPResponseCode200ForCreateACategory(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set POST invalid endpoint for create a category")
    public String setPostInvalidEndpointForCreateACategory(){
        return InvalidEndpointCreateCategory;
    }

    @Step("user send POST HTTP request with invalid endpoint for create a category")
    public void sendPOSTHTTPRequestWithInvalidEndpointForCreateACategory(){
        String body = "{ \"name\":\"gaming\", \"description\": \"for gaming purposes\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostInvalidEndpointForCreateACategory());
    }

    @Step("user received POST HTTP response code 404 for create a category")
    public void validatePOSTHTTPResponseCode404ForCreateACategory(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("user send POST HTTP request for create a category without request data")
    public void sendPOSTHTTPRequestForCreateACategoryWithoutRequestData(){
        String body = "{ }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForCreateACategory());
    }

    @Step("received HTTP response code 400 for create a category")
    public void validateHTTPResponseCode500ForCreateACategory(){
        restAssuredThat(response -> response.statusCode(500));
    }
    @Step("received valid data for new category")
    public void validateValidDataForNewCategory(){
        restAssuredThat(response->response.body("data.Name",equalTo("gaming")));
        restAssuredThat(response->response.body("data.Description",equalTo("for gaming purposes")));
    }
}
