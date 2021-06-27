package ru.gb.patterns.builder;

public class Person {
     private String name;
     private int age;
     private int salary;

     public void print(){
         System.out.println("Имя: " + this.name + "\n" + "Возраст: " + this.age + "\n" + "Зарплата: " + this.salary);
     }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
