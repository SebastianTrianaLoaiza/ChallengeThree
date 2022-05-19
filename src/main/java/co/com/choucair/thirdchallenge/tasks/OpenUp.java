package co.com.choucair.thirdchallenge.tasks;

import co.com.choucair.thirdchallenge.userinterface.HospitalsUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private HospitalsUrl hospitalAdminsUrl;

    public static OpenUp HospitalAdminsSystem() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(hospitalAdminsUrl));
    }

}

