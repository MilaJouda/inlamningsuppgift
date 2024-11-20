import java.util.ArrayList;

public class Uppgift {
    private int totalCharacters = 0;
    private int totalLines = 0;
    private int totalWords = 0;
    private String longestWord = "";
    private final ArrayList<String> longestWordList = new ArrayList<String>();

    public Uppgift() {
    }

    public void readLine(String line) {
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

    public boolean checkForStop(String line) {
        return line.equalsIgnoreCase("stop");
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













