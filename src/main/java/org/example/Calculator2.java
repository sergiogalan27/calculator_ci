package org.example;

/**
 * @author sergio
 * @created 03/11/2026
 */
public class Calculator2 {
    /**
     * A final decorated variable can not be modified its value.
     * On the other hand, a final variable can only
     * be initialized once.
     * "static"
     * Static variables are objects specific.
     * The variable "PI" should be independent form
     * any specific object., and in the memory should
     * only exist one copy.
     */
    public static final float PI = 3.14f;

    int size = 23;

    public static int sum(int num1,int num2){
        //size++;
        return num1 + num2;
    }
    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    public static int square(int num){
        return num * num;
    }

    public static float square(float num){
        return num * num;
    }

    public static float exponential(float base, int exponent) {
        float result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }
}
