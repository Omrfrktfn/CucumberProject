package techproed.stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class GoogleStepDefinition {

    GooglePage google = new GooglePage();

    @Given("kullanici {string} sayfasina gitti.")
    public void kullaniciSayfasinaGitti(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @When("kullanici google arama kutusunda {string} aratir.")
    public void kullaniciGoogleAramaKutusundaAratir(String arac) {
        google.cerez.click();
        ReusableMethods.wait(1);
        google.aramaKutusu.sendKeys(arac, Keys.ENTER);
        //  ReusableMethods.wait(1);

    }

    @When("google sayfasinda basiligin {string} icerdigini test eder.")
    public void googleSayfasindaBasiliginIcerdiginiTestEder(String baslik) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslik));
    }

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sayi) {
        try {
            Thread.sleep(sayi * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("kullanici google arama kutusunda properties'den {string} aratti.")
    public void kullaniciGoogleAramaKutusundaPropertiesDenAratti(String araclar) {

        google.cerez.click();
        ReusableMethods.wait(1);
        google.aramaKutusu.sendKeys(ConfigReader.getProperty(araclar), Keys.ENTER);

    }

    @And("google sayfasinda basiligin {string} icerigini test ett.")
    public void googleSayfasindaBasiliginIceriginiTestEtt(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(str)));
    }

    @Then("kullanici data tableda verilen bilgileri aratir")
    public void kullaniciDataTabledaVerilenBilgileriAratir(DataTable data) {

        System.out.println(data.asList());
        google.cerez.click();
        for (int i = 1; i < data.asList().size(); i++) {
            ReusableMethods.wait(1);
            google.aramaKutusu.sendKeys(data.asList().get(i), Keys.ENTER);
            ReusableMethods.wait(1);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(data.asList().get(i)));
            google.aramaKutusu.clear();
        }

    }

/*
    @And("kullanici cerezi kapatir")
    public void kullaniciCereziKapatir() {
        google.cerez.click();
    }

 */
}
