package ru.avalon.java.j20.labs.models;

public final class Numbers {

    /**
     * Скрытый конструктор, чтобы предотвратить создание
     * экземпляров данного типа.
     */
    private Numbers() {}

    /**
     * Возвращает сумму значений переданного массиа.
     *
     * @param values массив чисел
     * @return сумма элементов массива
     */
    public static <T extends Number> double sum(T[] values) {
        double sum = 0.0;
        for (T value : values) sum += value.doubleValue(); //привожу T value к типу double как к более широкому, который сможет вместить всебя все остальные, которые extends Number;
        return sum;
    }

    /**
     * Выполняет поиск среднего арифметического заданного
     * массива чисел.
     *
     * @param values массив значений
     * @return среднее арифметическое с точностью до типа {@code double}.
     */
    //         * 1. Обобщить метод поиск среднего арифметического
    //         *
    //         *    Выполните обобщение метода с использованием шаблона так,
    //         *    чтобы метод мог выполнять поиск среднего арифметического
    //         *    в массивах любых чисел: целых и вещественных.
    //         *
    //         *    Возвращать необходимо значение типа double.
    public static <T extends Number> double avg(T[] values) {
        return sum(values) / values.length;
    }

    /**
     * Возвращает большее из дух переданных значений.
     *
     * @param a перое значение
     * @param b второе значение
     * @return большее из двух значений
     */

    //этот вспомогательный метод тоже обобщаю.
    public static <T extends Number> T max(T a, T b) {
        return a.doubleValue() > b.doubleValue() ? a : b; //так же привожу T value к типу double как к более широкому, который сможет вместить всебя все остальные, которые extends Number;
    }

    /**
     * Выполняет поиск максимального значения в массиве.
     *
     * @param values массив значений
     * @return максимальное значение массива
     */
    //         * 2. Обобщить метод поиск максимального значения
    //         *
    //         *    Выполните обобщение метода с использованием шаблона так,
    //         *    чтобы метод мог выполнять поиск максимального значения
    //         *    в массивах любых чисел: целых и вещественных.
    public static <T extends Number> T max(T[] values) {
        T result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = max(result, values[i]);
        }
        return result;
    }

    /**
     * Возвращает меньшее из двух переданных значений.
     *
     * @param a первое значение
     * @param b второе значение
     * @return меньшее из дух значений
     */
    // и этот вспомогательный метод тоже обобщаю.
    public static <T extends Number> T min(T a, T b) {
        return a.doubleValue() < b.doubleValue() ? a : b; // --- > double вместит в себя и целочисленные, и вещественные...
    }

    /**
     * Выполняет поиск минимального значения массива.
     *
     * @param values массив значений
     * @return минимальное значение массива
     */
    //         * 3. Обобщить метод поиск минимального значения
    //         *
    //         *    Выполните обобщение метода с использованием шаблона так,
    //         *    чтобы метод мог выполнять поиск минимального значения
    //         *    в массивах любых чисел: целых и вещественных.
    public static <T extends Number> T min(T[] values) {
        T result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = min(result, values[i]);
        }
        return result;
    }
}
