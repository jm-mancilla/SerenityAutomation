package com.nttdata.Page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ProductDetailsPage extends PageObject {
    public final By BACK_TO_INVENTORY_PAGE = By.id("back-to-products");
    public final By ADD_TO_CART_BUTTON = By.id("add-to-cart-sauce-labs-onesie");

    public WebElementFacade addToCart(){
        return this.find(ADD_TO_CART_BUTTON);
    }
    public WebElementFacade goBackToInventoryPage(){
        return this.find(BACK_TO_INVENTORY_PAGE);
    }

}


