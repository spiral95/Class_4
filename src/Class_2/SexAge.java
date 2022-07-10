package Class_2;

//Задание: Написать программу, которая приветствует пользователя в зависимости от его пола и возраста
//        (имя, пол и возраст задаются при старте программы)

import java.util.Random;

public class SexAge {

    public static void main(String[] args) {

        Random random = new Random();
        int age = random.nextInt(100)+1;
        String[] sex = {"Man", "Woman"};
        int pos = random.nextInt(sex.length);
        System.out.println(age);
        System.out.println(pos);

        if(age <= 18 && pos == 0) {
            System.out.println("Hello, Boy");
        } else if (age <= 18 && pos == 1) {
            System.out.println("Hello, Girl");
        } else if (age > 18 && pos == 0) {
            System.out.println("Hello, Mister");
        } else {
            System.out.println("Hello, Miss(is)");
        }
    }
}
