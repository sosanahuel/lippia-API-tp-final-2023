package ar.steps;

import ar.validator.ProyectoValidador;
import io.cucumber.java.en.And;

public class proyectoSteps {
    @And("obtengo en ID del proyecto")
    public void obtengo_en_ID_del_proyecto(){
        ProyectoValidador.primerProyecto();
    }
}
