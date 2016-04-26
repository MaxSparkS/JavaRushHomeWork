package com.javarush.test.level08.lesson11.bonus03.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(boolean b)
    {
    }

    public Solution(Integer s)
    {
    }

    public Solution(String s)
    {
    }

    private Solution(int s)
    {
    }

    private Solution(String s, Integer d)
    {
    }

    private Solution(int s, int l)
    {
    }

    protected Solution(String s, int g)
    {
    }

    protected Solution(String s, String k)
    {
    }

    protected Solution(int s, String l)
    {
    }

    Solution(float f,  float s)
    {
    }

    Solution(int s, Integer integer)
    {
    }
    Solution(double d, double g){}
}

