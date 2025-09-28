package org.example.task2;

import java.util.Scanner;

public final class Main {

    private Main() {
        throw new AssertionError("Цей клас не можна створювати");
    }
    /**
     * Головний метод програми.
     * Виконує демонстрацію роботи з Box, Cart, Order
     * та стеком цілих чисел IntStack.
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(final String[] args) {

        Box box = new Box(2, 3, 4);
        System.out.println("Площа: " + box.getSurfaceArea() + " см²");
        System.out.println("Площа бічної поверхні: " + box.getLateralSurfaceArea() + " см²");
        System.out.println("Об'єм: " + box.getVolume() + " см³");

        Cart cart = new Cart(10);
        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.add(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.add(new Item(5, "Samsung RB34 Холодильник", 22399));
        cart.add(new Item(6, "De'Longhi Magnifica S Кавоварка", 10599));
        cart.add(new Item(7, "Gorenje Електрична плита", 9999));
        cart.add(new Item(8, "Dyson V11 Пилосос", 16499));
        cart.add(new Item(9, "Samsung ME83K Мікрохвильова піч", 3199));
        cart.add(new Item(10, "Philips DryCare Фен", 1499));

        System.out.println(cart);

        cart.removeByIndex(9);

        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);

        IntStack stack = new IntStack();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Оберіть функцію роботи зі стеком:");
            System.out.println("1 - Додати елемент до стеку (push)");
            System.out.println("2 - Вилучити елемент зі стеку (pop)");
            System.out.println("3 - Переглянути елемент на вершині стеку (peek)");
            System.out.println("4 - Подивитися кількість елементів у стеку (size)");
            System.out.println("5 - Перевірити, чи порожній стек (isEmpty)");
            System.out.println("6 - Очистити стек (clear)");
            System.out.println("0 - Вихід");

            System.out.print("Ваш вибір: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введіть число, яке потрібно додати до стеку: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    System.out.println("Елемент " + value + " додано до стеку.");
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped == 0 && stack.isEmpty()) {
                        System.out.println("Стек порожній. Неможливо вилучити елемент.");
                    } else {
                        System.out.println("Вилучено елемент зі стеку: " + popped);
                    }
                    break;
                case 3:
                    int top = stack.peek();
                    if (top == 0 && stack.isEmpty()) {
                        System.out.println("Стек порожній. Немає елемента для перегляду.");
                    } else {
                        System.out.println("Елемент на вершині стеку: " + top);
                    }
                    break;
                case 4:
                    System.out.println("Кількість елементів у стеку: " + stack.size());
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        System.out.println("Стек порожній.");
                    } else {
                        System.out.println("Стек не порожній.");
                    }
                    break;
                case 6:
                    stack.clear();
                    System.out.println("Стек повністю очищено.");
                    break;
                case 0:
                    System.out.println("Вихід з програми...");
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        } while (choice != 0);
    }
}
