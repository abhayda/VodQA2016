@signup @taggedagain
Feature:
  As a user
  I want to be able to add new clients in the system
  So that i can add accounting data for that client

  Background:
    Given the user is on landing page
    When she chooses to sign up

  @Signup-Simple
  Scenario: Sign up a new user
    And she provides the first name as Sukesh
    And she provides the last name as Kumar
    And she provides the email as validemail@aq.com
    And she provides the password as password
    And she provides the confirm password again as password
    And she signs-up
    Then she should be logged in to the application
    Then close browser

  @Signup-DataDriven
  Scenario Outline: Data driving new user sign-up
    And she provides the first name as <firstName>
    And she provides the last name as <lastName>
    And she provides the email as <email>
    And she provides the password as <password>
    And she provides the confirm password again as <password>
    And she signs-up
    Then she should be logged in to the application
    Then close browser
    Examples:
      | firstName | lastName | email             | password |
      | Sukesh    | Kumar    | validemail@aq.com | password |
      | Sukesh1    | Kumar1    | validemail@aq.com | password |

  @TableDriven
  Scenario: Sign-up a new user with datatable example
    And she provides the her details as follows:
      | firstName | lastName | email             | password |
      | Sukesh    | Kumar    | sukesh.km@aq.com | password |
    And she signs-up
    Then she should be logged in to the application
