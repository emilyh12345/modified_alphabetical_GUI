import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word { //creates Word class
	private String WordGiven;
	public Word (String s) { //creates constructor that checks if the word is all letters
		if (isValid(s)) WordGiven=s;
		else throw new IllegalWordException("Invalid word: " + s); //if the word isnt all letters throws exception 
	}
	public static boolean isValid(String s) { //checks if a word is all letters 
		Pattern p;
		Matcher m;
		String WORD_PATTERN="[a-zA-Z]+"; //pattern is regular expression representing all letters
		p=Pattern.compile(WORD_PATTERN); //changes the regular expression pattern form
		m=p.matcher(s);  //take pattern and used method to match it to the word
		return m.matches(); //if they match returns true
	}
	public void setWord(String s) { 
		WordGiven=s;
	}
	public String getWord() { 
		return WordGiven;
	}
	public boolean equals(Object other) { //compares 2 strings to see if theyre equal
		return  (other!=null && getClass() == other.getClass() && WordGiven.equals(((Word) other).WordGiven));
	}
	public int compareToIgnoreCase(Word other) { //compare function to compare word to another word
		return WordGiven.compareTo(other.toString());
	}
	public String toString() { //toString method to convert given Word into a string
		return WordGiven; 
	}
}