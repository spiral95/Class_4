package Class_3;

public class FrequencyDictionary {

    public static void main(String[] args) {
        String[] sentence = {"Hello", "World", "Hello", "World","Hello", "World","Hello", "World","Hello", "World"};

        String word1 = "Hello";
        String word2 = "World";


        int sum =0;
        for (int i = 0; i < sentence.length; i++) {
            if(word1.equals(sentence[i])) {
                sum++;
            }
        }
        System.out.println("The Word \"Hello\" - " + sum);

        int sum1 =0;
        for (int i = 0; i < sentence.length; i++) {
            if(word2.equals(sentence[i])) {
                sum1++;
            }
        }
        System.out.println("The Word \"World\" - " + sum1);
    }
}
