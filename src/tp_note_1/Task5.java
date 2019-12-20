package tp_note_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int riels;
        double dollar;

        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.println("Conversion rates is: 1 USD = 4000 RIELS");
        System.out.println("Please input money in Riels: ");

        riels = sc.nextInt();
        dollar = (double)riels / 4000;

        System.out.println("------------------------------------");
        System.out.println(riels + " RIELS = " + dollar + " USD");


    }
}
