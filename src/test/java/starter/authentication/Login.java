package starter.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    public String ValidEndpointLogin = "https://altashop-api.fly.dev/api/auth/login";
    public String InvalidEndpointLogin = "https://altashop-api.fly.dev/api/auth//login";

    @Step("User set POST valid endpoint for login")
    public String setPostValidEndpointForLogin(){
        return ValidEndpointLogin;
    }

    @Step("User send POST HTTP request for login")
    public void sendPOSTHTTPRequestForLogin(){
        String body = "{\"email\":\"newuser1@gmail.com\", \"password\": \"newuser1\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("User received POST HTTP response code 200 for login")
    public void validateHTTPResponseCode200ForLogin(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("User set POST endpoint with invalid endpoint for login")
    public String setPostEndpointWithInvalidEndpointForLogin(){
        return InvalidEndpointLogin;
    }

    @Step("User send POST HTTP request with invalid endpoint for login")
    public void sendPOSTHTTPRequestWithInvalidEndpointForLogin(){
        String body = "{\"email\":\"newueser1@gmail.com\", \"password\": \"newuser1\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpointWithInvalidEndpointForLogin());
    }

    @Step("User received POST HTTP responses code 404 for login")
    public void validateHTTPResponseCode404WithInvalidEndpointForLogin(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("User POST HTTP request for login with empty email and password")
    public void sendPOSTHTTPRequestForLoginWithEmptyEmailAndPassword(){
        String body = "{\"email\":\"\", \"password\": \"\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("User POST HTTP response code 400 bad request for login")
    public void validateHTTPResponseCode400BadRequestForLogin(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("User send POST HTTP request for login with input invalid email and password")
    public void sendPOSTHTTPRequestForLoginWithInputInvalidEmailAndPassword(){
        String body = "{\"email\":\"newsuerrandom@gmail.com\", \"password\": \"newsuerrandom\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }
}
