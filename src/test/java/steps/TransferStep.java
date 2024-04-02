package steps;

import io.cucumber.java.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import pages.PaginaTransferencia;

import static org.junit.Assert.assertTrue;

public class TransferStep {

    PaginaTransferencia transferPage = new PaginaTransferencia();

    @Given("el usuario ingresa a su cuenta y hace click en 'Transfers Fund'")
    public void pasosPrevios() {
        transferPage.navigateToParaBank();
        transferPage.writeUsername("matildetorino");
        transferPage.writePassword("password");
        transferPage.clickButtonLogin();
        transferPage.clickTransferFund();
    }


    @When("el usuario completa el monto a transferir")
    public void completarCampos() {
        transferPage.writeField("200");
    }


    @And("selecciona una cuenta de destino")
    public void clickCuentaDestino() {
        transferPage.selectAccountDestino();
    }

    @And("hace click en el boton 'Transfer'")
    public void clickButtonTransfer() {
        transferPage.clickButtonTransfer();
    }

    @Then("el sistema confirma la transferencia con el siguiente mensaje:'Transfer Complete!'")
    public void mensajeTransferenciaCompleta() {
        assertTrue(transferPage.messageConfirm().contains("Transfer Complete!"));
    }

}
