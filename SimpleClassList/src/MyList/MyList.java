package MyList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
/* Setting method ensureCapa
purpose: double size of the array contain the elemnent
 */
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

/* Setting method add()
* purpose: add an element to the end of the list */
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    /* Setting method get()
    purpose: return an element to localtion i of the list
     */
    public E get(int i) {
        if (i > size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ",Size " + i);
        }
        return (E) elements[i];
    }

}
