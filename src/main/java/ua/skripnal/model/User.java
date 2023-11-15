package ua.skripnal.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String root;
    private double balance;

    private List<Magazine> userMagazineList;

    public User(String firstName, String lastName, String email, String password, String root) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.root = root;
        this.balance = 100;
        userMagazineList = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Magazine> getUserMagazineList() {
        return userMagazineList;
    }

    public void addMagazineFromUser(Magazine magazine){
        this.userMagazineList.add(magazine);
        balance -= magazine.getPrice();
    }

    public void removeMagazineFromUser(Magazine magazine){
        this.userMagazineList.remove(magazine);
    }

    public String getRoot() {
        return root;
    }
}
