package ru.gb.patterns.iterator;

public class Country implements Collection {
    private String name;
    private String[] cities;

    public Country(String name, String[] cities) {
        this.name = name;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }

    @Override
    public Iterator getIterator() {
        return new CitiesIterator();
    }

    private class CitiesIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if(index < cities.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return cities[index++];
        }
    }
}
