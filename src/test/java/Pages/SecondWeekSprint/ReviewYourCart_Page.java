package Pages.SecondWeekSprint;

import Pages.FirstWeekSprint.BasePage;
import org.openqa.selenium.By;

public class ReviewYourCart_Page extends BasePage {
    By reviewYorCart = By.xpath("//button[text()='Review Cart']");
    By checkout = By.xpath("//button[@value='Proceed to Checkout']");
    By proceedToCheckout = By.xpath("//div[@class='col promo-msg']/following::button[@value='Proceed to Checkout']");
    //TC15
    By continueCheckout = By.id("btn-continue-checkout");


    public void proceedToCheckout() {
        scroll(checkout);
        waitUntilClickable(checkout);
        clickThis(checkout);
        waitUntilClickable(proceedToCheckout);
        clickThis(proceedToCheckout);
    }

    //TC15
    public void continueCheckOut() {
        clickThis(continueCheckout);
    }

}
