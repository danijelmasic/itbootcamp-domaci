package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SobeDomaci {

    private WebDriver driver;

    @FindBy(xpath = "//input[@id='naziv']")
    WebElement nazivField;

    @FindBy(xpath = "//input[@id='adresa']")
    WebElement adresaField;

    @FindBy(xpath = "//input[@id='cena']")
    WebElement cenaField;

    @FindBy(xpath = "//input[@id='slika']")
    WebElement slikaField;

    @FindBy(xpath = "//body/app-root[1]/div[1]/div[1]/div[1]/form-dodaj-smestaj[1]/form[1]/div[5]/button[1]")
    WebElement submitButton;

    public SobeDomaci(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFields(String naziv, String adresa, String cena, String slika){
        nazivField.sendKeys(naziv);
        adresaField.sendKeys(adresa);
        cenaField.sendKeys(cena);
        slikaField.sendKeys(slika);
    }

    public void clickSubmit(){
        submitButton.click();
    }

}
