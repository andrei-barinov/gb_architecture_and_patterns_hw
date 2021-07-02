package ru.gb.patterns.decorator.example_2;

import java.util.List;
import java.util.stream.Collectors;

public class FistArr implements Arr {
    private List<Integer> arr;

    public FistArr(List<Integer> arr) {
        this.arr = arr;
    }

    @Override
    public List<Integer> getResult() {
        this.arr.stream().map((x) -> x + 5).collect(Collectors.toList());
        return arr;
    }
}
