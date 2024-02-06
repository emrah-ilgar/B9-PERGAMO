@wip
Feature:Ich muss mich als Benutzer registrieren können

  Background:
    Given Ich sollte zur Website "url" gehen.

    Scenario:
      Given Der Benutzer klickt auf die Account button


  Scenario Outline:TC_012 login with valid credentials
    When Geben Sie die Adresse "<email>" in das E-Mail-Feld ein
    Then Geben Sie die Adresse "<password>" in das Passwort-Feld ein
    And Klickt auf die Anmeldung button
    Then Überprüfen Sie den Text "Order history"

    Examples:
      | email                | password  |
      | kemal@gmail.com | Emrah12345 |