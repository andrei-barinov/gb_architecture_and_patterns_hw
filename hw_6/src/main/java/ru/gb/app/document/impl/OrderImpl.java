package ru.gb.app.document.impl;


import ru.gb.app.document.Document;

public class OrderImpl implements Document {
    private int totalCost = 0;
    private boolean isClosed = false;

    @Override
    public Document copy() {
        return new OrderImpl();
    }

    @Override
    public void edit() {
    }

    @Override
    public void save() {
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }

}
