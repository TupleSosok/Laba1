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
     * @value если в конце пустых элементов больше чем указанно, размер уменьшится
     * на INCREMENT_STEP
     */
    static private final int TOLERANCE_TO_EMPTY = 10;

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
     *
     * @param num число для вставки
     */
    public void add(int num){
        if(length == array.length - 1){
            int[] newArray = new int[array.length + INCREMENT_STEP];
            System.arraycopy(array, 0,newArray,0,array.length);
            array = newArray.clone();
        }
        array[length++] = num;
    }

    /**
     * Delete.
     * Удаление по индексу
     * Путем сдвига всего массива на место где был элемент с этим индексом
     *
     * @param index индекс удаляемого элемента
     * @throws IllegalArgumentException если выходит за границы массива, где правая граница length
     * @see IntArray#array IntArray#array
     */
    public void delete(int index) throws IllegalArgumentException {
        if(index > length || index < 0) throw new IllegalArgumentException();
        if(array.length - length > 10)
        {
            int[] newArray = new int[array.length - INCREMENT_STEP];
            System.arraycopy(array, 0,newArray,0,array.length);
            array = newArray.clone();
        }
        System.arraycopy(array,index + 1, array, index, length - index - 1);
        --length;
    }


    /**
     * Доступ
     * @param index the index
     * @return the int
     * @throws IllegalArgumentException если выходит за границы массива, где правая граница
     * @see IntArray#array IntArray#array
     */
    public int intAt(int index) throws IllegalArgumentException{
        if(index > length || index < 0) throw new IllegalArgumentException();
        return array[index];
    }

    public int getLength() {
        return length;
    }
}
