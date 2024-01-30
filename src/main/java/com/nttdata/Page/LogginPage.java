package com.nttdata.Page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class LogginPage extends PageObject {

    public static final By USERNAME_INPUT = By.id("user-name");
    public final By PASSWORD_INPUT = By.id("password");
    public final By LOGGING_BUTTON = By.id("login-button");

    public WebElementFacade getUsername() {
        return this.find(USERNAME_INPUT);
    }

    public WebElementFacade getPassword() {
        return this.find(PASSWORD_INPUT);
    }

    public WebElementFacade getLoggingButton() {
        return this.find(LOGGING_BUTTON);
    }

}
