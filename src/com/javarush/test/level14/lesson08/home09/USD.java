package com.javarush.test.level14.lesson08.home09;

/**
 * Created by User on 11.02.16.
 */
public class USD extends Money
{
    public USD(double amount){
        super(amount);
    }

    @Override
    public double getAmount()
    {
        return 0;
    }

    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}
