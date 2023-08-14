import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditMenuHandler implements ActionListener {
	JFrame jframe;
	String wordle;
	public EditMenuHandler (JFrame jf) {
		jframe = jf;
	}
	public void actionPerformed(ActionEvent event) {
		String menuName=event.getActionCommand();
		if (menuName.equals("Add Word")) { //clicking on add word jmenu item will ask user for a word to be added to the file
			wordle=JOptionPane.showInputDialog(null,"Enter another word: ");
			new WordGUI(wordle, 0); //users word will be put into the wordGUI
		}
	}
}
