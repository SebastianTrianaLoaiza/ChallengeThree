package co.com.choucair.thirdchallenge.tasks;

import co.com.choucair.thirdchallenge.model.AddPatient;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.thirdchallenge.userinterface.AddPatient.*;

public class RegisterAPatient implements Task {

    public RegisterAPatient(AddPatient addPatient) {
        this.addPatient = addPatient;
    }

    public static RegisterAPatient with(AddPatient addPatient){
        return Tasks.instrumented(RegisterAPatient.class, addPatient);
    }

    private final AddPatient addPatient;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ADD_PATIENT_BUTTON));
        actor.attemptsTo(Enter.theValue(addPatient.getName()).into(PATIENT_NAME));
        actor.attemptsTo(Enter.theValue(addPatient.getLastname()).into(PATIENT_LASTNAME));
        actor.attemptsTo(Enter.theValue(addPatient.getPhone_number()).into(PATIENT_PHONE_NUMBER));
        actor.attemptsTo(Click.on(PATIENT_DOCUMENT_TYPE));
        actor.attemptsTo(Enter.theValue(addPatient.getDocument_id()).into(PATIENT_DOCUMENT_ID));
        actor.attemptsTo(Click.on(PATIENT_SAVE_BUTTON));

    }
}
