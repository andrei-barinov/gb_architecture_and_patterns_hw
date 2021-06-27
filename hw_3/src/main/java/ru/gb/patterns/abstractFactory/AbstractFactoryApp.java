package ru.gb.patterns.abstractFactory;


import ru.gb.patterns.abstractFactory.abstractCarFactory.CarsFactory;
import ru.gb.patterns.abstractFactory.carFactory.NissanFactory;
import ru.gb.patterns.abstractFactory.carFactory.ToyotaFactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        CarsFactory factory;

        factory = new ToyotaFactory();
        factory.createSedan();

        factory = new NissanFactory();
        factory.createCoupe();
    }
}
