package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;

import static org.junit.Assert.assertTrue;

public class ParaBankStep {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaRegistro registerPage = new PaginaRegistro();

    PaginaNuevaCuenta cuentaPage = new PaginaNuevaCuenta();

    PaginaResumen resumenPage = new PaginaResumen();

    // navagamos al sitio web
    @Given("navegar www.parabank.com")
    public void iNavigateToParaBank() {
        landingPage.navigateToParaBank();
    }

    @When("el usuario selecciona Register")
    public void clickOnBottonRegister() {
        landingPage.clickOnRegisterButton();
    }

    @And("completa los campos solicitados")
    public void completaLosCamposSolicitados() {
        registerPage.writeName("Noelia");
        registerPage.writeLastName("Senn");
        registerPage.writeAdress("Corrientes");
        registerPage.writeCity("Córdoba");
        registerPage.writeState("Córdoba");
        registerPage.writeZipcode("5000");
        registerPage.writePhone("423827");
        registerPage.writeSsn("12344343242");
        registerPage.writeUsername("otros");
        registerPage.writePassword("asdfg");
        registerPage.writeConfirmPassword("asdfg");

    }

    @And("clickea el botón Register")
    public void clickeaElBotonRegister() {
        registerPage.clickSubmit();
    }

    @Then("el sistema muestra el mensaje 'Your account was created successfully. You are now logged in.'")
    public void mostrarMensaje() {
        assertTrue(registerPage.encontrarMensajeRegistrado().equals("Your account was created successfully. You are now logged in."));

        registerPage.cleanDriver();
    }

    @When("el usuario ingresa a su cuenta de usuario")
    public void ingresarCuentaUsuario() {
        cuentaPage.writeUsername("matildetorino");
        cuentaPage.writePassword("password");
        cuentaPage.clickButtonLogin();
    }

    @And("selecciona 'Open New Account'")
    public void clickOpenNewAccount() {
        cuentaPage.clickOpenNewAccount();
    }

    @And("selecciona el tipo de cuenta que desea")
    public void seleccionarTipoDeCuenta() {
        cuentaPage.selectTipoCuentaId();
    }

    @And("clickea el boton 'Open new account'")
    public void clickButtonOpenNewAccount() {
        cuentaPage.clickButtonSubmit();
    }

    @Then("el sistema muestra el mensaje 'Congratulations, your account is now open.'")
    public void mostrarMensajeConfirmacion() {
        assertTrue(cuentaPage.encontrarMensajeRegistrado().contains( "Congratulations, your account is now open."));
    }

    @And("clickea el boton 'Accounts Overview'")
    public void clickButtonAccountOverview() {
        resumenPage.clickAccountOverview();
    }

    @Then("el sistema muestra el mensaje '*Balance includes deposits that may be subject to holds'")
    public void mostrarMensajeAccount() {
        assertTrue(resumenPage.messageConfirmAccount().contains( "*Balance includes deposits that may be subject to holds"));
    }

}
