package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablePage;

import java.security.Key;

public class DataTableStepDefinition {


    DataTablePage dataTablePage = new DataTablePage();

    @Then("kullanici sayfadaki tabloda new butonuna tiklar.")
    public void kullaniciSayfadakiTablodaNewButonunaTiklar() {

        dataTablePage.newButton.click();

    }

    @And("cikan pencerede verilen bilgiler girilir {string},{string},{string},{string},{string},{string},{string}")
    public void cikanPenceredeVerilenBilgilerGirilir(String firstname, String lastname, String position, String office, String extention, String date, String salary) {
        dataTablePage.firstName.sendKeys(firstname, Keys.TAB, lastname, Keys.TAB,position, Keys.TAB,office, Keys.TAB,extention, Keys.TAB,date, Keys.TAB,salary);
    }


    @And("kullanici create butonuna basar")
    public void kullaniciCreateButonunaBasar() {
        dataTablePage.createButton.click();
    }


    @And("kullanici search bolumune {string} bilgisini girer.")
    public void kullaniciSearchBolumuneBilgisiniGirer(String str) {

        dataTablePage.searchBox.sendKeys(str);
    }


    @And("kullanici {string} ile basarili giris yapildgini dogrular")
    public void kullaniciIleBasariliGirisYapildginiDogrular(String name) {
        Assert.assertTrue(dataTablePage.verify.getText().contains(name));
    }


}
