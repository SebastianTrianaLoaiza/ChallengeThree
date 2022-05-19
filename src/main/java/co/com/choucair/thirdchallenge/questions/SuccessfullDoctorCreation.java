package co.com.choucair.thirdchallenge.questions;

import co.com.choucair.thirdchallenge.userinterface.DoctorCreateMessage;
import co.com.choucair.thirdchallenge.userinterface.PatientCreateMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SuccessfullDoctorCreation implements Question<String>{

    public static Question<String> messageDoctor(){
        return new SuccessfullDoctorCreation();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(DoctorCreateMessage.CREATION_SUCCESSFULL).getText();
    }
}
