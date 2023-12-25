package taskOne;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Inventory inventory = new Inventory();

        Boolean programIsWorking = true;

        while (programIsWorking) {
            System.out.print("1)Add product");
            System.out.println("2)Delete a product");
            System.out.println("3)Check if the product availability");
            System.out.println("4)Exit");
            System.out.println("Put the action - ");
            int action = scanner.nextInt();

            switch (action){
                case 1:
                    System.out.print("\nPut the name product - ");
                    scanner.nextLine();
                    String productToAdd = scanner.nextLine();

                    if(inventory.getAllInventory().contains(productToAdd)){
                        System.out.println("\nThe product is already exists");
                        break;
                    }
                    else{
                        inventory.addToInventory(productToAdd);
                        System.out.println("\nSuccessfully added");
                        break;
                    }
                case 2:
                    System.out.print("\nPut the name of product - ");
                    scanner.nextLine();
                    String productToDelete = scanner.nextLine();

                    if(inventory.getAllInventory().contains(productToDelete)){
                        inventory.deleteFromInventory(productToDelete);
                        System.out.println("\nSuccessfully deleted");
                    }
                    else {
                        System.out.println("\nProduct is not exist");
                    }
                    break;
                case 3:
                    System.out.print("\nPut the name of product - ");
                    scanner.nextLine();
                    String productToCheck = scanner.nextLine();

                    System.out.println("\nResult - " + inventory.checkProductInInventory(productToCheck));
                    break;
                case 4:
                    programIsWorking = false;
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("\nNumber doesnt exist");
            }
        }

    }
}