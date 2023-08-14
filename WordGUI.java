import javax.swing.*;
import java.awt.*;
import java.util.*;

public class WordGUI{
	public static StringTokenizer myTokens; //declare a string tokenizer to use to separate words
	static JFrame myFrame;
	static Container cPane; //declare container which belongs to myFrame JFrame
	static TextArea aBox, bBox, cBox, dBox, eBox, fBox, gBox, hBox, iBox, jBox, kBox, lBox, mBox, nBox, oBox, pBox, qBox, rBox, sBox, tBox, uBox, vBox, wBox, xBox, yBox, otherBox; //declare 6 text areas for receiving different words

	public WordGUI(String chosenFile) { //create constructor WordGUI that will display the file chosen by user
		initialize(); 
		readWordsFromFile(chosenFile); //read words from the file user chose
	}
	
	public WordGUI(String wordle, int placeholder) { //constructor created for users word to be added into the gui
		addWord(wordle); 
	}
	
	public static void initialize() { //GUI constructed from a JFrame 
		aBox=new TextArea(); //create new text areas for the different words
		bBox=new TextArea();
		cBox=new TextArea();
		dBox=new TextArea();
		eBox=new TextArea();
		fBox=new TextArea();
		gBox=new TextArea();
		hBox=new TextArea();
		iBox=new TextArea();
		jBox=new TextArea();
		kBox=new TextArea();
		lBox=new TextArea();
		mBox=new TextArea();
		nBox=new TextArea();
		oBox=new TextArea();
		pBox=new TextArea();
		qBox=new TextArea();
		rBox=new TextArea();
		sBox=new TextArea();
		tBox=new TextArea();
		uBox=new TextArea();
		vBox=new TextArea();
		wBox=new TextArea();
		xBox=new TextArea();
		yBox=new TextArea();
		otherBox=new TextArea();
		myFrame=new JFrame();
		myFrame.setSize(400, 400); //set frame size so all boxes fit in it
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame will be exited
		myFrame.setVisible(true);
	}
	
	static TreeMap<Word, Word>treeMap = new TreeMap<Word, Word>(new WordComparator()); //instanciate treemap (to help sort the words alphabetically using Words as keys) with comparator to tell the Treemap how the keys are ordered
	
