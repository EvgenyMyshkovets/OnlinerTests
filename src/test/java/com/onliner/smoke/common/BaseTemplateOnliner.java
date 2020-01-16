package com.onliner.smoke.common;

import com.onliner.pages.onliner.catalog.gallery.GalleryPage;
import com.onliner.steps.onliner.CartPageSteps;
import com.onliner.steps.onliner.LoginPageSteps;
import com.onliner.steps.onliner.MainPageSteps;
import com.onliner.steps.onliner.catalog.CatalogPageSteps;
import com.onliner.steps.onliner.catalog.gallery.ProductDetailPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTemplateOnliner {
    @Managed
    public WebDriver driver;

    @Steps
    public LoginPageSteps loginPageSteps;

    @Steps
    public CatalogPageSteps catalogPageSteps;

    @Steps
    public GalleryPage galleryPageSteps;

    @Steps
    public MainPageSteps mainPageSteps;

    @Steps
    public ProductDetailPageSteps productDetailPageSteps;

    @Steps
    public CartPageSteps cartPageSteps;

    public void openSite() {
        mainPageSteps.openURL();
    }

    public void logIn(){
        mainPageSteps.openURL();
        //mainPageSteps.openLogInPage();
        loginPageSteps.verifyLogInPageAppears();
        loginPageSteps.enterEmail("zak820@gmail.com");
        loginPageSteps.enterPassword("2099663yauheni");
        loginPageSteps.clickSignIn();
    }

}
