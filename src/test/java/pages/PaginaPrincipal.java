package pages;

public class PaginaPrincipal extends BasePage{

    // localizadores
    private String registerButton = "//a[normalize-space()='Register']";

    public PaginaPrincipal() {
        super(driver);
    }

    //Método para navegar a ParaBank.com
    public void navigateToParaBank() {
        navigateTo("https://parabank.parasoft.com/");
    }

    // Método para hacer click en Boton Register
    public void clickOnRegisterButton() {
        clickElement(registerButton);
    }


}
