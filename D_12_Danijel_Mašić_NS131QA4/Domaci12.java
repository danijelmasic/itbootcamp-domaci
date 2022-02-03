import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Domaci12 {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danij\\Desktop\\ItBootcamp\\chromedriver.exe");

        PropReader.fetchProperty("WEBDRIVER.CHROME.PATH");

        WebDriver wd = new ChromeDriver();

        wd.get("https://www.wikipedia.org/");
        wd.manage().window().maximize();

        WebElement klikniJezik = wd.findElement(By.xpath("//select[@id='searchLanguage']"));
        klikniJezik.click();
        Thread.sleep(2000);

        WebElement izaberiJezik = wd.findElement(By.xpath("//option[contains(text(),'Српски / Srpski')]"));
        izaberiJezik.click();
        Thread.sleep(2000);

        WebElement popuniPolje = wd.findElement(By.xpath("//input[@id='searchInput']"));
        popuniPolje.sendKeys("Java");
        Thread.sleep(2000);

        WebElement izaberiUPolju = wd.findElement(By.xpath("//body/div[3]/form[1]/fieldset[1]/div[1]/div[2]/div[1]/a[2]"));
        izaberiUPolju.click();
        Thread.sleep(3000);

        WebElement proveraNaslova = wd.findElement(By.xpath("//h1[@id='firstHeading']"));
        if(proveraNaslova.getText().equals("Java (програмски језик)")){
            System.out.println("Test prosao");
        }else{
            System.out.println("Test nije uspesno prosao");
        }


        wd.close();

    }
}
