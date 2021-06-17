package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListPage {

    private WebDriver driver;
    private By selectDropDown = By.id("dropdown");

    public DropDownListPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectByName (String dropName){
        Select selectOptionName = new Select(driver.findElement(selectDropDown));
        selectOptionName.selectByVisibleText(dropName);
    }
    public void selectByIndex(int dropIndex){
        Select selectOptionIndex = new Select(driver.findElement(selectDropDown));
        selectOptionIndex.selectByIndex(dropIndex);
    }
    public  void selectByValue(int dropValue){
        Select selectOptionValue = new Select(driver.findElement(selectDropDown));
        selectOptionValue.selectByValue(Integer.toString(dropValue));
    }
}