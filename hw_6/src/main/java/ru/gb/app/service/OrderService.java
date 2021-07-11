package ru.gb.app.service;


import ru.gb.app.document.Document;
import ru.gb.app.factories.Manager;
import ru.gb.app.factories.ServiceManager;

import java.util.List;

public interface OrderService {
        Document getOrderById(Long id);
        ServiceManager GetServiceManagerByDocument(int id);
        List<Document> getOrderByManager(Manager manager);
}
