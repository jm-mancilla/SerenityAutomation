package com.nttdata.Action;

import com.nttdata.Page.InventoryPage;
import com.nttdata.Page.ProductDetailsPage;
import io.cucumber.java.it.Ma;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;

public class ProductDetailsAction extends UIInteractions {

    @Managed
    ProductDetailsPage productDetailsPage;
    @Managed
    InventoryPage inventoryPage;

    @Step("Then the user select a specific Product from the inventory and acess to the Product details")
    public void selectInventoryItem(){
        inventoryPage.getPageItem5().click();

    }
    @Step("Then the user go back to Products Page")
    public void goBackProductsPage(){
        productDetailsPage.goBackToInventoryPage().click();
    }


}
