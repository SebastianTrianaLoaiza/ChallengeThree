package co.com.choucair.thirdchallenge.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register_a_patient.feature",
        tags = "@RegisterAPatient",
        glue = "co.com.choucair.thirdchallenge.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerPatientRegister {

}
