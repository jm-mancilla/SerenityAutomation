package com.nttdata.Page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class InventoryPage extends PageObject {

    public final By INVENTORY_TITLE = By.className("title");
    public final By PAGE_ITEM_5 = By.cssSelector("#item_2_title_link > div");
    public final By BACK_TO_INVENTORY_PAGE = By.id("back-to-products");

    public WebElementFacade getInventoryTitle(){
        return this.find(INVENTORY_TITLE);
    }
    public WebElementFacade getPageItem5(){
        return this.find(PAGE_ITEM_5);
    }
    public WebElementFacade getBackToInventoryPage(){
        return this.find(BACK_TO_INVENTORY_PAGE);
    }

    }
