package ru.gb.patterns.decorator.example_1;

public class JavaDeveloper implements Developer{
    @Override
    public String makeJob() {
        return "Write Java code. ";
    }
}
