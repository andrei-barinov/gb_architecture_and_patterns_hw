package ru.gb.patterns.abstractFactory.abstractCarFactory;

import ru.gb.patterns.abstractFactory.typeCar.Coupe;
import ru.gb.patterns.abstractFactory.typeCar.Sedan;

public interface CarsFactory {
    Sedan createSedan();
    Coupe createCoupe();
}
