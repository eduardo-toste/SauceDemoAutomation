package stepDefinitions;

import actions.ItemSelectionRemovalActions;
import io.cucumber.java.en.*;

public class ItemSelectionRemovalSteps {
    ItemSelectionRemovalActions itemSelectionRemovalActions = new ItemSelectionRemovalActions();

    @When("acesso o carrinho de compras")
    public void acesso_o_carrinho_de_compras() {
        itemSelectionRemovalActions.cartClick();
    }

    @When("clico no botão Remove para remover o produto")
    public void clico_no_botão_remove_para_remover_o_produto() {
        itemSelectionRemovalActions.removeClick();
    }

    @Then("o carrinho de compras deve aparecer vazio")
    public void o_carrinho_de_compras_deve_aparecer_vazio() {
        itemSelectionRemovalActions.emptyCart();
    }
}
