package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalPage {

    public BlueRentalPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a)[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@type='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement loginButton2;

    @FindBy(xpath = "//*[.='Profile']")
    public WebElement profilButton;

    @FindBy(xpath = "//em")
    public WebElement profilMail;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//*[.='OK']")
    public WebElement okButton;
}
