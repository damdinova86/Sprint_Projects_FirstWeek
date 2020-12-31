package Pages.SecondWeekSprint;

import Pages.FirstWeekSprint.BasePage;
import org.openqa.selenium.By;

public class Checkout_Page extends BasePage {

    public double taxNum;
    By estTax = By.xpath("//div[@class='tooltip-salestax-help hide']/following-sibling::span[@class='or-inner-data']");


    public void yourEstimateTax() {
        String tax = getText(estTax);
        String taxWithOut$ = tax.substring(1);
        taxNum = Double.valueOf(taxWithOut$);

    }


}
