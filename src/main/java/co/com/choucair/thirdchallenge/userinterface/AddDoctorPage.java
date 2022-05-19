package co.com.choucair.thirdchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddDoctorPage {

    public static Target NEW_DOCTOR_BUTTON = Target.the("Register new doctor").locatedBy("//a[contains(.,'Agregar Doctor')]");
    public static Target DOCTOR_NAME_FIELD = Target.the("New doctor name").locatedBy("//input[@placeholder='Ingrese el nombre']");
    public static Target DOCTOR_LASTNAME_FIELD = Target.the("Doctor lastname").locatedBy("//input[@id='last_name']");
    public static Target DOCTOR_PHONENUMBER_FIELD = Target.the("Doctor phone number").locatedBy("//input[@id='telephone']");
    public static Target DOCTOR_DOCUMENT_TYPE_FIELD = Target.the("Doctor document type").locatedBy("#identification_type");
    public static Target DOCTOR_DOCUMENT_ID_FIELD = Target.the("Doctor document id").locatedBy("#identification");
    public static Target NEW_DOCTOR_SAVE_BUTTON = Target.the("New doctor save button").locatedBy("//a[contains(@onclick,'submitForm()')]");
}
