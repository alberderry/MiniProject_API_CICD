package starter;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class AuthenticationAccount {
    public static String email = "newuser1@gmail.com";
    public static String password = "newuser1";

    public String EndpointAuth = "https://altashop-api.fly.dev/api/auth/login";
    public static String token = "";

    @Step("user set authentication endpoint")
    public String userSetAuthenticationEndpoint(){
        return EndpointAuth;
    }

    @Step("user send authentication endpoint")
    public void sendAuthenticationEndpoint(){
        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(userSetAuthenticationEndpoint());
        token = lastResponse().getBody().jsonPath().get("data");
    }
}
