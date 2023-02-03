package com.bridgelabz.basics;

import java.util.Scanner;

public class ArraysConcepts {

    // Arrays => when we want to store multiple data of same data type , we use arrays
    public static void main(String[] args) {

        int x = 10;
        int[] array = new int[10];

        int[] arr1 = new int[3];

        String[] arr2 = new String[4];

        Dog[] arr3 = new Dog[5];

        array[0] = 13;
        array[5] = 23;
        array[8] = 46;
        array[9] = 21;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("************************");
        int[] array2 = {23, 54, 76, 98, 23, 0, 3, 1};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        int[][] array3 = new int[3][3];

//        array3[0][2] = 23;
        System.out.println("**********");
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = i * j + 3;
                System.out.println(array3[i][j]);
            }
        }

//        for (int i = 0; i< array3.length ; i++){
//            for (int j = 0;j< array3[i].length;j++){
//                System.out.println(array3[i][j]);
//            }
//        }
        System.out.println("**************************************");
        int[][] array4 = {{1, 3, 4, 5, 6}, {5, 3, 2, 1, 4}, {8, 6, 5, 7, 3}, {2, 4, 7, 8, 9}};
        int[][] array5 = new int[4][5];

        for (int i = 0; i< array4.length ; i++){
            for (int j = 0;j< array4[i].length;j++){
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("************************");
        String[] array6 = new String[5];
        for (int i = 0; i < array6.length; i++) {
            System.out.println(array6[i]);
        }
        System.out.println("********************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = scanner.nextInt();

        Dog[] array7 = new Dog[limit];
        Dog dog1 = new Dog();
        dog1.age = 1;
        dog1.breed = "German sheffard";
        dog1.color = "brown";

        Dog dog2 = new Dog();
        dog2.age = 5;
        dog2.breed = "Husky";
        dog2.color = "white";

        array7[2] = dog1;
        array7[5] = dog2;

        for (int i = 0; i < array7.length; i++) {
            System.out.println(array7[i]);
        }

    }
}
