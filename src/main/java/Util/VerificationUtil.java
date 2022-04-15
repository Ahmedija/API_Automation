package Util;
import Model.House;
import java.util.Objects;

import static org.testng.AssertJUnit.*;
import static org.testng.AssertJUnit.assertTrue;

public class VerificationUtil {
    public static void verifyResponseData(House[] responseHouses) throws Exception {
        // Using test data as source of truth for checking the incoming response houses
        House[] testData = JsonUtils.getTestData();

        // Check is hose response valid (empty)
        if(responseHouses.length != 0)
        {
            // Nested for loop for checking each house from test data with response houses
            for (House testDataHouse : testData) {
                for (House responseHouse : responseHouses) {
                    if (Objects.equals(testDataHouse.getId(), responseHouse.getId())) {
                        assertEquals(testDataHouse.getMls_id(), responseHouse.getMls_id());
                        assertEquals(testDataHouse.getMls_listing_id(), responseHouse.getMls_listing_id());
                        assertEquals(testDataHouse.getProperty_type(), responseHouse.getProperty_type());
                        assertEquals(testDataHouse.getFormatted_address(), responseHouse.getFormatted_address());
                        assertEquals(testDataHouse.getAddress(), responseHouse.getAddress());
                        assertEquals(testDataHouse.getZip(), responseHouse.getZip());
                        assertEquals(testDataHouse.getCity(), responseHouse.getCity());
                        assertEquals(testDataHouse.getState(), responseHouse.getState());
                        assertEquals(testDataHouse.getLocation()[0], responseHouse.getLocation()[0]);
                        assertEquals(testDataHouse.getLocation()[1], responseHouse.getLocation()[1]);
                        assertEquals(testDataHouse.getBedrooms(), responseHouse.getBedrooms());
                        assertEquals(testDataHouse.getBathrooms(), responseHouse.getBathrooms());
                        assertEquals(testDataHouse.getList_date(), responseHouse.getList_date());
                        assertEquals(testDataHouse.getMls_update_date(), responseHouse.getMls_update_date());
                        assertEquals(testDataHouse.getPrice_display(), responseHouse.getPrice_display());
                        assertEquals(testDataHouse.getPrice(), responseHouse.getPrice());
                        assertEquals(testDataHouse.getSquare_feet(), responseHouse.getSquare_feet());

                        if(responseHouse.getHero() != null){
                            assertEquals(testDataHouse.getHero().getSmall(), responseHouse.getHero().getSmall());
                            assertEquals(testDataHouse.getHero().getMedium(), responseHouse.getHero().getMedium());
                        }
                    }
                }
            }
        }
        else{
            fail("Get Houses response returned invalid data. Houses list is empty!");
        }
    }

    // Check are houses in specific price range
    public static void checkPriceRange(House[] responseHouses, Integer priceLowerLimit, Integer priceUpperLimit){
        Integer responsePrice;

        for (House  responseHouse : responseHouses) {
            responsePrice = responseHouse.getPrice();

            assertTrue( responsePrice >= priceLowerLimit);
            assertTrue( responsePrice <= priceUpperLimit);
        }
    }
}
