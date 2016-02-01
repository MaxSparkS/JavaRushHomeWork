package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(max(45.8,56.3));
        System.out.println(max(7,99));
        System.out.println(max(7897,-74646));
    }
        public static int max(int x, int y){
            if (x>y) return x;
            else return y;
        }
        public static long max(long a, long b){
            if (a>b) return a;
            else return b;
        }
    public static double max(double k, double l){
        if (k>l) return k;
        else return l;
    }
    //Напишите тут ваши методы
}
