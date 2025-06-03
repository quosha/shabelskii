public class CustomList<T> implements IList<T> {
    private static final int DEFAULT_CAPACITY = 10;  
    private Object[] elements;                       
    private int size;                                

    
    public CustomList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    
    @Override
    public void add(T element) {
        if (size == elements.length) {
            resize();  
        }
        elements[size++] = element;
    }

    
    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;  
    }

    
    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    
    @Override
    public int size() {
        return size;
    }

    
    private void resize() {
        int newCapacity = elements.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
