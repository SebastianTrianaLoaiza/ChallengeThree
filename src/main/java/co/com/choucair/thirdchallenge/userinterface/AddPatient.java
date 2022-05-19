package co.com.choucair.thirdchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AddPatient {

    public static final Target ADD_PATIENT_BUTTON = Target.the("Add patient button").locatedBy("[href='addPatient']");
    public static final Target PATIENT_NAME = Target.the("Patient name").locatedBy("//input[@name='name']");
    public static final Target PATIENT_LASTNAME = Target.the("Patient lastname").locatedBy("//input[contains(@name,'last_name')]");
    public static final Target PATIENT_PHONE_NUMBER = Target.the("Patient phone number").locatedBy("//input[contains(@name,'telephone')]");
    public static final Target PATIENT_DOCUMENT_TYPE = Target.the("Patient docmuet type").locatedBy("//select[contains(@class,'form-control')]");
    public static final Target PATIENT_DOCUMENT_ID = Target.the("Patient document id").locatedBy("//input[contains(@name,'identification')]");
    public static final Target PATIENT_SAVE_BUTTON = Target.the("Patient save button").locatedBy("//a[contains(@onclick,'submitForm()')]");

}
