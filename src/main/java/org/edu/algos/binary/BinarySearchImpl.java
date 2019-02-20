package org.edu.algos.binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearchImpl {

    public int searchArrayForANumber(int[] numbers, int noToFind) {

        int min = 0;
        int max = numbers.length - 1;
        if (max < min) {
            //return not found
            return -1;
        }
        return calculate(numbers,noToFind,max,min);


    }

    private int calculate(int[] numbers, int noToFind,int max,int min) {
        int guess = (min + max) / 2;

        if (numbers[guess] == noToFind) {
            return guess;
        } else if (numbers[guess] > noToFind) {
            max = guess - 1;
            return calculate(numbers, noToFind,max,min);
        } else if (numbers[guess] < noToFind) {
            min = guess + 1;
            return calculate(numbers, noToFind,max,min);

        }

            return -1;
    }


    public static void main(String[] args) {
        System.out.println("Please Enter the array to search no from:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers as comma separated value ");
        int[] numbers = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Please Enter the number to search:");
        int numberToFind = scanner.nextInt();
        BinarySearchImpl bSearch = new BinarySearchImpl();
        System.out.println(bSearch.searchArrayForANumber(numbers,numberToFind));

    }

}