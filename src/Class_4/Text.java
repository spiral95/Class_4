package Class_4;

//Задание: Написать программу,
//        которая будет хранить текст по предложениям и для каждого предложения составить частотный словарь.

import java.util.Arrays;

public class Text {

    public static void main(String[] args) {

        String text = "I love using Java because it is such an elegant language with so many purposes and such a bright future. Personally, I learnt Java on JavaRush, a popular online platform, which allows you to master Java. What I love about Java, it allows a programmer to create an application, which can be deployed on any device. It is the language of choice for the Internet of Things, cloud computing, Blockchain, big data and other innovative IT market niches. ";
        String[] str = text.split("[.!?]");

        for (int i = 0; i < str.length; i++) {
            System.out.println("********\n********");
            String[] words = str[i].split("[, ]");

            int sum = 0;
            for (int j = 0; j < words.length; j++) {
                for (int k = 0; k < words.length; k++) {
                    if (words[j].equals(words[k])) {
                        sum++;
                    }
                }
                System.out.println("This word - " + words[j] + " - occurs - " + sum + " - times in the sentence!");
                sum=0;
            }
        }
    }
}
