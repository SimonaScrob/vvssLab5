package com.tests;

import com.steps.serenity.*;
import helpers.Constants;
import io.vavr.collection.List;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    private HeaderSteps headerSteps;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private NavigationSteps navigationSteps;

    @Test
    public void test_good_credentials() {
        navigationSteps.navigate_to_homepage();
        headerSteps.navigate_to_login_page();
        loginSteps.login_with_good_credentials(
                Constants.email,
                Constants.password);
    }

    @Test
    public void test_wrong_credentials() {
        navigationSteps.navigate_to_homepage();
        headerSteps.navigate_to_login_page();
        loginSteps.login_with_wrong_credentials(
                Constants.wrong_email,
                Constants.wrong_password,
                Constants.error_message);
    }
}
