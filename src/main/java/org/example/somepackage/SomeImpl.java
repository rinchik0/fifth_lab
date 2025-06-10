package org.example.somepackage;

import org.example.output.Output;

/**
 * Класс, реализующий интерфейс SomeInterface. позволяет выводить букву A.
 */
public class SomeImpl implements SomeInterface {
    Output out;

    /**
     * Конструктор.
     * @param out выходной поток
     */
    public SomeImpl(Output out) {
        this.out = out;
    }
    @Override
    public void doSomething() {
        out.println("A");
    }
}
