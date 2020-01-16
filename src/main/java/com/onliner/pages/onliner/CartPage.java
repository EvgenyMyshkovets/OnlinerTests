package com.onliner.pages.onliner;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends MainPage {
    @FindBy (xpath = "//div[@class='cart-form__title cart-form__title_big-alter']")
    private WebElementFacade cartTitle;

    @FindBy (xpath = "//div[contains(@class, 'cart-form__description_condensed-other')]/a")
    private WebElementFacade productInCartTitle;

    public void verifyCartPageAppears() {
        cartTitle.shouldBeVisible();
    }

    public String verifyCartPageContainRightItem(String productNameInGallery) {
        return productInCartTitle.getText();
    }
}