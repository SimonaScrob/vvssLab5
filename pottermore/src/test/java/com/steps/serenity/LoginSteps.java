package com.steps.serenity;

import com.pages.LoginPage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginSteps {

	private LoginPage loginPage;

	@Step
	public void make_login(String email, String password) {
		loginPage.type_email(email);
		loginPage.type_password(password);
		loginPage.make_login();
	}

    @Step
    public void login_with_wrong_credentials(String email, String password, String error_message) {
        make_login(email, password);
        assertTrue(loginPage.is_login_error_message_visible());
        assertTrue(loginPage.get_login_error_message().contains(error_message));
    }

    @Step
    public void login_with_good_credentials(String email, String password) {
        make_login(email, password);
        assertFalse(loginPage.is_login_error_message_visible());
        assertTrue(loginPage.is_logout_visible());
    }
}
