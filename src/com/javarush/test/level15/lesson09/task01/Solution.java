package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }
    static{
        labels.put(3.14, "name");
        labels.put(3.15,"Strig");
        labels.put(3.13,"S");
        labels.put(3.12,"S3");
        labels.put(3.11,"12");
    }
}
