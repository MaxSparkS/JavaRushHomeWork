package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Max on 07.09.2015.
 */
public class MoldovanHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 300;
    }
    public String getDescription()
    {
        return super.getDescription() + String.format(". Моя страна - %s. Я несу %s яиц в месяц.",Country.MOLDOVA,getCountOfEggsPerMonth());
    }


}
