package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.*;

/**
 * Задание №5.
 *
 * <p>Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final Integer[] array = arrayFactory.getInstance(20); //заменил тут пока int[] array на Integer[] array -- чтобы первый task скомпилировать и проверить.

        List<Integer> list = null;

        Set<Integer> set = null;

        list = new ArrayList<>(Arrays.asList(array));

        set = new HashSet<>(Arrays.asList(array));

        ///////////код для проверки://///////////
        System.out.println("\n====================TASK 5=======================");
        System.out.println("Integer[]: ");
        System.out.println(Arrays.toString(array));
        System.out.println("ArrayList: ");
        System.out.println(list);
        System.out.println("HashSet: ");
        System.out.println(set);

        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами
         *    подходящих классов.
         *
         * 2. В обе коллекции поместите элементы массива array.
         *
         * 3. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
