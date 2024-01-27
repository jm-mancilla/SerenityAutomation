package com.nttdata;

import net.serenitybdd.core.pages.PageObject;

public class InventoryPage extends PageObject {

    public String getHeaderTitle(){
     return $(".title").getText();
    }
}
