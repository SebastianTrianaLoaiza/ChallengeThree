#Autor: Sebastian Triana

  @RegisterAPatient
    Feature: register a patient

      @PatientRegister
      Scenario: register a patient
      Given that Carlos want to register a new patient
      When he registers a new patient in the 'Hospitals Administration'
        | name  | lastname  | phone_number | document_type        | document_id |
        | Adam  | Serain    | 3106778798   | Cedula de ciudadania | 235647874   |
      Then he should see the message 'Datos guardados correctamente' displayed
