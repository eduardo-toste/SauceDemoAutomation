package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;

public class ItemPurchasePage extends BasePage {

    private static final String ADD_BUTTON = "//*[@id=\"add-to-cart\"]";
    private static final String CART_BUTTON = "//*[@id=\"shopping_cart_container\"]/a";
    private static final String CHECKOUT_BUTTON = "//*[@id=\"checkout\"]";
    private static final String FNAME_FIELD = "//*[@id=\"first-name\"]";
    private static final String LNAME_FIELD = "//*[@id=\"last-name\"]";
    private static final String PCODE_FIELD = "//*[@id=\"postal-code\"]";
    private static final String CONTINUE_BUTTON = "//*[@id=\"continue\"]";
    private static final String FINISH_BUTTON = "//*[@id=\"finish\"]";
    private static final String COMPLETED_ORDER = "//*[@id=\"checkout_complete_container\"]/h2";

    public WebElement getAddButton(){
        return driver.findElement(By.xpath(ADD_BUTTON));
    }

    public WebElement getCartButton(){
        return driver.findElement(By.xpath(CART_BUTTON));
    }

    public WebElement getCheckoutButton(){
        return driver.findElement(By.xpath(CHECKOUT_BUTTON));
    }

    public WebElement getFirstName(){
        return driver.findElement(By.xpath(FNAME_FIELD));
    }

    public WebElement getLastName(){
        return driver.findElement(By.xpath(LNAME_FIELD));
    }

    public WebElement getPostalCode(){
        return driver.findElement(By.xpath(PCODE_FIELD));
    }

    public WebElement getContinueButton(){
        return driver.findElement(By.xpath(CONTINUE_BUTTON));
    }

    public WebElement getFinishButton(){
        return driver.findElement(By.xpath(FINISH_BUTTON));
    }

    public WebElement getCompletedOrder(){
        return driver.findElement(By.xpath(COMPLETED_ORDER));
    }

}
