package Class_5;

//Задание: Создать класс записной книжки, в котором хранятся записи дел. Создать в этом классе метод,
//        который выводит частотный словарь для определенной записи (запись можно определить по номеру/индексу)

import java.util.Scanner;

public class Notebook {

    static String[] record =
            {"insta post",
             "blog backup",
             "insta post",
             "finish project"};

    public static void Dictionary(int i) {
            String[] words = record[i].split(" +");
            int sum = 0;
        for (int j = 0; j < words.length ; j++) {
            for (int k = 0; k < words.length; k++) {
                if (words[j].equals(words[k])) {
                    sum++;
                }
            }
            System.out.println("This word - " + words[j] + " - occurs - " + sum + " - times in the sentence!");
            sum=0;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = new String();
        Dictionary(number);
    }
}
