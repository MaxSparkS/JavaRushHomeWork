package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(min(12, 99));
        System.out.println(min(787947844, 44646766));
        System.out.println( min(7.8,9.6));
    }

    public static int min(int x, int y){
        if (x<y) return x;
        else return y;
    }
    public static long min(long a, long b){
        if (a<b) return a;
        else return b;
    }
    public static double min(double k, double l){
        if (k<l) return k;
        else return l;
    }
    //Напишите тут ваши методы
}
