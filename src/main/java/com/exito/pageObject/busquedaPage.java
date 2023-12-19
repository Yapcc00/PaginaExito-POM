package com.exito.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class busquedaPage extends PageObject {

    private final By barraBusqueda = By.xpath("//input[@id='downshift-0-input']");

    private final By btnBusqueda = By.xpath("//button[contains(@class, 'vtex-store-components-3-x-searchBarIcon')]");

   private  final By articulos = By.xpath("//article[@class='vtex-product-summary-2-x-element vtex-product-summary-2-x-element--productDefaultDescription pointer pt3 pb4 flex flex-column h-100']");

    public By getArticulos() {
        return articulos;
    }

    public By getBarraBusqueda() {
        return barraBusqueda;
    }

    public By getBtnBusqueda() {
        return btnBusqueda;
    }
}
