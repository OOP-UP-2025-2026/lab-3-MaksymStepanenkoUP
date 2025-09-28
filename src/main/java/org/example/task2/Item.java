package org.example.task2;

/**
 * Клас, що описує предмет товару з унікальним ID, назвою та ціною.
 */
public class Item {

    /** Унікальний ідентифікатор предмета. */
    private final long id;

    /** Назва предмета. */
    private final String name;

    /** Ціна предмета. */
    private final double price;

    /**
     * Конструктор для створення нового предмету.
     *
     * @param id    унікальний ідентифікатор предмета
     * @param name  назва предмету
     * @param price ціна предмета
     */
    public Item(final long id, final String name, final double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Повертає унікальний ідентифікатор предмета.
     *
     * @return ID предмету
     */
    public long getId() {
        return id;
    }

    /**
     * Повертає назву предмета.
     *
     * @return назва предмету
     */
    public String getName() {
        return name;
    }

    /**
     * Повертає ціну предмета.
     *
     * @return ціна предмета
     */
    public double getPrice() {
        return price;
    }

    /**
     * Повертає текстове представлення об'єкта Item.
     *
     * @return рядок з інформацією про предмет
     */
    @Override
    public String toString() {
        return "Item{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", price=" + price
                + '}';
    }
}
