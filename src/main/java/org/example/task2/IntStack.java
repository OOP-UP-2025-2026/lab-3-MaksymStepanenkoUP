package org.example.task2;

public final class IntStack {
    /** Масив для збереження елементів. */
    private int[] stack;
    /** Індекс вершини стека. */
    private int top;
    /** Початковий розмір масиву. */
    private static final int INITIAL_CAPACITY = 10;

    /**
     * Конструктор стека.
     * Ініціалізує масив зі стартовою місткістю і порожній стек.
     */
    public IntStack() {
        stack = new int[INITIAL_CAPACITY];
        top = 0;
    }

    /**
     * Додає елемент у верхню частину стека.
     * Якщо масив заповнений, його місткість подвоюється.
     *
     * @param value ціле число для додавання у стек
     */
    public void push(final int value) {
        if (top == stack.length) {
            expandCapacity();
        }
        stack[top++] = value;
    }

    /**
     * Видаляє та повертає елемент з верхньої частини стека.
     *
     * @return верхній елемент стека; якщо стек порожній, повертає 0
     */
    public int pop() {
        if (isEmpty()) {
            return 0; // умова завдання
        }
        return stack[--top];
    }

    /**
     * Повертає верхній елемент стека без його видалення.
     *
     * @return верхній елемент стека; якщо стек порожній, повертає 0
     */
    public int peek() {
        if (isEmpty()) {
            return 0;
        }
        return stack[top - 1];
    }

    /**
     * Повертає кількість елементів у стеку.
     *
     * @return число елементів у стеку
     */
    public int size() {
        return top;
    }

    /**
     * Перевіряє, чи стек порожній.
     *
     * @return true, якщо стек не містить елементів; false інакше
     */
    public boolean isEmpty() {
        return top == 0;
    }

    /**
     * Очищає стек, видаляючи всі елементи.
     */
    public void clear() {
        top = 0;
    }

    /**
     * Подвоює місткість масиву стека, якщо він заповнений.
     */
    private void expandCapacity() {
        int[] newStack = new int[stack.length * 2];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }
}
