import java.util.Scanner;

public class UppgiftMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Uppgift uppgift = new Uppgift();
        String input;

       uppgift.readLines();

        System.out.println("Antal tecken (inklusive mellanslag): " + uppgift.getTotalCharacters());
        System.out.println("Antal rader: " + uppgift.getTotalLines());
        System.out.println("Antal ord: " + uppgift.getTotalWords());
        System.out.println("Längsta ordet: " + uppgift.getLongestWordList());
    }
}




