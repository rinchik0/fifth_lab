package org.example.somepackage;

import org.example.output.Output;

public class SODoer implements SomeOtherInterface {
    Output out;
    public SODoer(Output out) {
        this.out = out;
    }
    @Override
    public void doSomeOther() {
        out.println("C");
    }
}
