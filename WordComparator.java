import java.util.Comparator;

public class WordComparator implements Comparator<Word> { //create a word comparator to compare words
    public int compare(Word word1, Word word2) {
    	String stringWord1= word1.toString();
    	String stringWord2= word2.toString();
    	return stringWord1.compareToIgnoreCase(stringWord2); 
    }
}