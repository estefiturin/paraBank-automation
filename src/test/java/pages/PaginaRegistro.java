package pages;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;

public class PaginaRegistro extends BasePage{

    private By firstNameId = By.id("customer.firstName");
    private By lastNameId = By.id("customer.lastName");
    private By addressId = By.id("customer.address.street");
    private By cityId = By.id("customer.address.city");
    private By stateId = By.id("customer.address.state");

    private By zipcodeId = By.id("customer.address.zipCode");

    private By telephoneId = By.id("customer.phoneNumber");
    private By ssnId = By.id("customer.ssn");
    private By usernameId = By.id("customer.username");
    private By passwordId = By.id("customer.password");
    private By passwordConfirmId = By.id("repeatedPassword");
    private By botonSubmit = By.xpath("//input[@value='Register']");

    private By registrado = By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");

    public PaginaRegistro() {
        super(driver);
    }

    public void writeName(String name){
        sendText(name, firstNameId);
    }

    public void writeLastName(String LastName) {
        sendText(LastName, lastNameId);
    }

    public void writeAdress(String address) {
        sendText(address, addressId);
    }
    public void writeCity(String city) {
        sendText(city, cityId);
    }

    public void writeState(String state) {
        sendText(state, stateId);
    }

    public void writeZipcode(String zip) {
        sendText(zip, zipcodeId);
    }

    public void writePhone(String phone) {
        sendText(phone, telephoneId);
    }

    public void writeSsn(String ssn) {
        sendText(ssn, ssnId);
    }

    public void writeUsername(String username) {
        sendText(username, usernameId);
    }

    public void writePassword(String password) {
        sendText(password, passwordId);
    }

    public void writeConfirmPassword(String password) {
        sendText(password, passwordConfirmId);
    }

    public void clickSubmit() {
        this.clickId(botonSubmit);
    }

    public String encontrarMensajeRegistrado() {
        return this.findText(registrado);
    }

    @AfterEach
    public void cleanDriver() {
        BasePage.closeBrowser();
    }

}