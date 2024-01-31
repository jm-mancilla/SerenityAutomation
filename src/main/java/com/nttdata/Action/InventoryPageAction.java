package com.nttdata.Action;

import com.nttdata.Page.InventoryPage;
import com.nttdata.Page.ProductDetailsPage;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;

import java.util.List;

public class InventoryPageAction extends UIInteractions {

    @Managed
    ProductDetailsPage productDetailsPage;
    @Managed
    InventoryPage inventoryPage;
    @Step("Given the user select one product and the product is added into the cart")
    public void clickOnProduct(String nameOfProduct) {
        List<WebElementFacade> list = inventoryPage.getInventoryList();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getTextContent().equals(nameOfProduct)){
                inventoryPage.getInventoryList().get(i).click();
                productDetailsPage.addToCart().click();
                break;
            }
        }
    }
}
