package Util;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiUtils {

    public static Response getAllHouses(){
        RestAssured.baseURI = ApiPathConstants.BASE_URL;
        RequestSpecification request = RestAssured.given();
        Response response = request.get(ApiPathConstants.HOUSES);

        return response;
    }

    public static Response getHousesSpecificParams(String priceGte, String priceLte, String city){
        RestAssured.baseURI = ApiPathConstants.BASE_URL;
        RequestSpecification request = RestAssured.given();
        request.param("price_gte", priceGte);
        request.param("price_lte", priceLte);
        request.param("city", city);
        Response response = request.get(ApiPathConstants.HOUSES);

        return response;
    }

    public static Response getHousesCustomParams(String paramKey, String paramValue){
        RestAssured.baseURI = ApiPathConstants.BASE_URL;
        RequestSpecification request = RestAssured.given();
        request.param(paramKey, paramValue);
        Response response = request.get(ApiPathConstants.HOUSES);

        return response;
    }
}
