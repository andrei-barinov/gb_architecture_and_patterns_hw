package ru.gb.patterns.decorator.example_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 5, 20, 100);
        Arr arr = new FistArr(list);
        System.out.println(arr.getResult());

        Arr arr2 = new SecondArr(new FistArr(list));
        System.out.println(arr2.getResult());

        Arr arr3 = new ThirdArr(new SecondArr(new FistArr(list)));
        System.out.println(arr3.getResult());

        ThirdArr thirdArr = new ThirdArr(new FistArr(list));
        System.out.println(thirdArr.getBinaryValue());

        SecondArr secondArr = new SecondArr(new FistArr(list));
        System.out.println(secondArr.plusFive());
    }
}
