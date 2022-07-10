package Class_3;

import java.util.Arrays;

public class FrequencyDictionary {

    public static void main(String[] args) {

        String sentence = "I love using Java because it is such an elegant language with so many purposes and such a bright future";
        String[] sentenceArray = sentence.split(" +");

        int sum = 1;
        for (int k = 1, i = 0; k < sentenceArray.length; k++) {
            if (sentenceArray[i].equals(sentenceArray[k])) {
                sum++;
            } else {
                sum = 1;
                i++;
            }
            System.out.println("This word - " + sentenceArray[i] + " - occurs - " + sum + " - times in the sentence!");
        }
    }
}
