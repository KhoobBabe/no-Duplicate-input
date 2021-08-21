package com.khubaib;

import java.util.Scanner;

public class NoDuplicate {
    public static void main(String args[]) {

        //Declaring input
        Scanner input = new Scanner(System.in);

        //Declaring Array
        int[] array = new int[10];

        //Declaring variables
        int num;

        int i = 0;
        while (i < 10) {
            boolean exist = false;

            //inputs taken
            System.out.print("Enter element "+ (i+1) +" : ");
            num = input.nextInt();

            //checks if the number is already present in the string
            for (int j=0 ; j < i; j++) {
                if (num == array[j]) {
                    System.out.println("Number already present, enter another number\n");
                    exist = true;
                }
            }
            if (exist == false) {
                array[i] = num;
                i++;
            }
        }

        //prints the array
        System.out.println("The array is: " );
        for (int a = 0; a < array.length; a++){
            System.out.println(array[a]);
        }
    }
}

