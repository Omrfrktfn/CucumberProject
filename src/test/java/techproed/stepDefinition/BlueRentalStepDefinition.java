package techproed.stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

import java.util.Map;

public class BlueRentalStepDefinition {

    BlueRentalPage bluepage = new BlueRentalPage();

    @Then("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        bluepage.loginButton.click();
    }


    @And("kullaniici verilen kullanici bilgileri ile login olur")
    public void kullaniiciVerilenKullaniciBilgileriIleLoginOlur(DataTable data) {

        bluepage.email.sendKeys(data.row(1).get(0), Keys.TAB,
                data.row(1).get(1), Keys.ENTER);
        ReusableMethods.wait(2);
        //    bluepage.email.sendKeys(data.row(1).get(Integer.parseInt(ConfigReader.getProperty(String.valueOf(0)))));
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
        bluepage.email.sendKeys(data.row(2).get(0), Keys.TAB,
                data.row(2).get(1), Keys.ENTER);
        ReusableMethods.wait(2);
    }


    @And("kullaniici verilen  bilgileri ile login olur")
    public void kullaniiciVerilenBilgileriIleLoginOlur(DataTable data) {
        for (Map<String, String> w : data.asMaps()) {
            bluepage.email.sendKeys(w.get("email"), Keys.TAB,
                    w.get("password"), Keys.ENTER);
            ReusableMethods.wait(2);
            Driver.getDriver().navigate().back();
            ReusableMethods.wait(2);
        }

    }

    @And("kullanici exceldeki {string} sayfasindaki bilgiler ile giris yapildigini test eder")
    public void kullaniciExceldekiSayfasindakiBilgilerIleGirisYapildiginiTestEder(String sayfaIsmi) {
        String dosyaYolu = "src/test/resources/mysmoketestdata.xlsx";
        ExcelReader excelReader = new ExcelReader(dosyaYolu, sayfaIsmi);
        for (int i = 1; i <= excelReader.rowCount(); i++) {
            String email = excelReader.getCellData(i, 0);
            String password = excelReader.getCellData(i, 1);
            bluepage.loginButton.click();
            ReusableMethods.wait(1);
            bluepage.email.sendKeys(email, Keys.TAB, password, Keys.ENTER);
            ReusableMethods.wait(1);
            bluepage.loginButton2.click();
            ReusableMethods.wait(1);
            bluepage.profilButton.click();
            ReusableMethods.wait(1);
            Assert.assertEquals(bluepage.profilMail.getText(), email);
            bluepage.loginButton2.click();
            ReusableMethods.wait(1);
            bluepage.logoutButton.click();
            ReusableMethods.wait(1);
            bluepage.okButton.click();
            ReusableMethods.wait(1);

        }
    }
}
