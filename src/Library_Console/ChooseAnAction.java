package Library_Console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseAnAction {

//   Выберите действие:
//   1. Вывод всех книг - (для этого нажмите на клавиатуре "1").
//   2. Добавление книги - (для этого нажмите на клавиатуре "2").
//   3. Удаление книги - (для этого нажмите на клавиатуре "3").
//   4. Редактирование книги - (для этого нажмите на клавиатуре "4").
//   5. Выход - (для этого нажмите на клавиатуре "5").


// Объявлем ввод с консоли с помошью BufferedReader и InputStreamReader и присваиваем в переменную a :
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String a = reader.readLine(); // ввод строки с клавиатуры


    public ChooseAnAction() throws IOException {
        switch (Integer.parseInt(a)) { // Integer.parseInt(a); - преобразует строку в число.
            case 1 :
//   Пользователь выбрал - Вывод всех книг (нажав "1")
//   Система спрашивает - В какой сортировке вывести список?
//   Выберите действие:
//   1. По алфавиту (возрастание) - (для этого нажмите на клавиатуре "1").
//   2. По алфавиту (убывание) - (для этого нажмите на клавиатуре "2").
//   3. Удаление книги по добавлению - (сначала новые, потом более старые) (для этого нажмите на клавиатуре "3").

                switch (Integer.parseInt(a)) {
                    case 1 :



                        break;

                    case 2 :

                        break;

                    case 3 :

                        break;

                }
            break;

            case 2 :
                break;

            case 3 :
                break;

            case 4 :
                break;

            case 5 :
                break;
        }
    }

    public static void main(String[] args) {

    }
}
