package co.com.choucair.thirdchallenge.stepdefinitions;

import co.com.choucair.thirdchallenge.model.AddDoctorData;
import co.com.choucair.thirdchallenge.questions.SuccessfullDoctorCreation;
import co.com.choucair.thirdchallenge.questions.SuccessfullPatientCreation;
import co.com.choucair.thirdchallenge.tasks.FillTheFields;
import co.com.choucair.thirdchallenge.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class MedicalAppointmentStepsDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^that Carlos wants to register a new doctor$")
    public void OpenUrl() {
        theActorCalled("Carlos").wasAbleTo(OpenUp.HospitalAdminsSystem());
    }

    @When("^he registers a new doctor in the 'Sistema de administracion de hospitales'$")
    public void heRegistersANewDoctorInTheSistemaDeAdministracionDeHospitales(List<AddDoctorData> addDoctorData) {

        theActorInTheSpotlight().attemptsTo(FillTheFields.with(addDoctorData.get(0)));
    }

    @Then("^he should see message: 'Datos guardados correctamente'$")
    public void heShouldSeeMessageDatosGuardadosCorrectamente() {
        theActorInTheSpotlight().should(
                seeThat("the displayed", SuccessfullDoctorCreation.messageDoctor(), equalTo("Datos guardados correctamente.")));
    }


}
