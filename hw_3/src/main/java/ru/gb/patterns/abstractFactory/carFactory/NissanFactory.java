package ru.gb.patterns.abstractFactory.carFactory;

import ru.gb.patterns.abstractFactory.abstractCarFactory.CarsFactory;
import ru.gb.patterns.abstractFactory.car.nissan.NissanCoupe;
import ru.gb.patterns.abstractFactory.car.nissan.NissanSedan;
import ru.gb.patterns.abstractFactory.typeCar.Coupe;
import ru.gb.patterns.abstractFactory.typeCar.Sedan;

public class NissanFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new NissanSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new NissanCoupe();
    }
}
