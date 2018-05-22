package com.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl(helpers.Constants.url)
public class LoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade email;

    @FindBy(id = "password")
    private WebElementFacade password;

    @FindBy(className = "form__button--label")
    private WebElementFacade loginBtn;

    @FindBy(id = "loginError")
    private WebElementFacade errorMessage;

    @FindBy(id = "logoutLink")
    private WebElementFacade logoutLink;

    public void type_email(String keyword) {
        email.type(keyword);
    }

    public void type_password(String keyword) {
        password.type(keyword);
    }

    public void make_login() {
        loginBtn.waitUntilClickable();
        loginBtn.click();
    }

    public boolean is_login_error_message_visible() {
        return errorMessage.isVisible();
    }

    public String get_login_error_message() {
        return errorMessage.getText();
    }

    public boolean is_logout_visible() {
        return logoutLink.isVisible();
    }

    public Boolean login_btn_is_visible() {
        return loginBtn.waitUntilVisible().isVisible();
    }

    public Boolean email_is_visible() {
        return email.waitUntilVisible().isVisible();
    }

    public Boolean password_is_visible() {
        return password.waitUntilVisible().isVisible();
    }
}
