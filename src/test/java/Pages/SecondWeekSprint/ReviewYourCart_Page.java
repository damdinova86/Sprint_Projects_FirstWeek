package Pages.SecondWeekSprint;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReviewYourCart_Page extends BasePage {
    public double total;
    public double totalFirstItem;
    public double amountAfterDeduction;
    public String totalQTY;
    public String qtyHarry;
    public String totalHarry;
    public String totalSFO;
    public int length;
    public double itemTotal1;
    public double itemTotal2;
    public double itemTotal3;
    public double HarryTotal;
    public int SFONum;
    public int namesTotal;
    public String totalAll;
    public double allStudentsTotal;
    public int qtyBox;
    public int QtyTotal;
    public double totalForAll;

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
    By harryTotal = By.xpath("//li[@class='std-total-price stdPriceTotal']");
    By harrysTotal = By.xpath("//li[text()='Harry Total']/following-sibling::li[@class='std-total-price stdPriceTotal']");
    By michaelTotal = By.xpath("//li[text()='Michael Total']/following-sibling::li[@class='std-total-price stdPriceTotal']");
    By johnTotal = By.xpath("//li[text()='John Total']/following-sibling::li[@class='std-total-price stdPriceTotal']");
    By totalOrder = By.xpath("//div[@class='each-review-order']");
    By totalForALl = By.xpath("//li[@class='std-total-price sfoSubTotalPrice']");
    By qtyBoxTotal = By.xpath("//span[@class='total-qty sfoSubTotalQty']");
    By qtyForHarry = By.xpath("//span[@class='total-qty stdPriceQty']");
    By totalAmountSFO = By.xpath("//span[@class='sfoSubTotalPrice']");
    By numSFO = By.xpath("//span[@id='student_flyer_orders_num']");
    By totalForItem1 = By.xpath("//input[@name='dwfrm_cart_shipments_i0_items_i0_quantity']/preceding::span[@class='value']");
    By totalForItem2 = By.xpath("//tr[@id='20S5']//td[@class='price']");
    By totalForItem3 = By.xpath("//input[@name='dwfrm_cart_shipments_i0_items_i1_quantity']/following::span[@class='value']");


    By qtyBoxTotal1 = By.xpath("(//span[@class='total-qty stdPriceQty'])[1]");
    By qtyBoxTotal2 = By.xpath("(//span[@class='total-qty stdPriceQty'])[2]");
    By qtyBoxTotal3 = By.xpath("(//span[@class='total-qty stdPriceQty'])[3]");

    public void verifySFOAllStudents() {

        waitUntilElementVisible(totalOrder);
        List<WebElement> total = Web.getDriver().findElements(totalOrder);
        namesTotal = total.size();


        totalAll = getText(totalForALl);
        String totalAllWithout$ = totalAll.substring(1);
        totalForAll = Double.valueOf(totalAllWithout$);

        String harry = getText(harrysTotal);
        String michael = getText(michaelTotal);
        String john = getText(johnTotal);
        String harryT = harry.substring(1);
        String harryM = michael.substring(1);
        String harryJ = john.substring(1);
        double hTotal = Double.valueOf(harryT);
        double mTotal = Double.valueOf(harryM);
        double jTotal = Double.valueOf(harryJ);
        allStudentsTotal = hTotal + mTotal + jTotal;


        String h = getText(qtyBoxTotal1);
        String m = getText(qtyBoxTotal2);
        String j = getText(qtyBoxTotal3);
        int qty1 = Integer.valueOf(h);
        int qty2 = Integer.valueOf(m);
        int qty3 = Integer.valueOf(j);
        qtyBox = qty1 + qty2 + qty3;


        String numberSFO = getText(numSFO);
        SFONum = Integer.valueOf(numberSFO);
        totalSFO = getText(totalAmountSFO);
        totalQTY = getText(qtyBoxTotal);
        QtyTotal = Integer.valueOf(totalQTY);
    }

    public void quantityTotal() {
        totalQTY = getText(qtyBoxTotal);
        QtyTotal = Integer.valueOf(totalQTY);
        qtyHarry = getText(qtyForHarry);
        totalHarry = getText(harryTotal);
        String totalHarryWithout$ = totalHarry.substring(1);
        HarryTotal = Double.valueOf(totalHarryWithout$);
        totalSFO = getText(totalAmountSFO);

        List<WebElement> total = Web.getDriver().findElements(totalOrder);
        length = total.size();
        String numberSFO = getText(numSFO);
        System.out.println(numberSFO);
        SFONum = Integer.valueOf(numberSFO);

        String totalItem1 = getText(totalForItem1);
        String Item1Total = totalItem1.substring(1);
        itemTotal1 = Double.valueOf(Item1Total);
        String totalItem2 = getText(totalForItem2);
        String Item2Total = totalItem2.substring(1);
        itemTotal2 = Double.valueOf(Item2Total);
        String totalItem3 = getText(totalForItem3);
        String Item3Total = totalItem3.substring(1);
        itemTotal3 = Double.valueOf(Item3Total);


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
    public void getTextFromStudentTotal() {
        String totalForStudent = getText(studentTotal);
        String totalWithOut$ = totalForStudent.substring(1);
        total = Double.valueOf(totalWithOut$);


        String totalItem = getText(totalForTheItem);
        String totalItemWithOut$ = totalItem.substring(1);
        totalFirstItem = Double.valueOf(totalItemWithOut$);

        amountAfterDeduction = total - totalFirstItem;


    }

    public void deleteItem() {
        waitUntilClickable(deleteItem);
        clickThis(deleteItem);
        moveToElement(yesButton);
        clickThis(yesButton);
    }


}
