package Class_3;

import java.util.Random;
import java.util.Scanner;

public class Letter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String name = scanner.nextLine();
        String[] mass = {"A","B","C","D","E","F","G"};
        int i = random.nextInt(mass.length);
        String name1 = mass[i];

        System.out.println(name1);

        for (int j = 0; j < mass.length; j++) {
            if (name.equals(mass[j])){
                System.out.println("Position of the entered letter = " + j);
            }
        }



        if(name.equals(name1)) {
            System.out.println("You're the Winner!!!!!!");
        }

    }
}
