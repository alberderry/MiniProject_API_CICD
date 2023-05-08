package starter.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {
    public String ValidEndpointRegister = "https://altashop-api.fly.dev/api/auth/register";
    public String InvalidEndpointRegister = "https://altashop-api.fly.dev/api/auth/registered";

    @Step("User set POST valid endpoint for register")
    public String setPostValidEndpointForRegister(){
        return ValidEndpointRegister;
    }

    @Step("User POST HTTP request with valid endpoint for register")
    public void sendPOSTHTTPRequestWithValidEndpointForRegister(){
        int min = 1;
        int max = 1000000;
        int number = (int)Math.floor(Math.random() * (max - min + 1) + min);
        String email = "newuser1" + String.valueOf(number) + "@gmail.com";

        String body = "{\"email\": " + email + ",\n" +
                " \"password\": \"newuser1\" ,\n" +
                " \"fullname\": \"newuser 1\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForRegister());
    }

    @Step("User received POST HTTP response code 200 for register")
    public void validateHTTPResponseCode200ForRegister(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("User set POST invalid endpoint for register")
    public String setPostInvalidEndpointForRegister(){
        return InvalidEndpointRegister;
    }

    @Step("User send POST HTTP request with invalid endpoint for register")
    public void sendPOSTHTTPRequestWithInvalidEndpointForRegister(){
        String body = "{\"email\": \"newuser1@gmail.com\", \"password\": \"newuser1\", \"fullname\": \"newuser 1\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostInvalidEndpointForRegister());
    }

    @Step("User received POST HTTP responses code 404 for register")
    public void validateHTTPResponseCode404WithInvalidEndpointForRegister(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("User send POST HTTP request without request data for register")
    public void sendPOSTHTTPRequestWithoutReqDataForRegister(){
        String body = "{ }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForRegister());
    }

    @Step("User received POST HTTP response code 400 for register without request data")
    public void validateHTTPResponseCode400ForRegisterWithoutReqData(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
