#Autor: Sebastian Triana

@SheduleAnAppointment
Feature: shedule an appointment

  @RegisterAnApointment
  Scenario: shedule an appointment
    Given that Carlos needs to go to the Doctor
    When he registers a new appointment
    | appointment_day | patient_id | doctor_id |
    | 05/18/2022      | 2          | 1         |
    Then he should see on the screen the message: 'Datos guardados correctamente'

