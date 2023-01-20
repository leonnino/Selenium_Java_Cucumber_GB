@contact-us @regression

Feature: WebDriver University - Contact Us Page

  Background:
    Given I access the webdriver univeristy contact us page
  @smoke
  Scenario: Validate Successful Submission - Unique Data

    When I enter a unique first name
    And I enter a unique last name
    And I enter a unique email adress
    And I enter a unique comment
    And I click on submit button
    Then I should be presented with a successful contact us submission message

  Scenario: Validate Successful Submission - Specific Data
    When I enter a specific first name joe
    And I enter a specific last name bugs
    And I enter a specific email address joe_blogs123@mail.com
    And I enter a specific comment "hello world"
    And I click on submit button
    Then I should be presented with a successful contact us submission message