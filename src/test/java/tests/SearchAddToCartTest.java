package tests;

import org.testng.annotations.*;
import pages.HomePage;
import support.DriverInit;

public class SearchAddToCartTest {
    DriverInit driverinitObj = new DriverInit();
    HomePage home = new HomePage();

    @BeforeMethod
    void startBrowser()
    {
        //DriverInit driverinitObj = new DriverInit();
        driverinitObj.getBrowser();
    }

    @AfterMethod
    void endBrowser()
    {
        driverinitObj.closeBrowser();
    }

    @Test
        public void validateSearchText()
    {
        //DriverInit driverinitObj = new DriverInit();
        //driverinitObj.getBrowser();
        //search tote
       home.searchItem("tote");
       home.checkSearchResult("Ruby on Rails Tote");
       // driverinitObj.closeBrowser();
    }
    @Test
    public void validateNoSearchResult()
    {
       // driverinitObj.getBrowser();
       //not found item
        home.searchItem("junkdata");
        home.checkNSearchResult("No products found");
        //driverinitObj.closeBrowser();
    }

}
