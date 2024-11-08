package net.nielsbruinsma.menu;

public class SelectionChoice {
    private int order;
    private String name;

    public SelectionChoice(int order, String name) {
        if (order < 1) {
            throw new IllegalArgumentException("Order smaller than 1 is invalid. Order " + order +
                    " was passed in the constructor.");
        }
        this.order = order;
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
