package ru.gb.app.document.impl;


import ru.gb.app.document.Document;

public class OtherDocumentImpl implements Document {
    @Override
    public Document copy() {
        return new OtherDocumentImpl();
    }

    @Override
    public void edit() {

    }

    @Override
    public void save() {

    }
}
