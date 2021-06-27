package ru.gb.patterns.singleton;

public class Circle {
    private static Circle instance;

    private double radius;
    private double xCoordinate;
    private double yCoordinate;

    private Circle(double radius, double xCoordinate, double yCoordinate) {
        this.radius = radius;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public static synchronized Circle getInstance(double radius, double xCoordinate, double yCoordinate){
        if(instance == null){
            instance = new Circle(radius, xCoordinate, yCoordinate);
        }
        return instance;
    }

    public void print(){
        System.out.println("Радиус: " + this.radius + "\n" +
                "X0: " + this.xCoordinate + "\n" +
                "Y0: " + this.yCoordinate + "\n");
    }

}
