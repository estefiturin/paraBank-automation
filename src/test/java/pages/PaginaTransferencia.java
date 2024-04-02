package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PaginaTransferencia extends BasePage{

    private By usernameId = By.xpath("//input[@name='username']");
    private By passwordId = By.xpath("//input[@name='password']");
    private By buttonLogin = By.xpath("//input[@value='Log In']");
    private By buttonTransferFunds = By.linkText("Transfer Funds");
    private By fieldAmount = By.id("amount");
    private By destinationId = By.id("toAccountId");
    private By botonTransfer = By.xpath("//INPUT[@type='submit']");
    private By messageExitoso = By.xpath("//h1[normalize-space()='Transfer Complete!']");


    public PaginaTransferencia() {
        super(driver);
    }

    public void navigateToParaBank() {
        navigateTo("https://parabank.parasoft.com/");
    }

    public void writeUsername(String username) {
        sendText(username, usernameId);
    }

    public void writePassword(String password) {
        sendText(password, passwordId);
    }

    public void clickButtonLogin() {
        clickId(buttonLogin);
    }

    public void clickTransferFund() {
        this.clickId(buttonTransferFunds);
    }

    public void writeField(String monto) {
        sendText(monto, fieldAmount);
    }


    public void selectAccountDestino() {
        Select select = new Select(driver.findElement(destinationId));
        select.selectByVisibleText("15675");
    }

    public void clickButtonTransfer() {
        this.clickId(botonTransfer);
    }

    public String messageConfirm() {
        return this.findText(messageExitoso);
    }











}
