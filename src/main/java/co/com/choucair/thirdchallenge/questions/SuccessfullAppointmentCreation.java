package co.com.choucair.thirdchallenge.questions;

import co.com.choucair.thirdchallenge.userinterface.AppointmentShedulingMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SuccessfullAppointmentCreation implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(AppointmentShedulingMessage.CREATION_SUCCESSFULL).getText();
    }

    public static Question<String> messageApp(){
        return new SuccessfullAppointmentCreation();
    }
}
