package org.example.somepackage;

import org.example.Injector;
import org.example.output.ConsoleOutput;
import org.example.output.CustomOutput;
import org.example.output.Output;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBeanTest {
    @Test
    void fooSomeImpl() {
        String actual = "", expected = "A\nC\n";
        try {
            CustomOutput out = new CustomOutput();
            SomeBean sb = (new Injector(out, "config.properties")).inject(new SomeBean());
            sb.foo();
            actual = out.getAll();
        } catch (Exception e) {
            System.out.println("Ошибка инъекции");
            e.printStackTrace();
        }
        Assertions.assertNotEquals("", actual);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void fooOtherImpl() {
        String actual = "", expected = "B\nC\n";
        try {
            CustomOutput out = new CustomOutput();
            SomeBean sb = (new Injector(out, "otherconfig.properties")).inject(new SomeBean());
            sb.foo();
            actual = out.getAll();
        } catch (Exception e) {
            System.out.println("Ошибка инъекции");
            e.printStackTrace();
        }
        Assertions.assertNotEquals("", actual);
        Assertions.assertEquals(expected, actual);
    }
}