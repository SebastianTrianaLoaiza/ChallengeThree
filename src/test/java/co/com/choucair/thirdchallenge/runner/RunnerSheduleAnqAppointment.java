package co.com.choucair.thirdchallenge.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/schedule_an_appointment.feature",
        tags = "@SheduleAnAppointment",
        glue = "co.com.choucair.thirdchallenge.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerSheduleAnqAppointment {
}
