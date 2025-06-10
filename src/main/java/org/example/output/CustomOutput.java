package org.example.output;

/**
 * Класс, реализующий интерфейс Output. Позволяет сохранять весь вывод в строке, чтобы потом считать. Для тестирования.
 */
public class CustomOutput implements Output {
    String calls;

    /**
     * Конструктор.
     */
    public CustomOutput() {
        calls = "";
    }
    @Override
    public void print(String str) {
        calls += str;
    }

    @Override
    public void println(String str) {
        calls += (str + "\n");
    }

    /**
     * Метод, возвращающий весь вывод.
     * @return строка
     */
    public String getAll() {
        return calls;
    }
}
