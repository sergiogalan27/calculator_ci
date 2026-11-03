package org.example;

public class Calculator {
   final float PI = 3.14f;

    public void doNothing(){}

    public int sum(int num1, int num2){
        return num1 + num2;
    }
    public double sum(double num1, double num2){
        return num1 + num2;
    }
    public int square(int num){
        return num * num;
    }

    public float square(float num){
        return num * num;
    }
    public float exponential(float base, int exponent){
        float result = 1;
        for(int i = 0; i < exponent; i++){
            result = result * base;
        }
        return result;
    }
}
