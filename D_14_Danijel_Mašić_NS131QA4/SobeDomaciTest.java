package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.PropReader;

import java.io.IOException;
import java.time.Duration;

public class SobeDomaciTest {

    WebDriver wd;

    @BeforeClass
    public void init() throws IOException {
        System.setProperty("webdriver.chrome.driver",
                PropReader.fetchProperty("WEBDRIVER.CHROME.PATH"));

        wd = new ChromeDriver();

        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void SobeDomaciTestValid() throws InterruptedException {
        wd.get("https://it-255-dz-06-andjela-bojic3972.vercel.app/");
        wd.manage().window().maximize();

        SobeDomaci test1 = new SobeDomaci(wd);

        test1.enterFields(" ", "Nije Bitno 3", "12345", "https://pbs.twimg.com/media/EsCSzBjXEAExu3d.jpg");

        test1.clickSubmit();

        Thread.sleep(4000);

    }

    @AfterClass
    public void zatvoriWebDriver() {
        wd.close();
    }

}
