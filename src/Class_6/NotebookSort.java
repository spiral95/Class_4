package Class_6;

//Задание: Отсортировать записи, хранящиеся в записной книжке
//        по времени их добавления и вывести в этом порядке в консоль

import java.util.Arrays;

public class NotebookSort {

    static String[] records =
                   {"06.30 insta post",
                    "19.00 blog backup",
                    "15.00 insta post-2",
                    "21.00 finish project"};

        public static void main(String[] args) {

            Arrays.sort(records);
            System.out.println(Arrays.toString(records));
    }
}
