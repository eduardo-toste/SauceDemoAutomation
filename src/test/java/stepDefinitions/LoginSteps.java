package stepDefinitions;

import actions.LoginPageActions;
import io.cucumber.java.en.*;

public class LoginSteps {
    LoginPageActions loginPageActions = new LoginPageActions();

    @Given("que estou na tela de login da aplicação")
    public void que_estou_na_tela_de_login_da_aplicação() {
        loginPageActions.navigateToLogin();
    }

    @When("eu insiro o usuário {string} e a senha {string}")
    public void eu_insiro_o_usuário_e_a_senha(String usuario, String senha) {
        loginPageActions.fillUsername(usuario);
        loginPageActions.fillPassword(senha);
    }

    @When("clico no botão de login")
    public void clico_no_botão_de_login() {
        loginPageActions.pressLoginButton();
    }

    @Then("sou redirecionado para a tela principal")
    public void sou_redirecionado_para_a_tela_principal() {
        loginPageActions.validateRedirect();
    }

    @Then("é apresentada uma mensagem de erro")
    public void é_apresentada_uma_mensagem_de_erro() {
        loginPageActions.validateErrorMessage();
    }
}
