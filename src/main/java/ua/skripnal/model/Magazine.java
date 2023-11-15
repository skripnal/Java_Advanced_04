package ua.skripnal.model;

public class Magazine {
    private static int idCounter = 0;
    private int id;
    private String title;
    private String description;
    private double price;

    public Magazine(String title, String description, double price) {
        this.id = ++idCounter;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
