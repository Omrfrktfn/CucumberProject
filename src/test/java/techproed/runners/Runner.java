package techproed.runners;

/*
Runner class'i testNG'deki .xml file kullanimindaki gibi
istedigimiz scenario'lari kullanacagimiz tag parametresi
sayesinde calistirabiliriz. Ve plugin parametresi ile raporlar alabiliriz.
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // test calistirici notasyon
@CucumberOptions(features = "src/test/resources/features",
        glue = {"techproed/stepDefinition"},
        //tags = "@techpro or @iphone",
         tags = "@techall",
        dryRun = false)

//tags bolumune @all yazarsak tum hepsini calistirir

public class Runner {

}
/*
@CucumberOptions() notasyonuna parametre olarak
       features package yolunu
       glue --> stepdefinition package
       tag --> calistirmak istedigimiz scenariolar
       dryRun = false//true secersek scenariolari kontrol eder browser'i calistirmaz
       Scenariolarin nerede ve nasil calisacagi hangi raporu kullanacagi ile alakali
       secenekleri bu notasyonda belirtecegiz

 */