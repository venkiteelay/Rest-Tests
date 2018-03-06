
Feature: To Test  Rest API
  @get
  Scenario: To Test a response from Rest API by invoking GET method
  Given I request a response from API with an end point "http://services.groupkt.com/country/get/iso2code/" and country code as "IN"
  Then I get a response code as 200
  And I get the country name as "India"

  @post
  Scenario: To Test a response from Rest API by invoking POST method
    Given I request a response from API with an end point "https://localhost:8080/NysiisLocal/nysiis/convert" and payload as "json" file
    Then I get a response code as 200
    And The first name is converted as "JARY" and the family name is converted as "FALAP"



