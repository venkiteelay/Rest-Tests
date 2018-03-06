@get
Feature: Test a Get response of rest API
  Scenario: To Test  Rest API
  Given I request a response from API with a country code as "IN"
  Then I get a response code as 200
  And I get the country name as "India"

