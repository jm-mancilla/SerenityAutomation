package com.nttdata.Page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class InventoryPage extends PageObject {

    public final By INVENTORY_TITLE = By.className("title");
    public final By PAGE_ITEM_5 = By.cssSelector("#item_2_title_link > div");
    public final By ITEM_ADDED_INTO_CART = By.cssSelector("span.shopping_cart_badge");
    public final String INVENTORY_ITEM_LIST = ".inventory_item_name";

    public WebElementFacade getInventoryTitle(){
        return this.find(INVENTORY_TITLE);
    }
    public WebElementFacade getPageItem5(){
        return this.find(PAGE_ITEM_5);
    }
    public WebElementFacade getCartInfo(){
        return this.find(ITEM_ADDED_INTO_CART);
    }
    public List<WebElementFacade> getInventoryList (){
        return this.findAll(INVENTORY_ITEM_LIST);
    }

    }
