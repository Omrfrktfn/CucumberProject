package techproed.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // test calistirici notasyon
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        //rerun ile berlittigimiz dosyada fail olan senaryolar tutulur.
        features = "@TestOutput/failed_scenario.txt",
        glue = {"techproed/stepDefinition"},
        //tags = "@techpro or @iphone",
        dryRun = false,
        monochrome = false // true olursa tek renk olur hepsi cikti da
)
public class FailedRunner {

}
