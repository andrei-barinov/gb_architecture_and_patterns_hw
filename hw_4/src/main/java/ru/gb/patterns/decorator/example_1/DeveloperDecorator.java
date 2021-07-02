package ru.gb.patterns.decorator.example_1;

public class DeveloperDecorator implements Developer{
    private Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
