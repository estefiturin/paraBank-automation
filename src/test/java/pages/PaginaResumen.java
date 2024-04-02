package pages;

import org.openqa.selenium.By;

public class PaginaResumen extends BasePage{

    private By accountOverview = By.xpath("//a[normalize-space()='Accounts Overview']");
    private By messageAccount = By.xpath("//td[contains(text(),'*Balance includes deposits that may be subject to ')]");

    public PaginaResumen() {
        super(driver);
    }

    public void clickAccountOverview() {
        this.clickId(accountOverview);
    }

    public String messageConfirmAccount() {
        return this.findText(messageAccount);
    }


}
