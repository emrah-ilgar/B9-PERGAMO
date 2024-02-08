@wip
Feature:Ich muss mich als Benutzer registrieren können

  Background:
    Given Ich sollte zur Website "url" gehen.

  Scenario Outline:TC_012 login with valid credentials
    Given Der Benutzer klickt auf die Einloggen button
    When Geben Sie die Adresse "<email>" in das E-Mail-Feld ein
    Then Geben Sie die Adresse "<password>" in das Passwort-Feld ein
    And Klickt auf die Anmeldung button
    Then Überprüfen Sie den Text "ORDER HISTORY"

    Examples:
      | email           | password   |
      | kemal@gmail.com | Emrah12345 |