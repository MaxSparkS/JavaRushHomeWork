package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Max on 28.09.2015.
 */
public class Earth implements Planet

{
    private static Earth ourInstance = new Earth();

    public static Earth getInstance()
    {
        if (ourInstance==null){
            ourInstance=new Earth();
        }
        return ourInstance;
    }

    private Earth()
    {
    }
}
