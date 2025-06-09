package org.example.somepackage;

import org.example.output.Output;

public class OtherImpl implements SomeInterface {
    Output out;
    public OtherImpl(Output out) {
        this.out = out;
    }
    @Override
    public void doSomething() {
        out.println("B");
    }
}
