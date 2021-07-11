package ru.gb.app.factories;

import ru.gb.app.document.Document;

public abstract class Manager {
    protected String name;
    protected String department;

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public abstract Document createDocument();
}
