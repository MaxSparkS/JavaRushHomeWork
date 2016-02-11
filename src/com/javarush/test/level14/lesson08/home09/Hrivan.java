package com.javarush.test.level14.lesson08.home09;

/**
 * Created by User on 11.02.16.
 */
public class Hrivan extends Money
{
    public Hrivan(double amount)
    {
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
        return "HRN";
    }
}
