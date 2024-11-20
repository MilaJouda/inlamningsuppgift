import java.util.ArrayList;
import java.util.Scanner;

public class Uppgift {

    private int totalCharacters = 0;
    private int totalLines = 0;
    private int totalWords = 0;
    private String longestWord = "";
    private final ArrayList<String> longestWordList = new ArrayList<String>();

    public Uppgift() {}

    public void readLines() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Skriv in text eller 'stop' för att avsluta");

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            addLine(line);
        }
        scanner.close();
    }

    public void addLine(String line) {
        if (line.equalsIgnoreCase("stop")) {
            return; // Ignorera "stop"
        }

        totalCharacters += line.length();
        totalLines++;

        String[] words = line.split(" ");
        totalWords += words.length;
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
                // Clear list if word is longer than all words in array
                longestWordList.clear();
                longestWordList.add(word);
            } else if (word.length() == longestWord.length()) {
                longestWordList.add(word);
            }
        }
    }

    // Getter method
    public int getTotalCharacters() {
        return totalCharacters;
    }

    public int getTotalLines() {
        return totalLines;
    }

    public int getTotalWords() {
        return totalWords;
    }

    public ArrayList<String> getLongestWordList() {
        return longestWordList;
    }
}













