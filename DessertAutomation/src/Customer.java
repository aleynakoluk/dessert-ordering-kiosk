import java.io.*;
class Customer implements Serializable{
    private String name;
    private String surname;
    private Dessert dessert;
    private int staffId; 

    public Customer() {
    }

    public Customer(String name, String surname, Dessert dessert, int staffId) {
        this.name = name;
        this.surname = surname;
        this.dessert = dessert;
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    
    
    
}
