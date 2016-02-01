package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Max on 28.09.2015.
 */
public class Moon implements Planet
{
    private static Moon ourInstance = new Moon();

    public static Moon getInstance()
    {
        if (ourInstance==null){
            ourInstance=new Moon();
        }return ourInstance;
    }

    private Moon()
    {
    }
}
