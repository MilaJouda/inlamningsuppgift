import java.util.Scanner;

public class UppgiftMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Uppgift uppgift = new Uppgift();
        String input;

        System.out.println("Skriv in en rad text eller 'stop' för att avsluta");

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            uppgift.addLine(input);
        }

        System.out.println("Antal tecken  :" + uppgift.getTotalCharacters());
        System.out.println("Antal rader :" + uppgift.getTotalLines());

        scanner.close();
    }
}




        /*System.out.println("Skriv in antal rad test eller 'stop' för att avsluta:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            totalCharacters += input.length();
            totalLines++;
            String[] words = input.split(" ");
            uppgift.addLine(input);

        }
        System.out.println(" Antal tecken :" + totalCharacters);
        System.out.println("Antal rader :" + totalLines);

        System.out.println("Antal ord :" + totalWords);
        scanner.close();

    }
}*/