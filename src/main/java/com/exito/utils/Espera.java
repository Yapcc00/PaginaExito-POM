package com.exito.utils;

import com.exito.pageObject.busquedaPage;
import net.serenitybdd.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Espera extends PageObject {

    @Page
    busquedaPage busquedaPage;

    private WebDriver driver;

    public Espera (WebDriver driver) {
        this.driver = driver;
    }

    public void esperaArticulo () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(busquedaPage.getArticulos()));
    }
}
