package com.steps.serenity;

import static org.junit.Assert.assertTrue;

import com.pages.HeaderPage;

import net.thucydides.core.annotations.Step;

public class HeaderSteps {

	private HeaderPage headerPage;

	@Step
	public void navigate_to_login_page() {
		headerPage.go_to_login_page();
	}

	@Step
	public void navigate_to_search_page_page() {
		headerPage.go_to_search();
	}

	@Step
	public void global_header_elements_should_be_visible()
	{
		assertTrue(headerPage.login_is_visible());
	}

}
