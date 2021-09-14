package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.DriverInit;
import org.testng.Assert;
public class HomePage {
    DriverInit driverinitObj= new DriverInit();
    WebElement searchElement;
    public void searchItem(String itemName)
    {
        driverinitObj.getDriver().findElement(By.id("keywords")).sendKeys(itemName);
        driverinitObj.getDriver().findElement(By.className("btn")).click();
       // WebElement ele = driverinitObj.getDriver().findElement(By.xpath("//span[@itemprop='name']"));
    }
    public void checkSearchResult(String expectedResult)
    {
        searchElement = driverinitObj.getDriver().findElement(By.xpath("//span[@itemprop='name']"));
        Assert.assertEquals(searchElement.getText(),expectedResult);
    }
    public void checkNSearchResult(String expectedResult)
    {
        searchElement = driverinitObj.getDriver().findElement(By.className("search-results-title"));
        Assert.assertEquals(searchElement.getText(),expectedResult);
    }

    public void goHome()
    {
        //bla bla
    }
}
