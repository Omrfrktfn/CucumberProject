package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class GooglePage {

    public GooglePage() {

         PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[text()='Tümünü kabul et']")
    public WebElement cerez;

    @FindBy(xpath = "//*[@class='gLFyf']")
    public WebElement aramaKutusu;
}
