package org.example.somepackage;

import org.example.output.Output;

/**
 * Класс, реализующий интерфейс SomeInterface. Позволяет выводить букву B.
 */
public class OtherImpl implements SomeInterface {
    Output out;

    /**
     * Конструктор.
     * @param out выходной поток
     */
    public OtherImpl(Output out) {
        this.out = out;
    }
    @Override
    public void doSomething() {
        out.println("B");
    }
}
