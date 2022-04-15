package Util;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiUtils {

    public static Response GetHouses(){
        RestAssured.baseURI ="http://localhost:3000";
        RequestSpecification request = RestAssured.given();
        request.param("price_gte", "450000");
        request.param("price_lte", "666000");
        request.param("city", "Austin");
        Response response = request.get("/houses");

        return response;
    }

}
