package ru.gb.app.factories;


import ru.gb.app.document.Document;
import ru.gb.app.document.impl.OrderImpl;

public class ServiceManager extends Manager {

    public ServiceManager(String name) {
            super.department = "service";
    }

    @Override
    public Document createDocument() {
        return new OrderImpl();
    }
}
