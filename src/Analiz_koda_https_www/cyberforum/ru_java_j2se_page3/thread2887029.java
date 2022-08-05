package Analiz_koda_https_www.cyberforum.ru_java_j2se_page3;

// Задание: Удалить из строки все числа,кроме однозначных. Обязательно использовать StringBilder

public class thread2887029 {

// ПРАВИЛЬНОЕ РЕШЕНИЕ (НО!-без использования StringBilder).

        public static void main(String[] args) {
            String dataString = "a12.334tYz.78x3";
            System.out.println(dataString.replaceAll("\\d{2,}", ""));
        }

// НЕПРАВИЛЬНОЕ РЕШЕНИЕ (с использованием StringBilder):

//    public static void main(String[] args) {
//        String dataString = "a12.334tYz.78x3";
//        StringBuilder sb = new StringBuilder();
//        for(char ch : dataString.toCharArray()) {
//            if(!isDigit(ch)) {
//                sb.append(ch);
//            }
//        }
//        System.out.println(sb.toString());
//    }
//    private static boolean isDigit(char ch) {
//        return ch >= '0' && ch <= '9';
//    }
}



