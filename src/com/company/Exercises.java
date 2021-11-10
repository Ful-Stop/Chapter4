package com.company;

import com.sun.security.jgss.GSSUtil;

public class Exercises {

    public static int addOdds(int n){
        int totalOdds = 0;
        int checkOdds = 0;

        while (checkOdds < n){
            checkOdds++;

            if (checkOdds % 2 != 0){
                totalOdds += checkOdds;
            }
        }
        return totalOdds;
    }

    public static int sumDigits(int n){
        int multiplierDigits = 10;
        int totalDigits = n % 10;

        while (n >= multiplierDigits){
            totalDigits += (n / multiplierDigits % 10);
            multiplierDigits *= 10;
        }
        return totalDigits;
    }

    public static int howManyYears(double startPop, double endPop){
        double rate = 1.13;
        int years = 0;

        while (startPop < endPop){
            startPop *= 1.13;
            years += 1;
        }

        return years;
    }

    public static void printSum(int n){
        int printCheck = 1;
        int totalCheck = 0;
        while (printCheck <= n){
            totalCheck += printCheck;
            printCheck++;
        }
        System.out.println(totalCheck);
    }

    public static void main(String[] args) {

        //addOnes
        System.out.println(addOdds(7));
        System.out.println(addOdds(24));
        System.out.println(addOdds(16));

        //sumDigits
        System.out.println(sumDigits(5400));
        System.out.println(sumDigits(483));
        System.out.println(sumDigits(583674));
        System.out.println(sumDigits(1000));

        //howManyYears
        System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2, 150));

        //printSum
        printSum(7);
        printSum(22);
        printSum(47);
    }
}
