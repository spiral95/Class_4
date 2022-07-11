package Class_7;

//Задание: Написать в классе записной книжки метод, который выводит в консоль
//        название всех дел/сами дела, в которых есть переданное в этот метод в качестве аргемента слово.

import java.util.Scanner;

public class WordSearch {

    static String[] record =
                   {"insta post",
                    "blog backup",
                    "insta post - 2",
                    "finish project"};

    public static void Search(String word) {

        for (int i = 0; i < record.length; i++) {
            String[] words = record[i].split(" +");
            for (int j = 0; j < words.length; j++) {
                if(word.equals(words[j])) {
                    System.out.println(record[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        Search(word);
    }

}

