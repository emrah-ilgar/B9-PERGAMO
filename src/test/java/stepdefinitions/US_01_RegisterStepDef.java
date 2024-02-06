package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.US_01_RegisterPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_01_RegisterStepDef {
    US_01_RegisterPage registerPage=new US_01_RegisterPage();
    @Given("Ich sollte zur Website {string} gehen.")
    public void ich_sollte_zur_website_gehen(String url) {
        Driver.get().get(ConfigurationReader.get(url));
    }

    @Given("Der Benutzer klickt auf die Account button")
    public void derBenutzerKlicktAufDieAccountButton() {
        BrowserUtils.waitFor(3);
        registerPage.einLoggenButton.click();
        BrowserUtils.waitFor(3);
    }


    @When("Geben Sie die Adresse {string} in das E-Mail-Feld ein")
    public void geben_sie_die_adresse_in_das_e_mail_feld_ein(String email) {
        BrowserUtils.waitFor(3);
        registerPage.emailInput.click();
        registerPage.emailInput.sendKeys(email);

    }
    @Then("Geben Sie die Adresse {string} in das Passwort-Feld ein")
    public void geben_sie_die_adresse_in_das_passwort_feld_ein(String passwort) {
        registerPage.passwordInput.sendKeys(passwort);

    }
    @Then("Klickt auf die Anmeldung button")
    public void klickt_auf_die_anmeldung_button() {
        registerPage.anmeldungButton.click();

    }
    @Then("Überprüfen Sie den Text {string}")
    public void überprüfen_sie_den_text(String orderText) {
        Assert.assertEquals(orderText,registerPage.orderText.getText());

    }



}
