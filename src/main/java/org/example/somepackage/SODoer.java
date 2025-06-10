package org.example.somepackage;

import org.example.output.Output;

/**
 * Класс, реализующий интерфейс SomeOtherInterface. Позволяет выводить букву C.
 */
public class SODoer implements SomeOtherInterface {
    Output out;

    /**
     * Конструктор.
     * @param out выходной поток
     */
    public SODoer(Output out) {
        this.out = out;
    }
    @Override
    public void doSomeOther() {
        out.println("C");
    }
}
