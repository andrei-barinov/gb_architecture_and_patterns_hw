package ru.gb.patterns.abstractFactory.carFactory;

import ru.gb.patterns.abstractFactory.abstractCarFactory.CarsFactory;
import ru.gb.patterns.abstractFactory.car.toyota.ToyotaCoupe;
import ru.gb.patterns.abstractFactory.car.toyota.ToyotaSedan;
import ru.gb.patterns.abstractFactory.typeCar.Coupe;
import ru.gb.patterns.abstractFactory.typeCar.Sedan;

public class ToyotaFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }
}
