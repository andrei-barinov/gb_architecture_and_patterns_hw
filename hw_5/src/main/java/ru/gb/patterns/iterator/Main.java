package ru.gb.patterns.iterator;

public class Main {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Maven", "Hibernate"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Andrei Barinov", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        System.out.println();

        String[] cities = {"Moscow", "St.Peterburg", "Ufa", "Kazan", "Samara"};
        Country country = new Country("Russia", cities);
        Iterator iterator1 = country.getIterator();
        System.out.println("Country: " + country.getName());
        System.out.println("Cities: ");

        while ((iterator1.hasNext())){
            System.out.println(iterator1.next().toString());
        }
    }
}
