package ru.avalon.java.j20.labs.models;

import java.util.Arrays;
import java.util.Objects;

/**
 * Представление о человеке.
 */
public class Person {
    /**
     * Имя.
     */
    private final String name;
    /**
     * Фамилия.
     */
    private final String surname;

    /**
     * Создаёт экземпляр класса на основании имени и даты
     * рождения.
     *
     * @param name имя человека
     * @param surname дата рождения человека
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * возвращает имя человека.
     *
     * @return имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает фамилию человека.
     *
     * @return фамилия человека
     */
    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        //проверка на тот же самый объект:
        if( this == o){
            return true;
        }
        //проверка на Null  и на различные классы:
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        //приведение к Person - downcast
        Person p = (Person)o;

        //сравнение полей статическим методом вспомогательного класса Objects:
        if(Objects.equals(p.getName(), getName()) && Objects.equals(p.getSurname(), getSurname())){
            return true;
        }
        //если поля не эквивалентны - значит объекты не одинаковые.
        return false;
    }

    @Override
    public int hashCode() {
        String[] fields = {name, surname};
        return Arrays.hashCode(fields);  //------> то же самое что Objects.hash(name, surname);
        //внутри Arrays.hashCode сидит такая логика:
        //        int result = 1;
        //        for (Object element : fields)
        //            result = 31 * result + (element == null ? 0 : element.hashCode()); //public native int hashCode() --> нативный, непонятно как реализован.
        //        return result;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + ": " + name + ", " + surname;
    }
}
