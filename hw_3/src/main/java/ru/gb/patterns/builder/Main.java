package ru.gb.patterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilderImpl().setName("Andrei").setAge(27).setSalary(1000).build();
        person.print();

        Person person2 = new PersonBuilderImpl().setName("Dmitri").setAge(25).setSalary(500).build();
        person2.print();
    }
}
