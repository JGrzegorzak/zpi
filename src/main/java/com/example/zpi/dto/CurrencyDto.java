package com.example.zpi.dto;

public class CurrencyDto {
    private final String shortName;
    private final String isoCode;


    public CurrencyDto(String shortName, String isoCode) {
        this.shortName = shortName;
        this.isoCode = isoCode;
    }

    public String getShortName() {
        return shortName;
    }

    public String getIsoCode() {
        return isoCode;
    }
}
