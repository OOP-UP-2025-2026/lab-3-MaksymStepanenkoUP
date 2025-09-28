package org.example.task2;

import java.util.Arrays;

public final class Cart {
    /** Масив товарів у кошику. */
    private final Item[] contents;
    /** Поточна кількість товарів у кошику. */
    private int index;

    /**
     * Створює порожній кошик з вказаною місткістю.
     *
     * @param capacity максимальна кількість товарів у кошику
     */
    public Cart(final int capacity) {
        this.contents = new Item[capacity];
        this.index = 0;
    }

    /**
     * Повертає товар за індексом.
     *
     * @param i індекс товару
     * @return товар у кошику
     * @throws IndexOutOfBoundsException якщо індекс поза межами
     */
    public Item getItem(final int i) {
        if (i < 0 || i >= index) {
            throw new IndexOutOfBoundsException();
        }
        return contents[i];
    }

    /**
     * Повертає поточну кількість товарів у кошику.
     *
     * @return кількість товарів
     */
    public int getSize() {
        return this.index;
    }

    /**
     * Видаляє товар з кошика за індексом.
     *
     * @param itemIndex індекс товару для видалення
     */
    public void removeByIndex(final int itemIndex) {

        if (index == 0) {
            return;
        }

        int foundItemIndex = findItemInArray(contents[itemIndex]);

        if (foundItemIndex == -1) {
            return;
        }

        if (foundItemIndex == index - 1) {
            contents[index - 1] = null;
            index--;
            return;
        }

        shiftArray(foundItemIndex);
    }

    /**
     * Зсуває елементи масиву після видалення.
     *
     * @param itemIndex індекс, з якого почати зсув
     */
    public void shiftArray(final int itemIndex) {
        for (int i = itemIndex; i < index - 1; i++) {
            contents[i] = contents[i + 1];
        }
        contents[index - 1] = null;
        index--;
    }

    /**
     * Знаходить індекс товару у масиві за ID.
     *
     * @param item товар для пошуку
     * @return індекс товару або -1, якщо не знайдено
     */
    public int findItemInArray(final Item item) {
        for (int i = 0; i < index; i++) {
            if (contents[i].getId() == item.getId()) {
                return i;
            }
        }

        return -1;
    }

    void add(final Item item) {
        if (isCartFull()) {
            return;
        }

        contents[index] = item;
        index++;
    }

    /**
     * Перевіряє, чи заповнений кошик.
     *
     * @return true, якщо корзина повна, інакше false
     */
    public boolean isCartFull() {
        return index == contents.length;
    }

    @Override
    public String toString() {
        return "Cart{"
                + "contents=" + Arrays.toString(contents)
                + '}' + "\n";
    }
}
