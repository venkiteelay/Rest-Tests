package net.thucydides.showcase.cucumber.steps;


import com.jayway.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

public class APISteps {

    private Response response;

    public void requestresponse(String url, String country_code) {



         response = SerenityRest.given().get(url + country_code);


    }

    public void checkresponsecode(int response_code) {

            response.then().statusCode(response_code);

    }

    public void checkTerritory(String country_name){



        response.then().body("RestResponse.result.name", is(country_name));



    }

    public void postajsonfiletoendpoint(String url, String payload_type)throws IOException{

        String path = System.getProperty("user.dir")+"/src/test/resources/payload.json";

        String payload = new  String(Files.readAllBytes(Paths.get(path)));

       response = SerenityRest.given().body(payload).when().post(url);


    }

    public void Check_for_new_user_id() {

        response.then().body("id",greaterThan(1));



    }

    public void check_converted_names(String fname, String lname) {

        response.then().body("nysiisFirstName",is(fname));
        response.then().body("nysiisFirstName",is(lname));


    }
}
