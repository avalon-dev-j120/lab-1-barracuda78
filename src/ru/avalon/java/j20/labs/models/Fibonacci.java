package ru.avalon.java.j20.labs.models;

import java.util.*;

/**
 * Модель получения последовательности чисел Фибоначчи.
 *
 * <p>Числа Фибонааччи (иногда пишут Фибона́чи[1]) — элементы
 * числовой последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21,
 * 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
 * 6765, 10946, 17711, … (последовательность A000045 в OEIS),
 * в которой первые два числа равны либо 1 и 1, либо 0 и 1,
 * а каждое последующее число равно сумме двух предыдущих
 * чисел. Названы в честь средневекового математика Леонардо
 * Пизанского (известного как Фибоначчи).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8">Числа Фибоначчи</a>
 */
public class Fibonacci implements Iterable<Integer> {
    //         * 1. Завершить описание класса Fibonacci так, чтобы класс
    //         *    возвращал заданное количество чисел последовательности
    //         *    Фибоначчи.
    //         *    Количество чисел последовательности можно указывать
    //         *    при создании экземпляра класса.
    private static int count;                                     //переменная которая указывает кол-во чисел Фибоначчи ---> задается пользователем.
    private static List<Integer> list = new ArrayList<>(count);   //список, который хранит числа фибоначчи в количестве от 0 до count;

    //конструктор принимает на вход необходимое количество чисел Фибоначчи.
    public Fibonacci(int count){
        Fibonacci.count = count;                                 //инициализация поля count.
        listFill(count);                                    //вызов метода, заполняющего list нужными значениями сразу при создании объекта.
    }
    //+  +
    //0, 1, 1, 2, 3, 5, 8, 13, 21...
    private void listFill(int count){
        list.add(0);
        list.add(1);
        list.add(1);
        int previousCounter = 1;
        int counter = 1;
        int i = 3;
        while(i++ < count){
            list.add(previousCounter + counter);

            int temp = previousCounter;
            previousCounter = counter;
            counter =  counter + temp;
        }
    }

    /**
     * Итератор, выполняющий обход последовательности
     * чисел Фибоначчи.
     */
    private static class FibonacciIterator implements Iterator<Integer> {

        /**
         * Определяет, есть ли следующее значение
         * последовательности чисел Фибоначчи.
         *
         * @return {@code true}, если следующее число
         * последовательности существует. В обратном случае
         * {@code false}.
         */

        int cursor = -1;
        @Override
        public boolean hasNext() {
            return cursor < count-1;  //индекс последнего элемента списка list = count-1.
            //throw new UnsupportedOperationException("Not implemented yet!");
        }

        /**
         * Возвращает следующее число последовательности
         * чисел Фибоначчи.
         *
         * @return следующее число последовательности.
         */

        //NoSuchElementException() ---> кидается в аналогичном методе в AbstractList.
        @Override
        public Integer next() {
            while(hasNext()){
                cursor++;
                return list.get(cursor);
            }
            throw new NoSuchElementException();
        }
    }

    /**
     * Возвращает итератор, позволяющий выполнить обход
     * последовательности чисел Фибоначчи.
     *
     * @return итератор последовательности чисел Фибоначчи
     */
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }


    public static int getCount() {
        return count;
    }

    public static List<Integer> getList() {
        return list;
    }
}
