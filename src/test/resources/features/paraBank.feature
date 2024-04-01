@GestionarCuenta
Feature: GestionarCuentas
  Background: el usuario se encuentra en la pagina principal sin iniciar sesion
    Given navegar www.parabank.com

    @Registrar
    Scenario: registrar cuenta de manera exitosa
      When el usuario selecciona Register
      And completa los campos solicitados
      And clickea el botón Register
      Then el sistema muestra el mensaje 'Your account was created successfully. You are now logged in.'

    @NewAccount
    Scenario: registrar nueva cuenta bancaria
      When el usuario ingresa a su cuenta de usuario
      And selecciona 'Open New Account'
      And selecciona el tipo de cuenta que desea
      And clickea el boton 'Open new account'
      Then el sistema muestra el mensaje 'Congratulations, your account is now open.'