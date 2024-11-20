import org.junit.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class UppgiftTest {

    @Test
    public void testReadLineCountCharacters() {
        Uppgift uppgift = new Uppgift();
        uppgift.readLine("Hello World");
        assertEquals(11, uppgift.getTotalCharacters());
    }

    @Test
    public void testReadLineCountLines() {
        Uppgift uppgift = new Uppgift();
        uppgift.readLine("Hello");
        uppgift.readLine("World");
        assertEquals(2, uppgift.getTotalLines());
    }

    @Test
    public void testReadEmptyLine() {
        Uppgift uppgift = new Uppgift();
        uppgift.readLine("");
        assertEquals(0, uppgift.getTotalCharacters());
        assertEquals(1, uppgift.getTotalLines());
    }

    @Test
    public void testReadLineCountWords() {
        Uppgift uppgift = new Uppgift();
        uppgift.readLine("Hello Kitty");
        assertEquals(2, uppgift.getTotalWords());
    }

    @Test
    public void testReadLineLongestWord(){
        Uppgift uppgift = new Uppgift();
        uppgift.readLine("Java is a programming language");
        uppgift.readLine("Hello");
        assertTrue(uppgift.getLongestWordList().contains("programming"));
        assertEquals(1, uppgift.getLongestWordList().size());
    }

    @Test
    public void testReadLineLongestWords() {
        Uppgift uppgift = new Uppgift();
        uppgift.readLine("Hello World");
        ArrayList<String> expectedLongestWords = new ArrayList<>();
        expectedLongestWords.add("Hello");
        expectedLongestWords.add("World");
        assertEquals(expectedLongestWords, uppgift.getLongestWordList());
    }

   @Test
    public void testCheckForStopReturnsTrue(){
        Uppgift uppgift = new Uppgift();
        assertTrue(uppgift.checkForStop("stop"));
   }

    @Test
    public void testCheckForStopReturnsFalse(){
        Uppgift uppgift = new Uppgift();
        assertFalse(uppgift.checkForStop("Hello World"));
    }
}