package test;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropDownListPage;
import pages.HomePage;

public class ProyectTest extends BaseTest {

    @Test
    public void testDropByName(){
        DropDownListPage dropDownListPage = homePage.clickLink();
        dropDownListPage.selectByName("Option 2");
        dropDownListPage.selectByIndex(1);
        dropDownListPage.selectByValue(2);
    }
}
