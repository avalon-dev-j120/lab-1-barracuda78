package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Person;

/**
 * Задание №4.
 *
 * <p>Тема: "Методы класса {@link Object}".
 */
public class Task4 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        Person a = new Person("Иван", "Иванов");
        Person b = new Person("Иван", "Иванов");
        boolean isEqual = a.equals(b);


        ////////////код для проверки://////////////
        System.out.println("\n\n====================TASK 4=======================");
        System.out.println("Person a = " + a);
        System.out.println("Person b = " + b);
        System.out.println("Person a и Person b одинаковые: " + isEqual);

        /*
         * TODO(Студент): Выполните задание №4
         *
         * 1. С использованием отладчика проверьте, что
         *    сравнение объектов класса Person выполняется
         *    некорректно.
         *
         * 2. Переопределите в классе Person методы equals и
         *    hashCode.
         *
         * 3. С использованием отладчика проверьте что сравнение
         *    объектов типа Person выполняется корректно.
         */
    }
}
