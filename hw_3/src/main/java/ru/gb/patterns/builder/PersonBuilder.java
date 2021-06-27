package ru.gb.patterns.builder;

public interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setAge(int age);
    PersonBuilder setSalary(int salary);
    Person build();
}
