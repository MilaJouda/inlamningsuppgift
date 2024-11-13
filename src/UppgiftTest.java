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
        uppgift.addLine("Hello");
        assertEquals(5, uppgift.getTotalCharacters());
        assertEquals(2, uppgift.getTotalLines());

    }
}







   // @Test
   // public void testAddCountShortLines() {
      // Uppgift uppgift = new Uppgift();
       // uppgift.addLine("Hej");
       // uppgift.addLine("på");
      //  uppgift.addLine("Dig");
       // assertEquals(8, uppgift.getTotalCharacters());
       // assertEquals(3, uppgift.getTotalLines());
  //  }

//}
