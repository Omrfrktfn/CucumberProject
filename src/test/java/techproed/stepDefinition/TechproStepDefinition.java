package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.TechproPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TechproStepDefinition {

    TechproPage techpro = new TechproPage();

    @Given("kullanici techpro sayfasina gider")
    public void kullaniciTechproSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));
        ReusableMethods.wait(1);
    }

    @Then("arama kutusunda qa aratir")
    public void aramaKutusundaQaAratir() {

        techpro.searchBox.sendKeys("aq", Keys.ENTER);
        ReusableMethods.wait(1);
    }

    @And("sayfa basliginin qa icerdigini test eder")
    public void sayfaBasligininQaIcerdiginiTestEder() {
        Assert.assertFalse(Driver.getDriver().getTitle().contains("qa"));
    }

    @Then("arama kutusunda java aratir")
    public void aramaKutusundaJavaAratir() {
        techpro.searchBox.sendKeys("java", Keys.ENTER);
        ReusableMethods.wait(1);
    }

    @And("sayfa basliginin java icerdigini test eder")
    public void sayfaBasligininJavaIcerdiginiTestEder() {
        Assert.assertFalse(Driver.getDriver().getTitle().contains("java"));
    }

    @Then("arama kutusunda mobil aratir")
    public void aramaKutusundaMobilAratir() {
        techpro.searchBox.sendKeys("mobil");
        ReusableMethods.wait(3);
    }

    @When("cikan dropdown da mobil developer linkine tiklar")
    public void cikanDropdownDaMobilDeveloperLinkineTiklar() {
        techpro.mobilDeveloper.click();
        ReusableMethods.wait(2);
    }

    @And("sayfa basliginin Mobile icerdigini test eder")
    public void sayfaBasligininMobileIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Mobile"));
    }

    @Given("kullanici {string} url sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @Then("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String str) {
        techpro.searchBox.sendKeys(str);
    }
}














