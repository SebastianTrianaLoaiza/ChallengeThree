package co.com.choucair.thirdchallenge.tasks;

import co.com.choucair.thirdchallenge.model.AddDoctorData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.thirdchallenge.userinterface.AddDoctorPage.*;

public class FillTheFields implements Task {

    public FillTheFields(AddDoctorData addDoctorData) {
        this.addDoctorData = addDoctorData;
    }

    private AddDoctorData addDoctorData;

    public static FillTheFields with(AddDoctorData addDoctorData) {
        return Tasks.instrumented(FillTheFields.class,addDoctorData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(NEW_DOCTOR_BUTTON));
        actor.attemptsTo(Enter.theValue(addDoctorData.getName()).into(DOCTOR_NAME_FIELD));
        actor.attemptsTo(Enter.theValue(addDoctorData.getLastname()).into(DOCTOR_LASTNAME_FIELD));
        actor.attemptsTo(Enter.theValue(addDoctorData.getPhone_number()).into(DOCTOR_PHONENUMBER_FIELD));
        actor.attemptsTo(Click.on(DOCTOR_DOCUMENT_TYPE_FIELD));
        actor.attemptsTo(Enter.theValue(addDoctorData.getDocument_id()).into(DOCTOR_DOCUMENT_ID_FIELD),
                Click.on(NEW_DOCTOR_SAVE_BUTTON)
                );

    }
}
