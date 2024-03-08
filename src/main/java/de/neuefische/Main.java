package de.neuefische;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int calcSum(int a, int b){
        return a+b;
    }

    public static boolean isEven(int a){
        if (a%2==0){
            return true;
        }
        return false;
    }
}