package org.example.output;

/**
 * Интерфейс, позволяющий выводить информацию необходимым образом
 */
public interface Output {
    /**
     * Метод вывода строки.
     * @param str строка
     */
    void print(String str);

    /**
     * Метод вывода строки с переносом на следующую.
     * @param str строка
     */
    void println(String str);
}
