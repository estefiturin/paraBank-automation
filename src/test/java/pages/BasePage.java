package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    // --------------------- CONFIGURACIÓN PRINCIPAL ---------------------------------

    // instancia de driver
    protected static WebDriver driver;

    // se utiliza para esperar que se den condiciones especificas en una página web
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    static {
        // descargar el ChromeDriver para la versión actual
        WebDriverManager.chromedriver().setup();
        // se crea una nueva instancia de ChromeDriver y se la asigna a Driver.
        driver = new ChromeDriver();
    }

    // constructor de la BasePage
    public BasePage(WebDriver driver){
        BasePage.driver =driver;
    }

    // métodos para navegar
    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.quit();
    }

    // --------------------------------------------------------------------------------------

}
