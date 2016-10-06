/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import converter.JSONConverter;
import entity.Company;
import static org.junit.Assert.fail;
import org.junit.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.parsing.Parser;
import static org.hamcrest.Matchers.*;
import org.junit.BeforeClass;

/**
 *
 * @author Lasse
 */
public class RestTest {
    @BeforeClass
    public static void setUpBeforeAll() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8084;
        RestAssured.basePath = "/ca-2";
        RestAssured.defaultParser = Parser.JSON;
    }
    
    @Test
    public void testConnection() {
        given().when().get().then().statusCode(200);
    }
    
    @Test
    public void getCompanyByCVR() {
        given().pathParam("n1", "123456").when().get("/api/company/comp/all/{n1}").then().statusCode(200).body("cname", equalTo("The company"));
    }

    @Test
    public void testAddCompany() {
        Company c = new Company();
        c.setCname("Company generated from RestTest");
        c.setCvr("11111111");
        
        JSONConverter cnv = new JSONConverter();
        String jsonstring = cnv.companyToJSON(c);
        
        System.out.println(jsonstring);
        
        given().body(jsonstring).when().contentType("application/json").put("/api/company").then().statusCode(200);
        
        //fail("No implementation");
    }
    
    @Test
    public void editCompany() {
        Company c = new Company();
        c.setId(6); //Fiskeforretningen
        c.setCvr("555666");
        c.setCname("Fiskeforretningen 2");
        
        JSONConverter cnv = new JSONConverter();
        String jsonstring = cnv.companyToJSON(c);
        
        given().body(jsonstring).when().contentType("application/json").post("/api/company").then().statusCode(200);
    }
}
