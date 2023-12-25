package taskOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Inventory {

    private ArrayList<String> allInventory = new ArrayList<>();

    public Inventory() {
    }

    public void addToInventory(String nameOfProduct){
        allInventory.add(nameOfProduct);
    }

    public void deleteFromInventory(String nameOfProduct){
        allInventory.remove(nameOfProduct);
    }

    public boolean checkProductInInventory(String nameOfProduct){
        return allInventory.contains(nameOfProduct);
    }

    public ArrayList<String> getAllInventory() {
        return allInventory;
    }
}
