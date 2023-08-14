import javax.swing.*;
public class SampleGUI extends JFrame {
    
   public SampleGUI(String title, int height, int width) { //creates a sample gui that will be used to display options open and quit
	   setTitle("Sample GUI");
	   setSize(height,width);
	   setLocation  (400,200);
	   createFileMenu();
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
   }
   private void createFileMenu( ) { //creates a file menu for the sample gui
	   JMenuItem   item;
       JMenuBar    menuBar  = new JMenuBar();
       JMenu       fileMenu = new JMenu("File"); //adds a jmenu to the jmenu bar called file
       JMenu editMenu = new JMenu("Edit"); //adds a jmenu to the jmenu bar called edit
       FileMenuHandler fmh  = new FileMenuHandler(this); //instanciates a file menu handler used to handle the file menu  
       EditMenuHandler emh  = new EditMenuHandler(this); //edit menu handler created to handle the edit menu
  
       item = new JMenuItem("Open"); //creates menu item open
       item.addActionListener( fmh );
       fileMenu.add( item );

       fileMenu.addSeparator(); //add a horizontal separator line between open and quit
    
       item = new JMenuItem("Quit"); //creates menu item quit
       item.addActionListener( fmh );
       fileMenu.add( item );

       	item = new JMenuItem("Add Word");       //creates jmenu item "add word" for the edit menu
	    item.addActionListener(emh);
	    editMenu.add(item);
	      
	    setJMenuBar(menuBar);
	    menuBar.add(fileMenu); //add the file menu to to the menu bar created
   		menuBar.add(editMenu);
   }
}

