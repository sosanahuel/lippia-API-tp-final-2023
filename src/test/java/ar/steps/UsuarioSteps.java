package ar.steps;

import io.cucumber.java.en.And;

import static ar.validator.UsuarioValidador.getPrimerIdDeUsuario;

public class UsuarioSteps {
    @And("obtengo el user")
    public void obtengo_el_user(){
        getPrimerIdDeUsuario();
    }
}
