package com.bridgelabz.basics;

public class SwitchCase {

    public static void main(String[] args) {

        int x = 0;
        char ch = 'B';
        int d = 66;
        System.out.println(d);

        char s = 66;
        System.out.println(s); // 'B'

        if( s == 'B'){
            System.out.println("matched");
        }

        switch (d) {
            case 'A':
                System.out.println("case A");
                break;
            case 'B':
                System.out.println("case B");
                break;
            case 'C':
                System.out.println("case C");
                break;
            default:
                System.out.println("default");
        }
    }
}
