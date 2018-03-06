package net.thucydides.showcase.cucumber.steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class RestStepDefs {

    @Steps
    APISteps apiSteps;


    @Then("^I get a response code as (\\d+)$")
    public void check_response_code(int response_code){apiSteps.checkresponsecode(response_code);}





    @And("^I get the country name as \"([^\"]*)\"$")
    public void check_country(String country_name){apiSteps.checkTerritory(country_name);}

    @Given("^I request a response from API with an end point \"([^\"]*)\" and country code as \"([^\"]*)\"$")
    public void iRequestAResponseFromAPIWithAnEndPointAndCountryCodeAs(String url, String country_code)  {
        apiSteps.requestresponse(url,country_code);
    }

    @Given("^I request a response from API with an end point \"([^\"]*)\" and payload as \"([^\"]*)\" file$")
    public void iRequestAResponseFromAPIWithAnEndPointAndPayloadAsFile(String url, String payload_type) throws IOException{


        apiSteps.postajsonfiletoendpoint(url,payload_type);
    }

    @And("^A new user id is generated$")
    public void aNewUserIdIsGenerated()  {

        apiSteps.Check_for_new_user_id();

    }

    @And("^The first name is converted as \"([^\"]*)\" and the family name is converted as \"([^\"]*)\"$")
    public void theFirstNameIsConvertedAsAndTheFamilyNameIsConvertedAs(String fname, String lname)  {

        apiSteps.check_converted_names(fname,lname);

    }
}
