package actions;

import static org.junit.Assert.assertEquals;

import pages.LoginPage;
import utils.BasePage;

public class LoginPageActions extends BasePage {
    LoginPage loginPage = new LoginPage();

    public void navigateToLogin(){
        driver.get("https://www.saucedemo.com/");
    }

    public void fillUsername(String usuario){
        loginPage.getUsernameField().sendKeys(usuario);
    }

    public void fillPassword(String senha){
        loginPage.getPasswordField().sendKeys(senha);
    }

    public void pressLoginButton(){
        loginPage.getLoginButton().click();
    }

    public void validateErrorMessage(){
        assertEquals(loginPage.getErrorMessage().getText(), "Epic sadface: Username and password do not match any user in this service");
    }

    public void validateRedirect(){
        assertEquals(loginPage.getHomePageName().getText(), "Products");
    }
}
