public class Uppgift {

    private int totalCharacters = 0;
    private int totalLines = 0;

    public Uppgift() {
       // totalCharacters = 0;
        //totalLines = 0;
    }

    public void addLine(String line) {
        totalCharacters += line.length();
        totalLines++;
        //System.out.println("Tecken hittills:" + totalCharacters + ",Rader hittills:" +totalLines);
    }

    // Getter metod
    public int getTotalCharacters() {
        return totalCharacters;
    }

    //public void setTotalCharacters(int characters) {
    //if (characters >= 0) {
    //this.totalCharacters = characters;
    //}

    public int getTotalLines() {
        return totalLines;
    }

    //public void setTotalLines(int lines) {
    // if (lines >= 0) {
    // this.totalLines = lines;
    // }
}














