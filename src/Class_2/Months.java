package Class_2;

import java.util.Random;
import java.util.RandomAccess;

public class Months {

    public static void main(String[] args) {

        String[] month = {"January", "February", "March", "April",
                 "May","June","July","August","September","October","November", "December"};
         String[] season = {"Winter", "Spring", "Summer", "Autumn"};

         Random random = new Random();
        int pos1 = random.nextInt(11);
        System.out.println(pos1);
        System.out.println("Month - " + month[pos1] + ".");


          if (pos1<=1) {
            System.out.println("Season - " + season[0] + ".");
        } else if (pos1>1 && pos1<=4) {
            System.out.println("Season - " + season[1] + ".");
        } else if (pos1>4 && pos1<=7) {
            System.out.println("Season - " + season[2] + ".");
        } else if (pos1>7 && pos1<=10) {
            System.out.println("Season - " + season[3] + ".");
        } else
        System.out.println("Season - " + season[0] + ".");

        System.out.println("*****************************");

        int n = random.nextInt(11);
        System.out.println(n);
        System.out.println("Month - " + month[n] + "." );
        switch (n) {
            case 0 :
                System.out.println("Season - " + season[0] + ".");
                break;
            case 1 :
                System.out.println("Season - " + season[0] + ".");
                break;
            case 2 :
                System.out.println("Season - " + season[1] + ".");
                break;
            case 3 :
                System.out.println("Season - " + season[1] + ".");
                break;
            case 4 :
                System.out.println("Season - " + season[1] + ".");
                break;
            case 5 :
                System.out.println("Season - " + season[2] + ".");
                break;
            case 6 :
                System.out.println("Season - " + season[2] + ".");
                break;
            case 7 :
                System.out.println("Season - " + season[2] + ".");
                break;
            case 8 :
                System.out.println("Season - " + season[3] + ".");
                break;
            case 9 :
                System.out.println("Season - " + season[3] + ".");
                break;
            case 10 :
                System.out.println("Season - " + season[3] + ".");
                break;
            case 11 :
                System.out.println("Season - " + season[0] + ".");
                break;
        }
        System.out.println("*****************************");

    }

}
