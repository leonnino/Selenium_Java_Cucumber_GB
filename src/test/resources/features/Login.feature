@login @regression
Feature: WebDriver University - Login Page

  Background:
    Given I access the webdriver university login page
  @login1
  Scenario: Validate Successful Login
    When I enter a username webdriver
    And I enter a password webdriver123
    And I click on the login button
    Then I should be presented with the successful longin message

  Scenario: Validate UnSuccessful Login
    When I enter a username 'webdriver'
    And I enter a password webdriver1234
    And I click on the login button
    Then I should be presented with the unsuccessful longin message

  @smoke
  Scenario Outline: Validate Successful & UnSuccessful Login
    When I enter a username <username>
    And I enter a password <password>
    And I click on the login button
    Then I should be presented with the following login validation message <loginValidationMessage>
    Examples:
      | username  | password     | loginValidationMessage |
      | webdriver | webdriver123 | validation succeeded   |
      | webdriver | webdriver1   | validation failed      |
      | x         | y            | validation failed      |
