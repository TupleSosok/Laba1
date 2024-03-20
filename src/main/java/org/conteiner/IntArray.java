package org.conteiner;

/**
 * Создать класс контейнер, позволяющий хранить произвольное количество целых чисел.
 * Использование встроенных коллекций запрещено.
 * Задание можно реализовать с помощью массива или связанного списка.
 * Контейнер должен позволять добавлять, извлекать, удалять элементы
 */
public class IntArray {

    /**
     * @value начальная длинна при создании
     */
    static private final int DEFAULT_LEN = 10;
    /**
     * @value значение на сколько увеличиваться масив при переполнении
     */
    static private final int INCREMENT_STEP = 5;

    /**
     * Текущая длинна массива
     */
    private int length;

    /**
     * Хранить значения массива
     */
    private int[] array;

    /**
     * Конструктор. Создание массива, текущая длинна 0
     */
    public IntArray() {
        array = new int[DEFAULT_LEN];
        length = 0;
    }

    /**
     * Add. Добавление в массив
     * Если переполнен должен создаваться с новой большей длинной
     * @param num the num
     */
    public void add(int num){
        if(length == array.length){
            int[] newArray = new int[array.length + INCREMENT_STEP];
            System.arraycopy(array, 0,newArray,0,array.length);
            array = newArray.clone();
        }
        array[++length] = num;
    }

    /**
     * Delete.
     *
     * @param index the index
     */
    public void delete(int index){

    }

    /**
     * Int at int.
     *
     * @param index the index
     * @return the int
     */
    public int intAt(int index){
        return 0;
    }

}
