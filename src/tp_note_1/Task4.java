package tp_note_1;

import java.util.Scanner;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int h, int m, int s){
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }
}


public class Task4 {

    public static void main(String[] args){
        int total_sec1, total_sec2, total_sec=0;
        float hourToMinute, secToMinute, totalMinute;

        Time t1 = getTime("start");
        total_sec1 = timeFormatToSecond(t1.hours, t1.minutes, t1.seconds);

        Time t2 = getTime("end");
        total_sec2 = timeFormatToSecond(t2.hours, t2.minutes, t2.seconds);

        if(total_sec2<total_sec1){
            System.out.println("Invalid");
        }else{
            total_sec = total_sec2 - total_sec1;
        }

        Time t3 = secondToTimeFormat(total_sec);

        System.out.println("Total call of duration: " + t3.hours + "h " + t3.minutes + "m " +
                t3.seconds + "s");

        hourToMinute = t3.hours * 60;
        secToMinute = (float)t3.seconds / 60;
        totalMinute = (hourToMinute + t3.minutes + secToMinute);

        String money = String.format("%.4f",totalMinute*0.05);
        System.out.println("----------------------------------------");
        System.out.println("Total cost of this call: " + money + "$");

    }

    public static Time secondToTimeFormat(int s){
        int seconds, minutes, hours;

        hours = s/3600;
        minutes = (s % 3600)/60;
        seconds = (s % 3600)%60;

        return new Time(hours, minutes, seconds);
    }

    public static int timeFormatToSecond(int hours, int minutes, int seconds){
        int total_seconds=0;
        if ((hours > 24 || hours<0)&&(minutes > 60 || minutes<0)&&(seconds>60||seconds<0)){
            System.out.println("Invalid Time");
        }else{
            total_seconds = (hours*3600) + (minutes*60) + seconds;
        }
        return total_seconds;
    }

    public static Time getTime(String condition){
        int h, m, sec;
        Scanner input = new Scanner(System.in);

        System.out.println("Please input "+condition+" hours: ");
        h = input.nextInt();
        System.out.println("Please input "+condition+" minutes: ");
        m = input.nextInt();
        System.out.println("Please input "+condition+" seconds: ");
        sec = input.nextInt();

        return new Time(h,m,sec);
    }
}