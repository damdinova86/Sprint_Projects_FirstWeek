package Pages.SecondWeekSprint;

import org.openqa.selenium.By;

public class YTO_Page extends BasePage {


    By YTO = By.id("tab-yto");
    By byFlyer = By.xpath("//ul[@class='yto-by-item-default']/preceding::a[text()='By Flyer']");
    By qty = By.xpath("//input[@data-itemid='1S5']");
    By reviewCart = By.xpath("//button[text()='Review Cart']");


    public void clickYTO() {
        clickThis(YTO);
        waitUntilElementVisible(byFlyer);
        clickThis(byFlyer);
    }

    public void addQuantityAndClickReview(String data) {
        enter(qty, data);
        scroll(reviewCart);
        clickThis(reviewCart);
    }

    public void clickReviewCart() {
        scroll(reviewCart);
        clickThis(reviewCart);
    }


}
