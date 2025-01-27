package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;

import java.util.List;

public class ItemSelectionRemovalPage extends BasePage {

    private static final String REMOVE_BUTTON = "//*[@id=\"remove-sauce-labs-fleece-jacket\"]";
    private static final String CART_LIST = "cart_list";

    public WebElement getRemoveButton(){
        return driver.findElement(By.xpath(REMOVE_BUTTON));
    }

    public List<WebElement> getCartList(){
        return driver.findElements(By.className(CART_LIST));
    }
}
