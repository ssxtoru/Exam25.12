package taskFour;


import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,String> translator = new HashMap<>();
        translator.put("Car", "Машина");
        translator.put("Lake", "Озеро");
        translator.put("Pie", "Пирог");
        translator.put("Love", "Любовь");
        translator.put("Water", "Вода");
        System.out.println("Words: Car, Lake, Pie, Love, Water");
        System.out.println("Type in words in english: ");
            String word = scanner.nextLine();
        if(translator.containsKey(word)){
            System.out.println(translator.get(word));
        }
        else {
            System.out.println("Word doesn't exist");
        }

    }
}
