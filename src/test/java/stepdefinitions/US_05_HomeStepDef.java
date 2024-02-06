package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US_05_HomePage;


public class US_05_HomeStepDef {
    US_05_HomePage homePage=new US_05_HomePage();

    @Given("Der Benutzer sollte das folgende {string} sehen können")
    public void derBenutzerSollteDasFolgendeSehenKönnen(String menuName) {
        homePage.navigateMenu(menuName);
    }

    @Then("Der Benutzer bewegt sich mit der Maus über das {string} und sollte die {string} sehen können")
    public void derBenutzerBewegtSichMitDerMausÜberDasUndSollteDieSehenKönnen(String menuName,String subMenuName) {
        homePage.navigateSubMenu(menuName,subMenuName);
    }
}
