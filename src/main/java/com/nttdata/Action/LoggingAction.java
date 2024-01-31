package com.nttdata.Action;

import com.nttdata.Data.User;
import com.nttdata.Page.LogginPage;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;

public class LoggingAction extends UIInteractions {

    @Managed
    LogginPage loggingPage;

    @Step("Given the user opens the logging page")
    public LoggingAction openPage(){
        loggingPage.open();
        return this;
    }
    @Step("When {0} log in")
    public void as (User user){
        loggingPage.getUsername().sendKeys(user.getUsername());
        loggingPage.getPassword().sendKeys(user.getPassword());
        loggingPage.getLoggingButton().click();
    }
}
