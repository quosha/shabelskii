public class Stack <T> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    
    public Stack() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

   
    public void push(T item) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = item;
    }

 
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        T item = (T) elements[--size];
        elements[size] = null; 
        return item;
    }

    
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return (T) elements[size - 1];
    }

   
    public boolean isEmpty() {
        return size == 0;
    }

    
    public int size() {
        return size;
    }

  
    private void resize() {
        int newCapacity = elements.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Верхний элемент: " + stack.peek()); 
        System.out.println("Удаляем элемент: " + stack.pop()); 
        System.out.println("Верхний элемент: " + stack.peek()); 
        System.out.println("Размер стека: " + stack.size()); 
    }
}