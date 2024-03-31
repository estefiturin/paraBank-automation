@GestionarCuenta
Feature: GestionarCuentas
  Background: el usuario se encuentra en la pagina principal sin iniciar sesion
    Given navegar a https://parabank.parasoft.com/parabank/index.htm

    @Registrar
    Scenario: registrar cuenta de manera exitosa
      When el usuario selecciona Register
      And completa los campos solicitados
      And clickea el botón Register
      Then el sistema muestra el mensaje 'Your account was created successfully. You are now logged in.'

