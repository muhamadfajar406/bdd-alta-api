Feature: Login
  As a Demo Qa
  I want to see my timeline
  So that I can like or comment my friend post


  Scenario: Login Success
    Given I am on the Login page
    When I enter my username and Password correctly
    When I click 'execution' buttom
    Then I am taken to the dashboard


  Scenario: Login with failed password
    Given I am on the Login page with failed case
    When I enter my username correctly and Password Blank
    When I click 'execution' buttom with failed
    Then Warning Password invalid and stay Sign in page



