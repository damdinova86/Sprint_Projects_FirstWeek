package Pages.SecondWeekSprint;

import Pages.FirstWeekSprint.BasePage;
import org.openqa.selenium.By;

public class ReviewYourCart_Page extends BasePage {
    public double total;
    public double totalFirstItem;
    public double amountAfterDeduction;
    public String item1;
    public String item2;
   public String item3;
    public String name;

    By reviewYorCart = By.xpath("//button[text()='Review Cart']");
    By checkout = By.xpath("//button[@value='Proceed to Checkout']");
    By proceedToCheckout = By.xpath("//div[@class='col promo-msg']/following::button[@value='Proceed to Checkout']");
    //TC15
    By continueCheckout = By.id("btn-continue-checkout");
    //TC10
    By studentTotal = By.xpath("//li[@class='std-total-price stdPriceTotal']");
    By totalForTheItem = By.xpath("//input[@name='dwfrm_cart_shipments_i0_items_i1_quantity']/preceding::i[@class='fa fa-times-circle remove']/preceding::td[@class='price']");
    By deleteItem = By.xpath("//input[@name='dwfrm_cart_shipments_i0_items_i1_quantity']/preceding::i[@class='fa fa-times-circle remove']");
//    By deleteItem = By.xpath("//div[@class='action-remove-wrapper']/preceding::i[@class='fa fa-times-circle remove']");
    By yesButton = By.xpath("//button[@name='dwfrm_cart_shipments_i0_items_i0_deleteProduct']");
    //TC7
    By itemNum = By.xpath("//a[text()='17S5']");
    By itemNum1 = By.xpath("//a[text()='42J4']");
    By itemNum2 = By.xpath("//a[text()='20S5']");
    By nameHarry = By.xpath("(//td[@class=' studentName'])[2]");

    public void verifyItemNumberAndName(){
        item1 = getText(itemNum);
         item2 = getText(itemNum1);
         item3 =getText(itemNum2);
        name = getText(nameHarry);





    }



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

    //TC10
    public void getTextFromStudentTotal(){
        String totalForStudent = getText(studentTotal);
        String totalWithOut$ = totalForStudent.substring(1);
       total = Double.valueOf(totalWithOut$);


        String totalItem = getText(totalForTheItem);
        String totalItemWithOut$ = totalItem.substring(1);
       totalFirstItem = Double.valueOf(totalItemWithOut$);

        amountAfterDeduction = total-totalFirstItem;


    }

    public void deleteItem(){
        waitUntilClickable(deleteItem);
        clickThis(deleteItem);
        moveToElement(yesButton);
        clickThis(yesButton);
    }





}
