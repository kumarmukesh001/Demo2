package com.copilot.dao;

public class MathUtils {

        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int divide(int a, int b) {
            return a / b;
        }

        //is prime?
        public boolean isPrime(int a) {
            if (a <= 1) {
                return false;
            }
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }

        //is Factorial?
        public int factorial(int a) {
            if (a == 0) {
                return 1;
            }
            return a * factorial(a - 1);
        }


}
