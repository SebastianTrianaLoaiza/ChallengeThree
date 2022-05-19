package co.com.choucair.thirdchallenge.stepdefinitions;

import co.com.choucair.thirdchallenge.model.AddAnAppointment;
import co.com.choucair.thirdchallenge.questions.SuccessfullAppointmentCreation;
import co.com.choucair.thirdchallenge.tasks.OpenUp;
import co.com.choucair.thirdchallenge.tasks.SheduleAnApointment;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class SheduleAnAppointmentStepsDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^that Carlos needs to go to the Doctor$")
    public void thatCarlosNeedsToGoToTheDoctor() {
        theActorCalled("Carlos").wasAbleTo(OpenUp.HospitalAdminsSystem());
    }

    @When("^he registers a new appointment$")
    public void heRegistersANewAppointment(List<AddAnAppointment> infoAppointment) {

        theActorInTheSpotlight().attemptsTo(SheduleAnApointment.with(infoAppointment.get(0)));

    }

    @Then("^he should see on the screen the message: 'Datos guardados correctamente'$")
    public void heShouldSeeOnTheScreenTheMessageDatosGuardadosCorrectamente() {
        theActorInTheSpotlight().should(
                seeThat("the displayed", SuccessfullAppointmentCreation.messageApp(), equalTo("Datos guardados correctamente.")));
    }
}
