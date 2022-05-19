package co.com.choucair.thirdchallenge.questions;

import co.com.choucair.thirdchallenge.userinterface.PatientCreateMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SuccessfullPatientCreation implements Question<String> {

    public static Question<String> messagePatient(){
        return new SuccessfullPatientCreation();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(PatientCreateMessage.CREATION_SUCCESSFULL).getText();
    }
}
