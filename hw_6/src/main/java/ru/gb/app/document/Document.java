package ru.gb.app.document;

public interface Document {
    Document copy ();
    void edit();
    void save();
}
