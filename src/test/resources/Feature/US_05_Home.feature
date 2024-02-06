@home
Feature: Als Benutzer sollte ich auf der Startseite Kategorien und Unterkategorien auswählen können

  Background:
    Given Ich sollte zur Website "url" gehen.
  @B9PR-34
  Scenario Outline:
    Given Der Benutzer sollte das folgende "<menü>" sehen können
    Examples:
      | menü            |
      | Home            |
      | Frühstück       |
      | Backen & Kochen |
      | Nüsse & Kerne   |
      | Shop            |
      | Aktion          |
      | Großhandel      |
  @B9PR-35
  Scenario Outline:
    Then Der Benutzer bewegt sich mit der Maus über das "Frühstück" und sollte die "<submenü>" sehen können
    Examples:
      | submenü       |
      | Milchprodukte |
      | Oliven        |
  @B9PR-35
  Scenario Outline:
    And Der Benutzer bewegt sich mit der Maus über das "Shop" und sollte die "<submenü>" sehen können
    Examples:
      | submenü                 |
      | Fleisch                 |
      | Essig & Sauce           |
      | Geschenk                |
      | Gesundheitsprodukte     |
      | Olivenöl                |
      | Premium Medjool Datteln |
      | Sesampaste und Malasse  |
      | Tee und Kaffe Sorten    |
      | Trockenfrüchte          |
      | Trockenprodukte         |
      | Türkische Desserts      |
  @B9PR-35
  Scenario Outline:
    Then Der Benutzer bewegt sich mit der Maus über das "Aktion" und sollte die "<submenü>" sehen können
    Examples:
      | submenü       |
      | Angebote      |
      | Vorteilspaket |
  @B9PR-35
  Scenario Outline:
    Then Der Benutzer bewegt sich mit der Maus über das "Großhandel" und sollte die "<submenü>" sehen können
    Examples:
      | submenü       |
      | B2B Angebot   |






