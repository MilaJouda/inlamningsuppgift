import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UppgiftTest {

    @Test
    public void testAddLineCountCharacters() {
        Uppgift uppgift = new Uppgift();
        uppgift.addLine("Hello");
        uppgift.addLine("World");
        assertEquals(10, uppgift.getTotalCharacters());
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

}
