package tp_note_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        int hours, minutes, seconds, total_second;

        Scanner input = new Scanner(System.in);
        System.out.println("Program for converting time to seconds: ");
        System.out.println("Please input hours: ");
        hours = input.nextInt();
        System.out.println("Please input minutes: ");
        minutes = input.nextInt();
        System.out.println("Please input seconds: ");
        seconds = input.nextInt();
        System.out.println("--------------------------------------");
        if (hours < 0 || minutes < 0 || seconds < 0){
            System.out.println("Time is invalid");
        }else {
            total_second = (hours*3600) + (minutes*60) + seconds;
            System.out.println("Number of seconds= " + hours + "x3600 +" + minutes + "x60 + " + seconds
                    + " = " + total_second + "s");
        }
    }
}
