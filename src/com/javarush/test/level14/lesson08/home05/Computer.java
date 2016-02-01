package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Max on 09.09.2015.
 */
public class Computer
{
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    public Computer()
    {
        monitor=new Monitor();
        mouse = new Mouse();
        keyboard = new Keyboard();
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }
}
