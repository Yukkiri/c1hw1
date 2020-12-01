package com.company;

public class Main {
        //task1
    public static void main(String[] args) {
        //task2
    	byte byte1 = 110;
	    short short1 = 350;
	    int int1 = 2100000333;
	    long long1 = 44443333L;

	    float float1 = 3.3F;
	    double double1 = 5.54;

	    boolean boolean1 = true;

	    char char1 = 'u';

	    String string1 = "Test string";

            //testing task3
        System.out.println(calculate(1,5,7,2));
        System.out.println(calculate(90,2,5,0));

            //testing task4
        System.out.println(checkSum(10,5));
        System.out.println(checkSum(10,30));
        System.out.println(checkSum(2,5));

            //testing task5
        printIsNegative(5);
        printIsNegative(0);
        printIsNegative(-9);

            //testing task6
        System.out.println(isNegative(-5));
        System.out.println(isNegative(10));

            //testing task7
        printName("Ольга");

            //testing task8
    	isLeapYear(1600);
        isLeapYear(2020);
        isLeapYear(2300);
    }

        //task3
        //-1 => calculating error
    public static double calculate(int a, int b, int c, int d){
        return d != 0 ? (double) a * (b + (c / d)) : -1;
    }

        //task4
    public static boolean checkSum(int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

        //task5
    public static void printIsNegative(int a){
        String result;
        if (a < 0){
            result = "Число отрицательное";
        } else {
            result = "число положительное";
        }
        System.out.println(result);
    }

        //task6
    public static boolean isNegative(int a){
        return a < 0;
    }

        //task7
    public static void printName(String name){
        System.out.println("Привет, " + name + "!");
    }

        //task 8
    public static void isLeapYear(int year){
        int remainder = year%4;
        int remainderOfOneHundred = year%100;
        int remainderOfFourHundreds = year%400;
        if (remainder == 0){
            if(remainderOfFourHundreds == 0 ^ remainderOfOneHundred == 0){
                System.out.println("Не високосный год.");
            } else {
                System.out.println("Високосный год.");
            }
        } else {
            System.out.println("Не високосный год.");
        }

        //просто бесполезный коммент для гита
    }
}
