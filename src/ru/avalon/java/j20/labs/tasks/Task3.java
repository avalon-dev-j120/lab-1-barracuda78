package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Fibonacci;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Задание №3
 *
 * <p>Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {

    @Override
    public void run() {
        /*
         * TODO(Студент): Выполнить задание №3
         *
         * 1. Завершить описание класса Fibonacci так, чтобы класс
         *    возвращал заданное количество чисел последовательности
         *    Фибоначчи.
         *
         *    Количество чисел последовательности можно указывать
         *    при создании экземпляра класса.
         *
         *    Найти сумму 20 первых чисел последовательности Фибоначчи:
         *
         * 2. Создать экземпляр класса Fibonacci так, чтобы он
         *    возвращал последовательность чисел Фибоначчи длиной
         *    в 20 элементов.
         *
         * 3. Найти сумму полученных значений.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
        System.out.println("\n====================TASK 3=======================");
        Fibonacci fibonacci = new Fibonacci(20); //зоздаю объект просто чтобы инициализировать статическое поле класса с количеством чисел фибоначчи.
        List<Integer> list = Fibonacci.getList();       //получаю список этих чисел. Создается в конструкторе при создании объекта - предыдущая строка.
        System.out.printf("Заполненный конструктором список чисел Фибоначчи на %d элементов\n", Fibonacci.getCount());  //вывожу для проверки сам ряд чисел фибоначии.
        System.out.printf(list + "\nРазмер списка чисел Фибоначчи = %d", list.size());                    //проверяю размер этого ряда.

        Iterator<Integer> iterator = fibonacci.iterator();  //получаю итератор по данному объекту Fibonacci fibonacci.

        //повторно вывожу коллекцию (числовой ряд фибоначчи) c помощью итератора:
        System.out.println("\nЧисловой ряд Фибоначчи: вывод с помощью итератора:");
        while(iterator.hasNext()){
            System.out.print((iterator.next() + " "));
        }
    }
}
