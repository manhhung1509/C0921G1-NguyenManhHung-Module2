package bai_10_DSA_danh_sach.bai_tap.array_list;


import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    MyList() {
        System.out.println("kích thước của mảng= " + DEFAULT_CAPACITY);
        elements = new Object[DEFAULT_CAPACITY];
    }

    MyList(int capacity) {
        if (capacity > 0) {
            System.out.println("độ dài mảng = " + capacity);
            elements = new Object[capacity];
        } else {
            System.out.println("Lỗi tham số truyền vào");
            throw new IllegalArgumentException("capacity= " + capacity);
        }
    }

    public void add(int index, E element) throws IllegalAccessException {
        if (index > elements.length) {
            throw new IllegalAccessException("Lỗi index: " + index);
        } else if (elements.length == index + 1) {
            ensureCapacity(1);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else if (size == elements.length) {
            ensureCapacity(1);
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public E remove(int index) throws IllegalAccessException {
        if (index < 0 || index > elements.length) {
            throw new IllegalAccessException("Lỗi index: " + index);
        }
        E element = (E) elements[index];
        if (size - 1 - index >= 0) System.arraycopy(elements, index + 1, elements, index, size - 1 - index);
        elements[size - 1] = null;
        size--;
        return element;
    }

    public int size() {
        return this.size;
    }

    public MyList<E> clone() {
        MyList<E> myNewList = new MyList<>();
        myNewList.elements = Arrays.copyOf(elements, size);
        myNewList.size = size;
        return myNewList;
    }

    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean add(E element) throws IllegalAccessException {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) throws IllegalAccessException {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("Đã khởi tạo mảng có kích thước= " + elements.length);

        } else {
            throw new IllegalAccessException("minCapacity=" + minCapacity);
        }
    }


    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
        size = 0;
        Arrays.fill(elements, null);
    }
}
