package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    // Crea objeto WebElement - COLUMNA VERTEBRAL DE MI FRAMEWORK
    private WebElement Find(String locator) {
        // manejo las esperas dentro de es método
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    // Re
    public void clickElement(String locator) {
        Find(locator).click();
    }
    //Re
    public void write(String locator, String keysToSend){
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }

    public void sendText(String input, By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(input);
    }

    public void clickId(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        driver.findElement(locator).click();
    }

    // busca texto
    public String findText(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator).getText();
    }

}
