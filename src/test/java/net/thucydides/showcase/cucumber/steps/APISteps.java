package net.thucydides.showcase.cucumber.steps;

import com.jayway.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import static org.hamcrest.Matchers.is;

public class APISteps {

    private String url = "http://services.groupkt.com/country/get/iso2code/";
    private Response response;

    public void requestresponse(String country_code) {



         response = SerenityRest.given().get(url + country_code);


    }

    public void checkresponsecode(int response_code) {

            response.then().statusCode(response_code);

    }

    public void checkTerritory(String country_name){



        response.then().body("RestResponse.result.name", is(country_name));



    }
}
