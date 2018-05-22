package com.tests;

import com.steps.serenity.HeaderSteps;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.NavigationSteps;
import com.steps.serenity.SearchSteps;
import helpers.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    private SearchSteps searchSteps;

    @Steps
    private NavigationSteps navigationSteps;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private HeaderSteps headerSteps;

    @Test
    public void search() {
        navigationSteps.navigate_to_homepage();
        headerSteps.navigate_to_search_page_page();
        searchSteps.valid_search_term(
                Constants.search_keyword,
                Constants.error_message_invalid_search_keyword);
    }

    @Test
    public void invalid_search() {
        navigationSteps.navigate_to_homepage();
        headerSteps.navigate_to_search_page_page();
        searchSteps.invalid_search_term(
                Constants.invalid_search_keyword,
                Constants.error_message_invalid_search_keyword);
    }
}
