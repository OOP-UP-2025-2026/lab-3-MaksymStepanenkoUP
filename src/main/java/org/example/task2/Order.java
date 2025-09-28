package org.example.task2;

/**
 * Клас представляє замовлення з унікальним ідентифікатором та клієнтом.
 */
public class Order {

    /** Унікальний ідентифікатор замовлення. */
    private final long id;

    /** Ім'я клієнта, який зробив замовлення. */
    private final String customer;

    /**
     * Створює нове замовлення з заданим ідентифікатором та ім'ям клієнта.
     *
     * @param id унікальний ідентифікатор замовлення
     * @param customer ім'я клієнта
     */
    public Order(final long id, final String customer) {
        this.id = id;
        this.customer = customer;
    }

    /**
     * Формує рахунок для замовлення на основі вмісту кошика.
     *
     * @param cart об'єкт Cart, що містить товари для замовлення
     * @return текстовий рахунок з переліком товарів та загальною сумою
     */
    public String formOrderBill(final Cart cart) {

        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(id).append(" for customer ").append(customer);
        builder.append("\n------------------\n");

        double sum = 0.0;

        for (int i = 0; i < cart.getSize(); i++) {
            Item item = cart.getItem(i);
            sum += item.getPrice();
            builder.append("Item id: ").append(item.getId())
                    .append(" name: ").append(item.getName())
                    .append(" price: ").append(item.getPrice())
                    .append("\n");
        }
        builder.append("------------------\n");
        builder.append("Total sum: ");
        builder.append(sum);

        return builder.toString();
    }
}
