package ru.gb.patterns.factory;

public class CoffeeShopApp {
    public static void main(String[] args) {
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        CoffeeShop coffeeShop = new CoffeeShop(simpleCoffeeFactory);

        coffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);
        coffeeShop.orderCoffee(CoffeeType.AMERICANO);
    }
}
