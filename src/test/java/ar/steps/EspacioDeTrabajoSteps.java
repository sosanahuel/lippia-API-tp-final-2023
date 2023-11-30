package ar.steps;

import api.config.EntityConfiguration;
import ar.validator.EspacioDeTrabajoValidador;
import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import com.google.api.client.repackaged.com.google.common.base.Splitter;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.lang.StringUtils;
import services.BaseService;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class EspacioDeTrabajoSteps extends PageSteps {
    @Given("tengo una cuenta y una api-key")
    public void tengoUnaCuentaYUnaApiKey() {
        BaseService.API_KEY.set(PropertyManager.getProperty("api_key"));
    }

    @When("^I perform a '(.*)' to '(.*)' endpoint with the '(.*)' and '(.*)'$")
    public void doRequest(String methodName, String entity, String jsonName, String jsonReplacementValues) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Class entityService = EntityConfiguration.valueOf(entity).getEntityService();
        Map<String, String> parameters = getParameters(jsonReplacementValues);
        String jsonPath = "request/".concat(jsonName);
        if (parameters == null) {
            entityService.getMethod(methodName.toLowerCase(), String.class).invoke("", jsonPath);
        } else {
            entityService.getMethod(methodName.toLowerCase(), String.class, Map.class).invoke("", jsonPath, parameters);
        }
    }

    private Map<String, String> getParameters(String jsonReplacementValues) {
        Map<String, String> parameters = null;
        if (!StringUtils.isEmpty(jsonReplacementValues)) {
            parameters = Splitter.on(",").withKeyValueSeparator(":").split(jsonReplacementValues);
        }
        return parameters;
    }
    @Then("obtengo el response")
    public void obtengoElResponse() {
        EspacioDeTrabajoValidador.responseWorkspaces();
    }

    @And("guardo el primer workspace")
    public void guardoPrimerWorkspace(){
        EspacioDeTrabajoValidador.getPrimerWorkspaces();
    }
}
