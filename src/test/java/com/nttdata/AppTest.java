package com.nttdata;

import com.nttdata.Action.InventoryPageAction;
import com.nttdata.Action.LoggingAction;
import com.nttdata.Action.ProductDetailsAction;
import com.nttdata.Data.User;
import com.nttdata.Page.InventoryPage;
import com.nttdata.Page.LogginPage;
import com.nttdata.Page.ProductDetailsPage;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.nttdata.Data.UsersType.STANDARD;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class AppTest extends UIInteractionSteps {

    @Managed
    ProductDetailsAction productDetailsAction;
    @Managed
    ProductDetailsPage productDetailsPage;
    @Managed
    InventoryPageAction inventoryPageAction;
    @Managed
    LoggingAction loggingAction;
    @Managed
    LogginPage logginPage;
    @Managed
    InventoryPage inventoryPage;

    @Test
    public void usersCanLogginOn()  {

        logginPage.open();

        loggingAction.as(STANDARD);

        WebElementFacade productTitle = inventoryPage.getInventoryTitle();
        productTitle.shouldBeVisible();

        assertThat(inventoryPage.getInventoryTitle().getText()).isEqualToIgnoringCase("PRODUCTS");
    }  @Test
    public void addItemsIntoTheCart() throws InterruptedException {

        logginPage.open();

        loggingAction.as(STANDARD);

        WebElementFacade productTitle = inventoryPage.getInventoryTitle();
        productTitle.shouldBeVisible();

        inventoryPageAction.clickOnProduct("Sauce Labs Onesie");
        productDetailsPage.goBackToInventoryPage();

        Serenity.reportThat("Then I validate that the cart contains the previous added product", ()->
                assertThat(inventoryPage.getCartInfo().getText()).isEqualTo("1"));

    }

    }
