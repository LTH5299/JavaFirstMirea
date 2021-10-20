package ru.mirea.task13;

public class MyArrayList {
    private int INIT_SIZE;
    private int pointer = 0;

    MyArrayList(int size) {
        this.INIT_SIZE = size;
    }

    private Object[] array = new Object[INIT_SIZE];

    public void add(int index, Object obj) {
        if (index > array.length) {
            System.out.println("Wrong index");
            System.exit(0);
        }
        Object[] tmp = new Object[array.length + 1];
        if (index >= 0) System.arraycopy(array, 0, tmp, 0, index);
        tmp[index] = obj;
        if (array.length - index >= 0) System.arraycopy(array, index, tmp, index + 1, array.length - index);
        array = tmp;
        pointer++;
    }

    public void add(Object obj) {
        if (pointer == array.length - 1) {
            resize(array.length * 2);
        }
        array[pointer++] = obj;
    }

    public void remove(int index) {
        if (pointer - index >= 0) System.arraycopy(array, index + 1, array, index, pointer - index);
        array[pointer] = null;
        pointer--;
    }

    public boolean contains(Object obj) {
        for (int i=0; i<pointer; ++i) {
            if (array[i] != obj) {
                continue;
            }
            return true;
        }
        return false;
    }

    public void resize(int size) {
        Object[] newArr = new Object[size];
        System.arraycopy(array, 0, newArr, 0, pointer);
        array = newArr;
    }

    public void set(int index, Object obj) {
        if (index > pointer) {
            System.out.print("Index out of bound");
            System.exit(0);
        }
        array[index] = obj;
    }

    public Object get(int index) {
        return array[index];
    }

    public int size() {
        return pointer;
    }
}
