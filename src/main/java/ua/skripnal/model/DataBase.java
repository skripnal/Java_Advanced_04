package ua.skripnal.model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<User> userList;
    private List<Magazine> magazineList;

    private static DataBase insatance = new DataBase();

    private DataBase(){
        magazineList = new ArrayList<>();
        magazineList.add(new Magazine("First magazine", "Description", 10));
        magazineList.add(new Magazine("Second magazine", "Description", 8));
        userList = new ArrayList<>();
        userList.add(new User("admin", "admin", "admin@gmail.com", "admin", "admin"));
    }

    public static DataBase getInstance(){
        return insatance;
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<Magazine> getMagazineList() {
        return magazineList;
    }
}