	public static void addWord(String WordGiven) { //function to add a word to the gui
		try {
			Word a=new Word(WordGiven); //instanciate a new word from that users word
			treeMap.put(a, null); //put that word into the tree
		}
		catch (IllegalWordException e) { 
			System.out.println(e.getMessage()); //catch the exception and tell user its invalid
		}   
		
		aBox.setText(""); //sets the box to be blank again so words in treemap arent printed twice
		bBox.setText("");
		cBox.setText("");
		dBox.setText("");
		eBox.setText("");
		fBox.setText("");
		gBox.setText("");
		hBox.setText("");
		iBox.setText("");
		jBox.setText("");
		kBox.setText("");
		lBox.setText("");
		mBox.setText("");
		nBox.setText("");
		oBox.setText("");
		pBox.setText("");
		qBox.setText("");
		rBox.setText("");
		sBox.setText("");
		tBox.setText("");
		uBox.setText("");
		vBox.setText("");
		wBox.setText("");
		xBox.setText("");
		yBox.setText("");
		otherBox.setText("");
		
		Set set = treeMap.entrySet(); //returns a collection of key/value pairs
		Iterator i = set.iterator(); //create iterator to help print the map iteratively
		Map.Entry<Word, Word> me; //creates key/value pair
		while (i.hasNext()) { //loop until nothing after iterator
			me = (Map.Entry) i.next(); //cast element after iterator as a map entry
			String WordGiven1=me.getKey().toString(); //get the key/word of that iterator map entry and convert it to a string so it can be read
		    if (WordGiven1.charAt(0)=='a' || WordGiven1.charAt(0)=='A') aBox.append(WordGiven1+"\n"); //if that words first letter is an A or a append it to aBox area
			else if (WordGiven1.charAt(0)=='b' || WordGiven1.charAt(0)=='B') bBox.append(WordGiven1+"\n"); //if that words first letter is an E or e append it to eBox area
			else if (WordGiven1.charAt(0)=='c' || WordGiven1.charAt(0)=='C') cBox.append(WordGiven1+"\n"); //if that words first letter is an I or i append it to iBox area
			else if (WordGiven1.charAt(0)=='d' || WordGiven1.charAt(0)=='D') dBox.append(WordGiven1+"\n"); //if that words first letter is an O or o append it to oBox area
			else if (WordGiven1.charAt(0)=='e' || WordGiven1.charAt(0)=='E') eBox.append(WordGiven1+"\n"); //if that words first letter is an U or u append it to uBox area
		    else if (WordGiven1.charAt(0)=='f' || WordGiven1.charAt(0)=='F') fBox.append(WordGiven1+"\n"); //if that words first letter is an E or e append it to eBox area
			else if (WordGiven1.charAt(0)=='g' || WordGiven1.charAt(0)=='G') gBox.append(WordGiven1+"\n"); //if that words first letter is an E or e append it to eBox area
			else if (WordGiven1.charAt(0)=='h' || WordGiven1.charAt(0)=='H') hBox.append(WordGiven1+"\n"); //if that words first letter is an I or i append it to iBox area
			else if (WordGiven1.charAt(0)=='i' || WordGiven1.charAt(0)=='I') iBox.append(WordGiven1+"\n"); //if that words first letter is an O or o append it to oBox area
			else if (WordGiven1.charAt(0)=='j' || WordGiven1.charAt(0)=='J') jBox.append(WordGiven1+"\n"); //if that words first letter is an U or u append it to uBox area
			else if (WordGiven1.charAt(0)=='k' || WordGiven1.charAt(0)=='K') kBox.append(WordGiven1+"\n"); //if that words first letter is an E or e append it to eBox area
			else if (WordGiven1.charAt(0)=='l' || WordGiven1.charAt(0)=='L') lBox.append(WordGiven1+"\n"); //if that words first letter is an I or i append it to iBox area
			else if (WordGiven1.charAt(0)=='m' || WordGiven1.charAt(0)=='M') mBox.append(WordGiven1+"\n"); //if that words first letter is an O or o append it to oBox area
			else if (WordGiven1.charAt(0)=='n' || WordGiven1.charAt(0)=='N') nBox.append(WordGiven1+"\n"); //if that words first letter is an U or u append it to uBox area
		    else if (WordGiven1.charAt(0)=='o' || WordGiven1.charAt(0)=='O') oBox.append(WordGiven1+"\n"); //if that words first letter is an O or o append it to oBox area
		    else if (WordGiven1.charAt(0)=='p' || WordGiven1.charAt(0)=='P') pBox.append(WordGiven1+"\n"); //if that words first letter is an U or u append it to uBox area
			else if (WordGiven1.charAt(0)=='q' || WordGiven1.charAt(0)=='Q') qBox.append(WordGiven1+"\n"); //if that words first letter is an E or e append it to eBox area
			else if (WordGiven1.charAt(0)=='r' || WordGiven1.charAt(0)=='R') rBox.append(WordGiven1+"\n"); //if that words first letter is an I or i append it to iBox area
			else if (WordGiven1.charAt(0)=='s' || WordGiven1.charAt(0)=='S') sBox.append(WordGiven1+"\n"); //if that words first letter is an O or o append it to oBox area
			else if (WordGiven1.charAt(0)=='t' || WordGiven1.charAt(0)=='T') tBox.append(WordGiven1+"\n"); //if that words first letter is an U or u append it to uBox area
			else if (WordGiven1.charAt(0)=='u' || WordGiven1.charAt(0)=='U') uBox.append(WordGiven1+"\n"); //if that words first letter is an E or e append it to eBox area
			else if (WordGiven1.charAt(0)=='v' || WordGiven1.charAt(0)=='V') vBox.append(WordGiven1+"\n"); //if that words first letter is an I or i append it to iBox area
			else if (WordGiven1.charAt(0)=='w' || WordGiven1.charAt(0)=='W') wBox.append(WordGiven1+"\n"); //if that words first letter is an O or o append it to oBox area
			else if (WordGiven1.charAt(0)=='x' || WordGiven1.charAt(0)=='X') xBox.append(WordGiven1+"\n"); //if that words first letter is an U or u append it to uBox area
			else if (WordGiven1.charAt(0)=='y' || WordGiven1.charAt(0)=='Y') yBox.append(WordGiven1+"\n"); //if that words first letter is an E or e append it to eBox area
			else otherBox.append(WordGiven1+"\n");  //if that words first letter isn't an capital or lowercase a,e,i,o, or u append it to otherBox area
		}
		myFrame.setVisible(true); //JFrame made visible since the JFrame was invisible when initialized
	}
	
	public static void readWordsFromFile(String chosenFile) { //read numbers line by line from  user chosen file
		myFrame.setLayout(new GridLayout(2,3)); //divide myFrame into 2 rows and 3 columns so each word can go into its correct box
		cPane = myFrame.getContentPane(); 
		cPane.add(aBox); //adds the aBox text area to the top left content pane of the JFrame, where words starting with a or A will be placed
		cPane.add(bBox);
		cPane.add(cBox);
		cPane.add(dBox);
		cPane.add(eBox); //adds the eBox text area to the next content pane of the JFrame(top middle box), where words starting with e or E will be placed
		cPane.add(fBox);
		cPane.add(gBox);
		cPane.add(hBox);
		cPane.add(iBox); //adds the iBox text area to the content pane of the JFrame(top right box), where words starting with i or I will be placed
		cPane.add(jBox);
		cPane.add(kBox);
		cPane.add(lBox);
		cPane.add(mBox);
		cPane.add(nBox);
		cPane.add(oBox); //adds the oBox text area to the content pane of the JFrame(bottom left box), where words starting with o or O will be placed
		cPane.add(pBox);
		cPane.add(qBox);
		cPane.add(rBox);
		cPane.add(sBox);
		cPane.add(tBox);
		cPane.add(uBox); //adds the uBox text area to the content pane of the JFrame(bottom middle box), where words starting with u or U will be placed
		cPane.add(vBox);
		cPane.add(wBox);
		cPane.add(xBox);
		cPane.add(yBox);
		cPane.add(otherBox); //adds the otherBox text area to the content pane of the JFrame(bottom right box, where the line starting with anything other than a,e,i,o,u will be placed
		TextFileInput in=new TextFileInput(chosenFile);
		String line=in.readLine(); //read in first line of user chosen file
		while(line!=null) { //loop until file has no more lines
			myTokens=new StringTokenizer(line," ,."); //create a string tokenizer to separate out the words on a line
			while (myTokens.hasMoreTokens()) { //loop until no more tokens on that line
				addWord(myTokens.nextToken()); //reference add word function to make them words and add these separated words, if they are valid, to the cells of GUI
			}
			line=in.readLine(); //continue to read the next line 
		}
	}
}
