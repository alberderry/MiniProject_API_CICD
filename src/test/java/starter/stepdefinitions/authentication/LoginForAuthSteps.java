package starter.stepdefinitions.authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.AuthenticationAccount;

public class LoginForAuthSteps {
    @Steps
    AuthenticationAccount authenticationAccount;
    @Given("User set authentication endpoint")
    public void userSetAuthenticationEndpoint() {
        authenticationAccount.userSetAuthenticationEndpoint();
    }

    @And("User send authentication endpoint")
    public void userSendAuthenticationEndpoint() {
        authenticationAccount.sendAuthenticationEndpoint();
    }
}
