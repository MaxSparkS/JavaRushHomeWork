package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader r =  new BufferedReader(new InputStreamReader(System.in));
        String fileName = r.readLine();
        InputStream input = new FileInputStream(fileName);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc =  new Scanner(input);

        while(input.available()>0){
            while (sc.hasNext()){
                int data=sc.nextInt();
                if ((data%2)==0){
                    list.add((int)data);
                }
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

    }
}
