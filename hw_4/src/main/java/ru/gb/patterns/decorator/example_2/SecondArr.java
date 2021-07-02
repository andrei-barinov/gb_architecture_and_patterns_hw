package ru.gb.patterns.decorator.example_2;

import java.util.List;
import java.util.stream.Collectors;

public class SecondArr extends ArrDecorator {
    public SecondArr(Arr arr) {
        super(arr);
    }

    public List<Integer> plusFive(){
        List<Integer> arr = super.getResult();
        return arr.stream().map((s) -> s + 5).collect(Collectors.toList());
    }

    @Override
    public List<Integer> getResult() {
        return this.plusFive();
    }
}
