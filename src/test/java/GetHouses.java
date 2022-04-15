import Model.House;
import Util.ApiUtils;
import Util.ErrorMessageConstants;
import Util.JsonUtils;
import Util.VerificationUtil;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


public class GetHouses {

    @Test
    public void GetAllHouses() throws Exception {

        Response response = ApiUtils.getAllHouses();
        House[] responseHouses = JsonUtils.mapHouses(response.getBody().asString());

        // Assert Status code, Check all houses
        assertEquals(200, response.getStatusCode());
        VerificationUtil.verifyResponseData(responseHouses);
    }

    @Test
    public void GetHousesWithCorrectPriceAndCity() throws Exception {

        Response response = ApiUtils.getHousesSpecificParams("450000", "666000", "Austin");
        House[] responseHouses = JsonUtils.mapHouses(response.getBody().asString());

        // Assert Status code, Check house list, Price range
        assertEquals(200, response.getStatusCode());
        VerificationUtil.verifyResponseData(responseHouses);
        VerificationUtil.checkPriceRange(responseHouses, 450000, 666000);
    }

    @Test
    public void GetHousesWithInvalidPriceAndCity() throws Exception {

        Response response = ApiUtils.getHousesSpecificParams("-2,147,483,648", "-666000", "Name");
        House[] responseHouses = JsonUtils.mapHouses(response.getBody().asString());

        // Assert response when invalid params value are sent
        assertTrue(ErrorMessageConstants.ARRAY_NOT_EMPTY, responseHouses.length == 0);
    }

    @Test
    public void GetHousesWithInvalidDataPriceAndCity() throws Exception {

        Response response = ApiUtils.getHousesSpecificParams("//***---/", "gggggg", "4521");
        House[] responseHouses = JsonUtils.mapHouses(response.getBody().asString());

        // Assert response when invalid params value are sent
        assertTrue(ErrorMessageConstants.ARRAY_NOT_EMPTY, responseHouses.length == 0);
    }

    @Test
    public void GetSpecificHouseViaValidId() throws Exception {
        // Will get random id from TestData.json file
        Response response = ApiUtils.getHousesCustomParams("id", JsonUtils.getRandomHouseId());
        House[] responseHouses = JsonUtils.mapHouses(response.getBody().asString());

        assertEquals(200, response.getStatusCode());
        VerificationUtil.verifyResponseData(responseHouses);
    }

    @Test
    public void GetSpecificHouseViaInvalidId() throws Exception {

        // Sending invalid ID
        Response response = ApiUtils.getHousesCustomParams("id", "@#$%^&*()");
        House[] responseHouses = JsonUtils.mapHouses(response.getBody().asString());

        // Response should not return values since Id is invalid
        assertTrue(ErrorMessageConstants.ARRAY_NOT_EMPTY, responseHouses.length == 0);
    }

    @Test
    public void GetHousesViaInvalidState() throws Exception {
        // Get house via invalid state
        Response response = ApiUtils.getHousesCustomParams("state", "Balkan");
        House[] responseHouses = JsonUtils.mapHouses(response.getBody().asString());

        // Response should not return values since state is invalid
        assertTrue(ErrorMessageConstants.ARRAY_NOT_EMPTY, responseHouses.length == 0);
    }

    @Test
    public void GetHousesViaInvalidCity() throws Exception {

        // Get house via invalid state
        Response response = ApiUtils.getHousesCustomParams("city", "Frankfurt");
        House[] responseHouses = JsonUtils.mapHouses(response.getBody().asString());

        // Response should not return values since city is invalid
        assertTrue(ErrorMessageConstants.ARRAY_NOT_EMPTY, responseHouses.length == 0);
    }

    @Test
    public void GetHousesViaInvalidZip() throws Exception {

        // Get house via invalid state
        Response response = ApiUtils.getHousesCustomParams("zip", "99999999");
        House[] responseHouses = JsonUtils.mapHouses(response.getBody().asString());

        // Response should not return values since zip is invalid
        assertTrue(ErrorMessageConstants.ARRAY_NOT_EMPTY, responseHouses.length == 0);
    }
}
