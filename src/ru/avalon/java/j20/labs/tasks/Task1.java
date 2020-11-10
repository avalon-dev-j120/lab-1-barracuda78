package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import ru.avalon.java.j20.labs.models.Numbers;

import java.util.Arrays;

/**
 * Задание №1.
 *
 * <p>Тема: "Создание обобщённых методов".
 *
 * <p>В рамках задания требуется описать и выполнить
 * несколько методов, обобщённых с указанной точностью.
 */
public class Task1 implements Task {

    /**
     * Фабрика, создающая массивы случайных чисел.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        Integer[] array = arrayFactory.getInstance(20); //Заменил массив примитивов на массив их обёрток. Чтобы сочеталось с дженериками. Так же и в RandomArrayFactory сделал.
        int min = Numbers.min(array);
        int max = Numbers.max(array);
        double avg = Numbers.avg(array);

        /////////код для тестирования /////////////
        System.out.println("произвольный массив Integer[] array: " + Arrays.toString(array));
        System.out.println("Numbers.min(array): " + Numbers.min(array));
        System.out.println("Numbers.max(array): " + Numbers.max(array));
        System.out.println("Numbers.avg(array): " + Numbers.avg(array));

        //тест на массиве Double[]:

        Double[] doubles = new Double[]{2.0, 5.5, 123.0};
        System.out.println("\nзаданный массив Double[] doubles: " + Arrays.toString(doubles));
        System.out.println("Numbers.min(doubles): " + Numbers.min(doubles));
        System.out.println("Numbers.max(doubles): " + Numbers.max(doubles));
        System.out.println("Numbers.avg(doubles): " + Numbers.avg(doubles));

        /*
         * TODO(Студент): Выполните задание №1
         *
         * 1. Обобщить метод поиск среднего арифметического
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск среднего арифметического
         *    в массивах любых чисел: целых и вещественных.
         *
         *    Возвращать необходимо значение типа double.
         *
         * 2. Обобщить метод поиск максимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск максимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 3. Обобщить метод поиск минимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск минимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
