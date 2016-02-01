package com.javarush.test.level16.lesson10.task03;

/* Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        Thread test = new Thread(testThread);
        test.start();

        Thread.sleep(3000);
        test.interrupt();
        //Add your code here - добавь код тут
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
        public void run(){
            Thread current = new Thread();
            while(!current.isInterrupted()){
                System.out.println("Пока");
                return;
            }
        }

    }
}
