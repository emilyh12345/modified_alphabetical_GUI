import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileMenuHandler implements ActionListener { //creates file menu for GUI
	JFrame jframe;
	public FileMenuHandler (JFrame jf) {
		jframe = jf;
	}
	public void actionPerformed(ActionEvent event) { 
		String  menuName;
		menuName = event.getActionCommand();
		if (menuName.equals("Open")) 
			openFile( ); //calls open file method if user clicks on open menu item 
		else if (menuName.equals("Quit")) 
			System.exit(0); //terminate program if user clicks quit
		}
    private void openFile( ) { //allows user to chose a file to be read
    	JFileChooser chooser;
    	int          status;
    	chooser = new JFileChooser( );
    	status = chooser.showOpenDialog(null);
    	if (status == JFileChooser.APPROVE_OPTION) 
    		readSource(chooser.getSelectedFile());
    	else 
    		JOptionPane.showMessageDialog(null, "Open File dialog canceled"); 
    	} 
    	private void readSource(File chosenFile) { //reads from the file the user chose
    		String chosenFileName = chosenFile.getAbsolutePath();
    		new WordGUI(chosenFileName); //connects/opens the file chosen by the user to the wordGUI where the file is displayed
    	}
}
