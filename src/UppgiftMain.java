import java.util.Scanner;

public class UppgiftMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Uppgift uppgift = new Uppgift();
        String input;

        System.out.println("Skriv in text eller 'stop' för att avsluta");

        while (true) {
            input = scanner.nextLine();
            if (uppgift.checkForStop(input)){
                break;
            }
            uppgift.addLine(input);
        }

        System.out.println("Antal tecken (inklusive mellanslag): " + uppgift.getTotalCharacters());
        System.out.println("Antal rader: " + uppgift.getTotalLines());
        System.out.println("Antal ord: " + uppgift.getTotalWords());
        System.out.println("Längsta ordet: " + uppgift.getLongestWordList());

        scanner.close();
    }
}




