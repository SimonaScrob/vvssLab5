package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage extends PageObject {

    @FindBy(xpath = "//INPUT[contains(@class, 'suggestor__input') and contains(@class, 'ais-search-box--input')]")
    private WebElementFacade searchBox;

    @FindBy(xpath = "//DIV[contains(@class, 'ais-stats--body') and contains(@class, 'ais-body')]/DIV")
    private WebElementFacade nothingFound;

    public void set_search_text(String keyword) {
        searchBox.typeAndEnter(keyword);
    }

    public String getNoPostFoundError()
    {
        nothingFound.waitUntilVisible();
        return nothingFound.getText();
    }
}
