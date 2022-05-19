#Autor: Sebastian Triana

  @AddDoctor
    Feature: as a patient i want to make a request for a medical appointment
      in the 'Sistema de administración de hospitales'

      @RegisterADoctor
    Scenario: register a doctor
      Given that Carlos wants to register a new doctor
      When he registers a new doctor in the 'Sistema de administracion de hospitales'
        | name  | lastname  | phone_number | document_type        | document_id |
        | Jo  | Jaramillo | 1234    | Cedula de ciudadania | 1342      |
      Then he should see message: 'Datos guardados correctamente'
