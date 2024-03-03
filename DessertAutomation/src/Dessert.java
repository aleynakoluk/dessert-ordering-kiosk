import java.io.Serializable;
public class Dessert implements Serializable{ 
   private String dessertName;
   private double dessertCost;

    public Dessert() {
    }

    public Dessert(String dessertName, double dessertCost) {
        this.dessertName = dessertName;
        this.dessertCost = dessertCost;
    }

     public boolean equals(Dessert dessert){
        return (this.dessertCost == dessert.dessertCost && 
                this.dessertName.equals(dessert.dessertName));
    }
    public String getDessertName() {
        return dessertName;
    }

    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    public double getDessertCost() {
        return dessertCost;
    }

    public void setDessertCost(double dessertCost) {
        this.dessertCost = dessertCost;
    }
    
}