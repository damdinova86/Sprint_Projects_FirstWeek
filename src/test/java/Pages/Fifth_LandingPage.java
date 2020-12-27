package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Fifth_LandingPage extends BasePage {

    By addCard = By.xpath("//div[@class='link link-credit-card']//a[@class='reading-club add-creditcardtoaccount']");
    By card = By.xpath("//input[contains(@id,'creditcards_newcreditcard_number')]");
    By month = By.xpath("//div[text()='Month']");
    By enterMonth = By.xpath("//li[@data-label='02']");
    By year = By.xpath("//div[text()='Year']");
    By enterYear = By.xpath("//li[@data-label='2021']");
    By SecCode = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_cvn");
    By typeFirstName = By.id("dwfrm_paymentinstruments_creditcards_address_firstname");
    By lastName = By.id("dwfrm_paymentinstruments_creditcards_address_lastname");
    By address = By.id("dwfrm_paymentinstruments_creditcards_address_address1");
    By zipCode = By.id("dwfrm_paymentinstruments_creditcards_address_postal");
    By phoneN = By.id("dwfrm_paymentinstruments_creditcards_address_phone");
    By save = By.xpath("//button[@class='button-continue']");
    By mess = By.xpath("//div[@class='tooltipster-body']");
    By addCardSecond = By.xpath("//a[@class='custom-tooltip tooltipstered']");


    public void addACard() {
        clickThis(addCard);
        sleepMethod();
    }


    public void typeCard(String data) {
        sleepMethod();
        enter(card, data);
    }

    public void clickExpirationDate() {
        clickThis(month);
        clickThis(enterMonth);
        clickThis(year);
        clickThis(enterYear);

    }

    public void typeSecCode(String data) {
        enter(SecCode, data);
    }

    public void typeFirstName(String data) {
        enter(typeFirstName, data);
    }

    public void typeLastName(String data) {
        enter(lastName, data);
        sleepMethod();
    }

    public void typeAddress(String data) {
        enter(address, data);
    }

    public void typeZipCode(String data) {
        enter(zipCode, data);
    }

    public void typePhone(String data) {
        enter(phoneN, data);
    }

    public void clickSave() {
        sleepMethod();
        clickThis(save);
    }

    public void clickAddCard() {
        clickThis(addCardSecond);
    }

    public String getTextMess() {
        String message = getText(mess);
        return message;
    }


}
