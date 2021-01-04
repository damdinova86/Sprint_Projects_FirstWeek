package Pages.SecondWeekSprint;

import org.openqa.selenium.By;

public class SFO_Page extends BasePage {
    public String item1;
    public String item2;
    public String item3;
    public String name;
    public String name1;
    public String name2;
    public String item1J;
    public String item2J;
    public String item1M;
    public String item2M;

    By studentName = By.id("student-name");
    By itemNumber = By.id("item-number");
    By add = By.id("btn-add");
    By error = By.id("error-message-tooltip");
    By qty = By.xpath("//input[@class='input-qty numericenteronly']");
    //TC7
    By itemNum = By.xpath("//td[@class=' itemNum details-control']//a[text()='17S5']");
    By itemNum1 = By.xpath("//td[@class=' itemNum details-control']//a[text()='42J4']");
    By itemNum2 = By.xpath("//td[@class=' itemNum details-control']//a[text()='20S5']");
    By nameHarry = By.xpath("(//td[@class=' studentName'])[2]");
    By Harry = By.xpath("//a[text()='42J4']/preceding::td[text()='Harry']");
    By John = By.xpath("//a[text()='19S5']/preceding::td[text()='John']");
    By Michael = By.xpath("//a[text()='34B4']/preceding::td[text()='Michael']");
    By itemNumJohn = By.xpath("//td[@class=' itemNum details-control']//a[text()='20S5']");
    By itemNum1John = By.xpath("//td[@class=' itemNum details-control']//a[text()='19S5']");
    By itemNumM = By.xpath("//td[@class=' itemNum details-control']//a[text()='18S5']");
    By itemNum1M = By.xpath("//td[@class=' itemNum details-control']//a[text()='34B4']");

    public void verifyItemNumberAndName() {
        item1 = getText(itemNum);
        item2 = getText(itemNum1);
        item3 = getText(itemNum2);
        name = getText(nameHarry);
    }

    public void verifyItemsEnteredNamesAndQTY() {
        item1 = getText(itemNum);
        item2 = getText(itemNum1);
        name = getText(Harry);
        name1 = getText(John);
        name2 = getText(Michael);
        item1J = getText(itemNumJohn);
        item2J = getText(itemNum1John);
        item1M = getText(itemNumM);
        item2M = getText(itemNum1M);
    }


    public void enterNameBox(String word, String data, String number) {
        enter(studentName, word);
        enter(itemNumber, data);
        clickThis(add);
        enter(qty, number);
    }

    public void enterItemNumber(String word) {

        enter(itemNumber, word);
    }

    public void clickAdd() {
        clickThis(add);
        sleepMethod();
    }

    public String getTextError() {
        String errorMessage = getText(error);
        return errorMessage;
    }

    public void addQTY(String data) {
        waitUntilElementVisible(qty);
        enter(qty, data);
    }


}
