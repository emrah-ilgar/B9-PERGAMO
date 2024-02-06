package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;
import utilities.Driver;

public class US_05_HomePage extends BasePage {
    public void navigateMenu(String menuName) {

        WebElement menü = Driver.get().findElement(By.xpath("//*[text()='" + menuName + "']"));
        BrowserUtils.verifyElementDisplayed(menü);

    }

    public void navigateSubMenu(String menuName, String subMenuName) {

        WebElement menü = Driver.get().findElement(By.xpath("//*[text()='" + menuName + "']"));
        BrowserUtils.hover(menü);

        WebElement subMenu = Driver.get().findElement(By.xpath("//*[text()='" + subMenuName + "']"));
        BrowserUtils.verifyElementDisplayed(subMenu);


    }
}
