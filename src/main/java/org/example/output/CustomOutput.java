package org.example.output;

public class CustomOutput implements Output {
    String calls;
    public CustomOutput() {
        calls = "";
    }
    @Override
    public void print(String str) {
        calls += str;
    }

    @Override
    public void println(String str) {
        calls += (str + "\n");
    }

    public String getAll() {
        return calls;
    }
}
