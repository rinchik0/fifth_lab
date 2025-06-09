package org.example.output;

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
