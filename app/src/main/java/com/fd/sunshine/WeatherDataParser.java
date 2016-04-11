package com.fd.sunshine;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class WeatherDataParser {

    public double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex) throws JSONException {
        JSONObject weather = new JSONObject(weatherJsonStr);
        JSONArray days = weather.getJSONArray("list");
        JSONObject dayInfo = days.getJSONObject(dayIndex);
        JSONObject temperatureInfo = dayInfo.getJSONObject("main");
        return temperatureInfo.getDouble("temp_max");
    }
}