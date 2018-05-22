package com.steps.serenity;

import com.pages.HeaderPage;
import com.pages.SearchPage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.*;

public class SearchSteps {

	private HeaderPage headerPage;

	private SearchPage searchPage;

	@Step
	public void make_search(String keyword) {
		searchPage.set_search_text(keyword);
	}

	@Step
	public void valid_search_term(String keyword, String errorMessage) {
		make_search(keyword);
		assertFalse(searchPage.getNoPostFoundError().contains(errorMessage));
	}

	@Step
	public void invalid_search_term(String keyword, String errorMessage) {
		make_search(keyword);
		assertTrue(searchPage.getNoPostFoundError().contains(errorMessage));
	}
}
