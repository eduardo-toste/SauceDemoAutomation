package stepDefinitions;

import actions.DetailedProductActions;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class DetailedProductSteps {
    DetailedProductActions detailedProductActions = new DetailedProductActions();

    @When("eu clico no produto Sauce Labs Fleece Jacket")
    public void eu_clico_no_produto_sauce_labs_fleece_jacket() {
        detailedProductActions.selectProduct();
    }

    @Then("os dados detalhados do produto são exibidos")
    public void os_dados_detalhados_do_produto_são_exibidos() {
        detailedProductActions.viewProductDetails();
    }
}
