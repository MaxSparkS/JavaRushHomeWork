package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by User on 16.02.16.
 */
public class LatteMaker extends DrinkMaker
{
    @Override
    void getRightCup()
    {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient()
    {
        System.out.println("Заливаем молоко с пенкой");
    }

    @Override
    void pour()
    {
        System.out.println("Делаем кофе");
    }


}
