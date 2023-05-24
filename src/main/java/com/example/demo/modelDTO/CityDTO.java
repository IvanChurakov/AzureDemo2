package com.example.demo.modelDTO;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CityDTO implements Comparable<CityDTO> {
    private String displayName;

    @JsonCreator
    public CityDTO(@JsonProperty("displayName") String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public int compareTo(CityDTO otherCity) {
        return displayName.compareTo(otherCity.displayName);
    }
}
