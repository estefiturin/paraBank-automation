@Transfer
Feature: realizar transferencias
  Como usuario cliente, Quiero realizar una transferencia, Para enviar dinero a otra cuenta
  Background: el usuario se encuentra dentro de su cuenta
    Given el usuario ingresa a su cuenta y hace click en 'Transfers Fund'

    Scenario: realizar transferencia de manera exitosa
      When el usuario completa el monto a transferir
      And selecciona una cuenta de destino
      And hace click en el boton 'Transfer'
      Then el sistema confirma la transferencia con el siguiente mensaje:'Transfer Complete!'