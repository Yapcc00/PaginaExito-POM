package com.exito.steps;

import com.exito.models.Articulos;
import com.exito.pageObject.busquedaPage;
import com.exito.utils.Espera;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class busquedaSteps extends PageObject {

    @Page
    busquedaPage busqueda;

    @Page
    Espera espera;

    @Step("Abrir pagina exito")
    public void abrirNavegador(){
        busqueda.openUrl("https://www.exito.com/");
    }

    @Step("Buscar Articulo")
    public void busquedaArticulo(){
        String articulos = Articulos.data().get(0).get("Productos");
        busqueda.getDriver().findElement(busqueda.getBarraBusqueda()).sendKeys(articulos);
        busqueda.getDriver().findElement(busqueda.getBtnBusqueda()).click();
        espera.esperaArticulo();
    }

    @Step("Seleccionar Articulo")
    public void seleccionarArticulo(){
       busqueda.getDriver().findElement(busqueda.getArticulos());
        busqueda.getDriver().findElement(busqueda.getArticulos()).click();

    }
}
