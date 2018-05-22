package com.steps.serenity;

import com.pages.GlobalNavigationPage;

import net.thucydides.core.annotations.Step;

public class NavigationSteps {
	
	GlobalNavigationPage navigationPage;
	
	@Step
    public void navigate_to_homepage() {
		navigationPage.open();
    }
}
