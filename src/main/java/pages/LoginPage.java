package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BasePage;

public class LoginPage extends BasePage {

    private static final String USERNAME_FIELD = "//*[@id=\"user-name\"]";
    private static final String PASSWORD_FIELD = "//*[@id=\"password\"]";
    private static final String LOGIN_BUTTON = "//*[@id=\"login-button\"]";
    private static final String ERROR_MESSAGE = "//*[contains(text(), 'Username and password do not match any user in this service')]";
    private static final String HOMEPAGE_NAME = "//*[@id=\"header_container\"]/div[2]/span";


    public WebElement getUsernameField(){
        return driver.findElement(By.xpath(USERNAME_FIELD));
    }

    public WebElement getPasswordField(){
        return driver.findElement(By.xpath(PASSWORD_FIELD));
    }

    public WebElement getLoginButton(){
        return driver.findElement(By.xpath(LOGIN_BUTTON));
    }

    public WebElement getErrorMessage(){
        return driver.findElement(By.xpath(ERROR_MESSAGE));
    }

    public WebElement getHomePageName(){
        return driver.findElement(By.xpath(HOMEPAGE_NAME));
    }
}