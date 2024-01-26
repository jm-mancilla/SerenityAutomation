package com.nttdata;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

@RunWith(SerenityRunner.class)
public class AppTest

{

    @Managed
    WebDriver driver;
    @Test
   public void myFirstSerenityTest() throws InterruptedException {
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        TimeUnit.SECONDS.sleep(10);

        assertTrue(true);

    }
}
