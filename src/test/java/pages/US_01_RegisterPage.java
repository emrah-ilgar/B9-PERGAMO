package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_01_RegisterPage extends BasePage{

    @FindBy(xpath = "(//span[text()='Einloggen'])[1]")
    public WebElement einLoggenButton;

    @FindBy(xpath = "//input[@id='customer_email']")
    public WebElement emailInput;

    @FindBy(id = "customer_password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Anmeldung']")
    public WebElement anmeldungButton;

    @FindBy(xpath = "//h2[contains(text(),'Order history')]      ")
    public WebElement orderText;


}
