package stepDefinitions;

import actions.LoginPageActions;
import actions.PriceSortingPageActions;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class PriceSortingSteps {
    PriceSortingPageActions priceSortingPageActions = new PriceSortingPageActions();
    LoginPageActions loginPageActions = new LoginPageActions();

    @Given("que estou logado na aplicação")
    public void que_estou_logado_na_aplicação() {
        loginPageActions.navigateToLogin();
        loginPageActions.fillUsername("standard_user");
        loginPageActions.fillPassword("secret_sauce");
        loginPageActions.pressLoginButton();
    }

    @Given("estou na página de listagem de produtos")
    public void estou_na_página_de_listagem_de_produtos() {
        loginPageActions.validateRedirect();
    }

    @When("eu seleciono a opção Price \\(low to high) no menu de ordenação")
    public void eu_seleciono_a_opção_price_low_to_high_no_menu_de_ordenação() {
        priceSortingPageActions.selectFilter();
        priceSortingPageActions.selectIncreasingPriceFilter();
    }

    @When("eu seleciono a opção Price \\(high to low) no menu de ordenação")
    public void eu_seleciono_a_opção_price_high_to_low_no_menu_de_ordenação() {
        priceSortingPageActions.selectFilter();
        priceSortingPageActions.selectDecreasingPriceField();
    }

    @Then("os produtos devem ser exibidos em ordem crescente de preço")
    public void os_produtos_devem_ser_exibidos_em_ordem_crescente_de_preço() {
        Assert.assertTrue(priceSortingPageActions.validateIncSorting());
    }

    @Then("os produtos devem ser exibidos em ordem decrescente de preço")
    public void os_produtos_devem_ser_exibidos_em_ordem_decrescente_de_preço() {
        Assert.assertTrue(priceSortingPageActions.validateDecSorting());
    }
}
