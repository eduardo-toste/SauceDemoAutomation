package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "utils"},
        plugin = {"pretty", "html:target/cucumber-report.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        monochrome = true,
        tags = "@itemSelectionRemoval"

        /*
        TAGS UTILIZADAS NAS FEATURESx
        @loginTests
        @priceSortingTests
        @detailedProduct
        @itemPurchase
        @itemSelectionRemoval
         */
)
public class TestRunner {
}