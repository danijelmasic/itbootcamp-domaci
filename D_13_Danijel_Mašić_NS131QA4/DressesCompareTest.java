package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.ContactUs;
import utils.PropReader;
import utils.Random;

import java.io.IOException;
import java.time.Duration;

public class DressesCompareTest {

    private WebDriver driver;

    @BeforeClass
    public void init() throws IOException{
        System.setProperty("webdriver.chrome.driver",
                PropReader.fetchProperty("WEBDRIVER.CHROME.PATH"));

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void zatvoriWebDriver() {driver.close();}

    @Test
    public void DressesCompareHappyPath() throws IOException, InterruptedException {
        System.out.println("Go to the website: http://automationpractice.com/index.php?id_category=8&controller=category");
        driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?id_category=8&controller=category");

        DressesCompare dresses = new DressesCompare(driver);

        System.out.println("Add both dresses to compare");
        dresses.addDressesToCompare();

        System.out.println("Click the 'compare' button");
        dresses.clickCompareButton();

        String firstDressProperty = dresses.getFirstProperty();
        String secondDressProperty = dresses.getSecondProperty();

        Assert.assertEquals(firstDressProperty, "Colorful Dress");
        Assert.assertEquals(secondDressProperty, "Short Dress");

        System.out.println("Dresses are successfully compared.");




    }
}
