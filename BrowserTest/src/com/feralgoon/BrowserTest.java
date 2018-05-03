package com.feralgoon;

public class BrowserTest
{
    public static void main(String[] args)
    {
        BrowserTest browserTest = new BrowserTest();

        browserTest.demo();
    }

    private void demo()
    {
        for(BrowserType i : BrowserType.values())
        {
            System.out.println(i +  ", by " + i.getCorporateOwner());
        }
    }
}
