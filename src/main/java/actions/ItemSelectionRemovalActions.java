package actions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.ItemPurchasePage;
import pages.ItemSelectionRemovalPage;
import utils.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class ItemSelectionRemovalActions extends BasePage {
    ItemSelectionRemovalPage itemSelectionRemovalPage = new ItemSelectionRemovalPage();
    ItemPurchasePage itemPurchasePage = new ItemPurchasePage();

    public void cartClick(){
        itemPurchasePage.getCartButton().click();
    }

    public void removeClick(){
        itemSelectionRemovalPage.getRemoveButton().click();
    }

    public void emptyCart() {
        List<WebElement> cartItems = itemSelectionRemovalPage.getCartList();
        List<WebElement> realCartItems = cartItems.stream()
                .filter(item -> item.getAttribute("class").contains("cart_item"))
                .collect(Collectors.toList());

        Assert.assertEquals(0, realCartItems.size());
    }
}
