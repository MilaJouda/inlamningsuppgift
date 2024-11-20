import org.junit.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class UppgiftTest {

    @Test
    public void testAddLineCountCharacters() {
        Uppgift uppgift = new Uppgift();
        uppgift.addLine("Hello World");
        assertEquals(11, uppgift.getTotalCharacters());
    }

    @Test
    public void testAddLineCountLines() {
        Uppgift uppgift = new Uppgift();
        uppgift.addLine("Hello");
        uppgift.addLine("World");
        assertEquals(2, uppgift.getTotalLines());
    }

    @Test
    public void testAddEmptyLine() {
        Uppgift uppgift = new Uppgift();
        uppgift.addLine("");
        assertEquals(0, uppgift.getTotalCharacters());
        assertEquals(1, uppgift.getTotalLines());
    }

    @Test
    public void testAddLineCountWords() {
        Uppgift uppgift = new Uppgift();
        uppgift.addLine("Hello Kitty");
        assertEquals(2, uppgift.getTotalWords());
    }

    @Test
    public void testAddLineLongestWord(){
        Uppgift uppgift = new Uppgift();
        uppgift.addLine("Java is a programming language");
        uppgift.addLine("Hello");
        assertEquals(List.of("programming"), uppgift.getLongestWordList());
    }

   @Test
    public void testCheckForStop(){
        Uppgift uppgift = new Uppgift();
        assertTrue(uppgift.checkForStop("stop"));
   }

    @Test
    public void testCheckForNoStop(){
        Uppgift uppgift = new Uppgift();
        assertFalse(uppgift.checkForStop("Hi"));
    }
}