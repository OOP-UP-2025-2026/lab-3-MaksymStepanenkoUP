package org.example.task2;

public class Box {
    /** Довжина Box. */
    private int length;
    /** Ширина Box. */
    private int width;
    /** Висота Box. */
    private int height;

    /**
     * Конструктор коробки.
     *
     * @param length довжина коробки
     * @param width ширина коробки
     * @param height висота коробки
     * @throws IllegalArgumentException якщо будь-яка сторона <= 0
     */
    public Box(final int length, final int width, final int height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    /**
     * Перевіряє, чи сторона більша за 0.
     *
     * @param value значення сторони
     * @param sideName назва сторони для повідомлення про помилку
     * @throws IllegalArgumentException якщо value <= 0
     */
    private void validateSide(final int value, final String sideName) {
        if (value <= 0) {
            throw new IllegalArgumentException(sideName + " має бути більше 0");
        }
    }

    /**
     * Встановлює довжину коробки.
     *
     * @param length довжина коробки
     * @throws IllegalArgumentException якщо length <= 0
     */
    public void setLength(final int length) {
        validateSide(length, "Довжина");
        this.length = length;
    }

    /**
     * Встановлює ширину коробки.
     *
     * @param width ширина коробки
     * @throws IllegalArgumentException якщо width <= 0
     */
    public void setWidth(final int width) {
        validateSide(width, "Ширина");
        this.width = width;
    }

    /**
     * Встановлює висоту коробки.
     *
     * @param height висота коробки
     * @throws IllegalArgumentException якщо height <= 0
     */
    public void setHeight(final int height) {
        validateSide(height, "Висота");
        this.height = height;
    }

    /**
     * Обчислює об’єм коробки.
     *
     * @return об’єм коробки, рівний length * width * height
     */
    public int getVolume() {
        return length * width * height;
    }

    /**
     * Обчислює площу бічної поверхні коробки.
     *
     * @return площа бічної поверхні
     */
    public int getLateralSurfaceArea() {
        return 2 * (length * height + width * height);
    }

    /**
     * Обчислює площу всієї поверхні коробки.
     *
     * @return площа поверхні коробки
     */
    public int getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }
}
