package net.thucydides.showcase.cucumber.steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class RestStepDefs {

    @Steps
    APISteps apiSteps;


    @Then("^I get a response code as (\\d+)$")
    public void check_response_code(int response_code){apiSteps.checkresponsecode(response_code);}



    @Given("^I request a response from API with a country code as \"([^\"]*)\"$")
    public void iRequestAResponseFromAPIWithACountryCodeAs(String country_code) {
            apiSteps.requestresponse(country_code);
        }

    @And("^I get the country name as \"([^\"]*)\"$")
    public void check_country(String country_name){apiSteps.checkTerritory(country_name);}
}
