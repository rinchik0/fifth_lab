package org.example.somepackage;

import org.example.output.Output;

public class SomeImpl implements SomeInterface {
    Output out;
    public SomeImpl(Output out) {
        this.out = out;
    }
    @Override
    public void doSomething() {
        out.println("A");
    }
}
