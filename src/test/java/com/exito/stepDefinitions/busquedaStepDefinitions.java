package com.exito.stepDefinitions;

import com.exito.steps.busquedaSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class busquedaStepDefinitions {

    @Steps
    busquedaSteps busqueda;


    @Dado("que el usuario ingrese a la pagina del exito")
    public void queElUsuarioIngreseALaPaginaDelExito() {
        busqueda.abrirNavegador();
    }

    @Cuando("busque el articulo y haga click")
    public void busqueElArticuloYHagaClick() {
        busqueda.busquedaArticulo();
        busqueda.seleccionarArticulo();
    }

    @Cuando("lo agregue al carrito")
    public void loAgregueAlCarrito() {
    }

    @Entonces("podra finalizar la compra exitosamente")
    public void podraFinalizarLaCompraExitosamente() {
    }

}
