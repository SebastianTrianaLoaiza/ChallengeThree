package co.com.choucair.thirdchallenge.stepdefinitions;

import co.com.choucair.thirdchallenge.model.AddDoctorData;
import co.com.choucair.thirdchallenge.model.AddPatient;
import co.com.choucair.thirdchallenge.questions.SuccessfullAppointmentCreation;
import co.com.choucair.thirdchallenge.questions.SuccessfullPatientCreation;
import co.com.choucair.thirdchallenge.tasks.FillTheFields;
import co.com.choucair.thirdchallenge.tasks.OpenUp;
import co.com.choucair.thirdchallenge.tasks.RegisterAPatient;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class PatientRegisterStepsDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }


    @Given("^that Carlos want to register a new patient$")
    public void thatCarlosWantToRegisterANewPatient() {
        theActorCalled("Carlos").wasAbleTo(OpenUp.HospitalAdminsSystem());
    }

    @When("^he registers a new patient in the 'Hospitals Administration'$")
    public void heRegistersThePatientInTheHospitalsAdministration(List<AddPatient> dataPatient) {

        theActorInTheSpotlight().attemptsTo(RegisterAPatient.with(dataPatient.get(0)));

    }

    @Then("^he should see the message 'Datos guardados correctamente' displayed$")
    public void heShouldSeeTheMessageDatosGuardadosCorrectamenteDisplayed() {
        theActorInTheSpotlight().should(
                seeThat("the displayed", SuccessfullPatientCreation.messagePatient(), equalTo("Datos guardados correctamente.")));
    }
}
