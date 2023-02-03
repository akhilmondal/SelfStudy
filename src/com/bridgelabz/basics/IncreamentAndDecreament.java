package com.bridgelabz.basics;

public class IncreamentAndDecreament {

    // i++ , ++i
    // i-- , --i
    public static void main(String[] args) {

        int x = 2;
        System.out.println(++x); // 3
        int res = x++; // 3
        System.out.println("res => " + res); // 3
        int res2 = ++x; // 5
        System.out.println("res2 => " + res2); // 5
        System.out.println("x => " + x); // 5


        int y = 2;
        System.out.println(--y); // 1
        int res3 = y--; // 1
        System.out.println(y);//0
        System.out.println("res3 => " + res3); // 1


        int z = 21;
        int sum1 = z++ + ++z + z++ + z++ + ++z + ++z + z++ + z++; // 21 + 23 + 23 + 24 + 26 + 27 + 27 + 28
        System.out.println(z); // 24  // 29  // 28  // 29  //     // 26 // 26
        System.out.println(sum1); // 196 // 171 // 171 // 199 // 196 // 171 // 171


        int w = 34;
        int calc = w++ - --w - w-- - ++w + w++ + --w - --w + ++w;
        // 34 - 34 - 34 - 34 + 34 + 34 - 33 + 34
        System.out.println(w); // 34 // 2 // 34 // 34  // 1 // 34 // 34 // 32 // 34 // 34 // 34 // 34
        System.out.println(calc); // 1 //34 // 1 // 38 // 34 // 2 // 1 // 32 // 34 // 3 //  4  // 1
        System.out.println();

        System.out.println("************* for *********************");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("************* while *********************");
        System.out.println();
        int j = 0;
        while(j<10){
            System.out.println(j);
            j++;
        }

        System.out.println("************* do-while *********************");

        int k = 0;
        do{
            System.out.println(k);
            k++;
        } while(k<10);

        System.out.println("main ending");
    }
}
