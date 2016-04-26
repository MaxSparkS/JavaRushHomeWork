package com.javarush.test.level08.lesson11.bonus03.lesson12.home04;

/**
 * Created by Max on 28.09.2015.
 */
public class Sun implements Planet
{
    private static Sun ourInstance = new Sun();

    public static Sun getInstance()
    {
        if (ourInstance==null){
            ourInstance=new Sun();
        }
        return ourInstance;
    }

    private Sun()
    {
    }
}
