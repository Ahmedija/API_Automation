package Util;

import Model.House;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class JsonUtils {
    // Using TestData.json as source of truth for checking are requests valid
    public static House[] getTestData() throws Exception {
        String file = "src/main/resources/TestData/TestData.json";
        return mapHouses(readFileAsString(file));
    }

    // Get random house id to cover more cases instead of hardcoding values
    public static String getRandomHouseId() throws Exception {
        House[] testDataHouses = getTestData();
        Random randomInt = new Random();
        return testDataHouses[randomInt.nextInt(testDataHouses.length)].getId();
    }

    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    public static House[] mapHouses(String jsonStr) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonStr, House[].class);
    }
}
