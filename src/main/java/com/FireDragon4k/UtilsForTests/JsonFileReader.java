package com.FireDragon4k.UtilsForTests;

import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;

public class JsonFileReader {

    private static ISettingsFile settingsFile;

    public static String readFromJsonFile(String jsonPath) {
        settingsFile = new JsonSettingsFile("testData.json");
        return settingsFile.getValue(jsonPath).toString();
    }
}
