package pages;

import org.openqa.selenium.By;

import java.util.List;

public class PaginaNuevaCuenta extends BasePage {

    // localizadores
    private By usernameId = By.xpath("//input[@name='username']");
    private By passwordId = By.xpath("//input[@name='password']");
    private By buttonLogin = By.xpath("//input[@value='Log In']");
    private By openNewAccount = By.xpath("//a[normalize-space()='Open New Account']");
    private By tipoCuentaId = By.id("type");
    private By botonSubmit = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input");

    private By cuentaNueva = By.xpath("//p[normalize-space()='Congratulations, your account is now open.']");

    public PaginaNuevaCuenta() {
        super(driver);
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

    public void clickOpenNewAccount() {
        clickId(openNewAccount);
    }


    public void selectTipoCuentaId() {
        selectFromDropdownByValue(tipoCuentaId);

    }

    public void clickButtonSubmit() {
        clickId(botonSubmit);
    }

    public String encontrarMensajeRegistrado() {
        return this.findText(cuentaNueva);
    }







}
