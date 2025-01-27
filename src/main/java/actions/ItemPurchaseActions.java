package actions;

import org.junit.Assert;
import pages.ItemPurchasePage;
import utils.BasePage;

public class ItemPurchaseActions extends BasePage {
    ItemPurchasePage itemPurchasePage = new ItemPurchasePage();

    public void addProductToCart(){
        itemPurchasePage.getAddButton().click();
    }

    public void checkoutPurchase(){
        itemPurchasePage.getCartButton().click();
        itemPurchasePage.getCheckoutButton().click();
    }

    public void fillFields(String firstName, String lastName, String postalCode){
        itemPurchasePage.getFirstName().sendKeys(firstName);
        itemPurchasePage.getLastName().sendKeys(lastName);
        itemPurchasePage.getPostalCode().sendKeys(postalCode);
    }

    public void continueClick(){
        itemPurchasePage.getContinueButton().click();
    }

    public void finishClick(){
        itemPurchasePage.getFinishButton().click();
    }

    public void completedOrder(){
        Assert.assertEquals("Thank you for your order!", itemPurchasePage.getCompletedOrder().getText());
    }

}
