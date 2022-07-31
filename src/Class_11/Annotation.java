package Class_11;

// Задание: Написать свою аннотацию для метода или для поля класса

import Class_8.RecordWords; // импортируем мой класс
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME) // доступность аннотации
@Target({ElementType.METHOD}) // применимость аннотации
@interface Repeat { // создание собственной аннотации
}

public class Annotation extends RecordWords { // обращаемся к созданному мной классу
    @Repeat // применяем свою аннотацию к методу родительского класса
    void method1() {
    }
}