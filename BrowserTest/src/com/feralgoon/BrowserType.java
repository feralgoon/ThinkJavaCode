package com.feralgoon;

public enum BrowserType
{
    CHROME("Google"),
    OPERA("Opera Software"),
    SAFARI("Apple"),
    INTERNET_EXPLORER("Microsoft"),
    EDGE("Microsoft"),
    FIREFOX("Mozilla");

    private String corporateOwner;

    BrowserType(String corporateOwner)
    {
        this.corporateOwner = corporateOwner;
    }

    public String getCorporateOwner()
    {
        return corporateOwner;
    }
}