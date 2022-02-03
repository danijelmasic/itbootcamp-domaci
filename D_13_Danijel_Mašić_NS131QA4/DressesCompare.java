package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DressesCompare {

    private WebDriver driver;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]")
    WebElement hoverOverFirstDress;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]")
    WebElement hoverOverSecondDress;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[3]/div[2]/a[1]")
    WebElement addFirstDressToCompare;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[3]/div[2]/a[1]")
    WebElement addSecondDressToCompare;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/form[1]/button[1]")
    WebElement compareButton;

    @FindBy(xpath = "//td[contains(text(),'Colorful Dress')]")
    WebElement firstDressProperty;

    @FindBy(xpath = "//td[contains(text(),'Short Dress')]")
    WebElement secondDressProperty;

    public DressesCompare(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addDressesToCompare() throws InterruptedException{
        Actions action = new Actions(driver);

        action.moveToElement(hoverOverFirstDress);
        action.moveToElement(addFirstDressToCompare).click().build().perform();
        Thread.sleep(3000);
        action.moveToElement(hoverOverSecondDress);
        action.moveToElement(addSecondDressToCompare).click().build().perform();

    }

    public void clickCompareButton(){
        compareButton.click();
    }

    public String getFirstProperty(){
        return firstDressProperty.getText();
    }

    public String getSecondProperty(){
        return secondDressProperty.getText();
    }
}
