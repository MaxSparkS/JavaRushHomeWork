package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Max on 07.09.2015.
 */
public class RussianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 700;
    }
    public String getDescription()
    {
        return super.getDescription() + String.format(". Моя страна - %s. Я несу %s яиц в месяц.",Country.RUSSIA,getCountOfEggsPerMonth());
    }


 }

