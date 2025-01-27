package stepDefinitions;

import actions.DetailedProductActions;
import actions.ItemPurchaseActions;
import io.cucumber.java.en.*;

public class ItemPurchaseSteps {
    DetailedProductActions detailedProductActions = new DetailedProductActions();
    ItemPurchaseActions itemPurchaseActions = new ItemPurchaseActions();

    @Given("o produto Sauce Labs Bolt T-Shirt foi adicionado ao carrinho")
    public void o_produto_foi_adicionado_ao_carrinho() {
        detailedProductActions.selectProduct();
        itemPurchaseActions.addProductToCart();
    }

    @When("acesso o carrinho e clico em Checkout")
    public void acesso_o_carrinho_e_clico_em_checkout() {
        itemPurchaseActions.checkoutPurchase();
    }

    @When("forneço os dados {string}, {string}, {string}")
    public void forneço_os_dados(String firstName, String lastName, String postalCode) {
        itemPurchaseActions.fillFields(firstName, lastName, postalCode);
    }

    @When("clico em Continue")
    public void clico_em_continue() {
        itemPurchaseActions.continueClick();
    }

    @When("finalizo a compra clicando em Finish")
    public void finalizo_a_compra_clicando_em_finish() {
        itemPurchaseActions.finishClick();
    }

    @Then("a compra é concluída com sucesso")
    public void a_compra_é_concluída_com_sucesso() {
        itemPurchaseActions.completedOrder();
    }
}
