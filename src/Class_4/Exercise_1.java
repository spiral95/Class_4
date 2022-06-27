package Class_4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);


        String[][] myArray = new String[3][3];
        int x = scanner.nextInt(3);
        int y = scanner.nextInt(3);
        if (x <= 2 && x >= 0 && y <= 2 && y >= 0) {
            myArray[x][y] = "X";
        } else {
            System.out.println("Вы ввели не верный индекс");
        }


        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*****************************************");


        int x1 = rand.nextInt(3);
        int y1 = rand.nextInt(3);
        if (x1 != x) {
            myArray[x1][y1] = "O";
        } else {
            System.out.println("Это поле уже занято");
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*****************************************");

        if(x<=2 && x>=1) {
            int x2 = x-1;
            int y2 = y;
            myArray[x2][y2] = "X";
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*****************************************");
        }
    }

