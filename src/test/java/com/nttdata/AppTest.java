package com.nttdata;

import com.nttdata.Data.User;
import com.nttdata.Page.InventoryPage;
import com.nttdata.Page.LogginPage;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.nttdata.Data.UsersType.STANDARD;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class AppTest extends UIInteractionSteps {
    @Managed
    LogginPage logginPage;
    @Managed
    InventoryPage inventoryPage;

    @Test
    public void usersCanLogginOn()  {

        logginPage.open();

        loginAction(STANDARD);

        WebElementFacade productTitle = inventoryPage.getInventoryTitle();
        productTitle.shouldBeVisible();

        assertThat(inventoryPage.getInventoryTitle().getText()).isEqualToIgnoringCase("PRODUCTS");
    }  @Test
    public void addItemsIntoTheCart()  {

        logginPage.open();

        loginAction(STANDARD);

        WebElementFacade productTitle = inventoryPage.getInventoryTitle();
        productTitle.shouldBeVisible();

        selectInventoryItem();
        goBackToInventoryPage();

    }

    public void loginAction (User user){
        logginPage.getUsername().sendKeys(user.getUsername());
        logginPage.getPassword().sendKeys(user.getPassword());
        logginPage.getLoggingButton().click();
    }

    public void selectInventoryItem(){
        inventoryPage.getPageItem5().click();
    }public void goBackToInventoryPage(){
        inventoryPage.getBackToInventoryPage().click();
    }
}
