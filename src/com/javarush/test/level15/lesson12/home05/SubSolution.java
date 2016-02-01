package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Max on 28.09.2015.
 */
public class SubSolution extends Solution
{
    public SubSolution(boolean b)
    {
        super(b);
    }

    public SubSolution(Integer s)
    {
        super(s);
    }

    public SubSolution(String s)
    {
        super(s);
    }

    protected SubSolution(String s, int g)
    {
        super(s, g);
    }

    protected SubSolution(String s, String k)
    {
        super(s, k);
    }

    protected SubSolution(int s, String l)
    {
        super(s, l);
    }

    SubSolution(float f, float s)
    {
        super(f, s);
    }

    SubSolution(int s, Integer integer)
    {
        super(s, integer);
    }

    SubSolution(double d, double g)
    {
        super(d, g);
    }
    private SubSolution(int s){
        super(s);
    }
    private SubSolution(String s, Integer l){
        super(s,l);
    }
    private SubSolution(int s, int l){
        super(s,l);
    }

}
