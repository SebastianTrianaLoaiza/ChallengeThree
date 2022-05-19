package co.com.choucair.thirdchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ScheduleAnAppointment {

    public static final Target SHEDULE_APPOINTMENT_BUTTON = Target.the("New appointment Button").locatedBy("//a[@href='appointmentScheduling']");
    public static final Target APPOINTMENT_DAY = Target.the("Appointment day").locatedBy("#datepicker");
    public static final Target DOCUMENT_PATIENT_ID = Target.the("document patient id").locatedBy("//input[contains(@placeholder,'Ingrese el documento de identidad del paciente')]");
    public static final Target DOCUMENT_DOCTOR_ID = Target.the("document doctor id").locatedBy("//input[contains(@placeholder,'Ingrese el documento de identidad del doctor')]");
    public static final Target APPOINTMENT_SAVE_BUTTON = Target.the("Appointment save button").locatedBy("//a[@onclick='submitForm()']");
}
