package co.com.choucair.thirdchallenge.tasks;

import co.com.choucair.thirdchallenge.model.AddAnAppointment;
import co.com.choucair.thirdchallenge.model.AddDoctorData;
import co.com.choucair.thirdchallenge.model.AddPatient;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.thirdchallenge.userinterface.ScheduleAnAppointment.*;

public class SheduleAnApointment implements Task {

    private final AddAnAppointment addAnAppointment;


    public SheduleAnApointment(AddAnAppointment addAnAppointment) {
        this.addAnAppointment = addAnAppointment;

    }

    public static SheduleAnApointment with(AddAnAppointment addAnAppointment) {
        return Tasks.instrumented(SheduleAnApointment.class, addAnAppointment);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SHEDULE_APPOINTMENT_BUTTON));
        actor.attemptsTo(Enter.theValue(addAnAppointment.getAppointment_day()).into(APPOINTMENT_DAY).thenHit(Keys.ENTER));
        actor.attemptsTo(Enter.theValue(addAnAppointment.getPatient_id()).into(DOCUMENT_PATIENT_ID));
        actor.attemptsTo(Enter.theValue(addAnAppointment.getDoctor_id()).into(DOCUMENT_DOCTOR_ID));
        actor.attemptsTo(Click.on(APPOINTMENT_SAVE_BUTTON));
    }
}
