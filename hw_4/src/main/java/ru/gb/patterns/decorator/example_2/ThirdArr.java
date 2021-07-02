package ru.gb.patterns.decorator.example_2;

import java.util.List;
import java.util.stream.Collectors;

public class ThirdArr extends ArrDecorator{
    public ThirdArr(Arr figure) {
        super(figure);
    }

    public List<Integer> getBinaryValue(){
        List<Integer> arr = super.getResult();
        List<Integer> arr2 = arr.stream()
                .map((s) -> Integer.toBinaryString(s))
                .map((s) -> Integer.parseInt(s))
                .collect(Collectors.toList());
        return arr2;
    }

    @Override
    public List<Integer> getResult() {
        return this.getBinaryValue();
    }
}
