package org.example.somepackage;

import org.example.annotations.AutoInjectable;

/**
 * Класс с неопределенными полями, помеченными аннотацией, которые должны быть проинициализированы.
 */
public class SomeBean {
    @AutoInjectable
    private SomeInterface field1;
    @AutoInjectable
    private SomeOtherInterface field2;

    /**
     * Метод, вызывающий методы полей.
     */
    public void foo(){
        field1.doSomething();
        field2.doSomeOther();
    }
}
