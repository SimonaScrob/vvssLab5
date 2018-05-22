package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(helpers.Constants.url)
public class HeaderPage extends PageObject {

	@FindBy(className = "icon-search")
	private WebElementFacade searchIcon;

	@FindBy(className = "icon-login")
	private WebElementFacade login;

	@FindBy(id = "login-link")
	private WebElementFacade loginLink;

	public void go_to_search() {
		searchIcon.click();
	}


	public void go_to_login_page() {
		login.waitUntilClickable();
		login.click();
		loginLink.waitUntilClickable();
		loginLink.click();
	}

	public Boolean login_is_visible() {
		return login.waitUntilVisible().isVisible();
	}


}
