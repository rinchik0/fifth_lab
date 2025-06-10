package org.example.output;

/**
 * Класс, реализующий интерфейс Output. Позволяет выводить информацию в консоль.
 */
public class ConsoleOutput implements Output {
    @Override
    public void print(String str) {
        System.out.print(str);
    }

    @Override
    public void println(String str) {
        System.out.println(str);
    }
}
