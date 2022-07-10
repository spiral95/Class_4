package Class_3;

//Задание: Написать частотный словарь -
// посчитать сколько раз каждое слово встречается в предложении и вывести результат в консоль.

import java.util.Arrays;

public class FrequencyDictionary {

    public static void main(String[] args) {

        String sentence = "I love using Java because it is such an elegant language with so many purposes and such a bright future";
        String[] sentenceArray = sentence.split(" +");

        int sum = 0;
        for (int i = 0; i < sentenceArray.length; i++) {
            for (int k = 0; k < sentenceArray.length; k++) {
                if (sentenceArray[i].equals(sentenceArray[k])) {
                    sum++;
                }
            }
            System.out.println("This word - " + sentenceArray[i] + " - occurs - " + sum + " - times in the sentence!");
            sum=0;
        }
    }
}
