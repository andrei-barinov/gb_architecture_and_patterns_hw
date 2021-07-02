package ru.gb.patterns.decorator.example_2;

import java.util.List;

public class ArrDecorator implements Arr {
    private Arr figure;

    public ArrDecorator(Arr figure) {
        this.figure = figure;
    }

    @Override
    public List<Integer> getResult() {
        return figure.getResult();
    }
}
