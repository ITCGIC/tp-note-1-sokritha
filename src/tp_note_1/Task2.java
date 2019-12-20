package tp_note_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        int seconds, minutes, hours, init_seconds;
        Scanner input = new Scanner(System.in);

        System.out.println("Program for converting seconds into formated H:M:S");
        System.out.println("Input number of seconds: ");

        seconds = input.nextInt();

        if (seconds < 0){
            System.out.println("Time is invalid");
        }else{
            init_seconds = seconds;
            hours = seconds/3600;
            minutes = (seconds % 3600)/60;
            seconds = (seconds % 3600)%60;

            System.out.println("Time corresponding to "+ init_seconds + " seconds"+ " is: " + hours + ":"
                    + minutes + ":" + seconds
            );
        }

    }
}
