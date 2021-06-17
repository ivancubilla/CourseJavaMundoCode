package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By dropDownButton = By.linkText("Dropdown");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public DropDownListPage clickLink(){
        driver.findElement(dropDownButton).click();
        return new DropDownListPage(driver);
    }
}
