package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.HeaderSteps;
import com.steps.serenity.NavigationSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class LandingPageValidationTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	private HeaderSteps headerSteps;

	@Steps
	private NavigationSteps navigationSteps;

	@Test
	public void global_header_test() {
		navigationSteps.navigate_to_homepage();
		headerSteps.global_header_elements_should_be_visible();
	}

}
