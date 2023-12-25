package taskFour;


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
            String word = scanner.nextLine();
        if(translator.containsKey(word)){
            System.out.println(translator.containsValue(word));
        }
        else {
            System.out.println("Word doesn't exist");
        }

    }
}
