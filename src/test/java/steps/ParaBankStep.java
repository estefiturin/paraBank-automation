package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;

import static org.junit.Assert.assertTrue;

public class ParaBankStep {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaRegistro registerPage = new PaginaRegistro();

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



}
