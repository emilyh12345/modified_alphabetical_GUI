# Alphabetical GUI Organizer | “OOP in Java” course project (Spring 2022) - modified:

This project was developed in 5 stages starting in Spring 2022 as part of an Object Oriented Programming course project but was modified in Summer 2023. The final project can be found here.

The goal of this project is to allow a user to choose any file and organize words from the file alphabetically in a GUI (Graphical User Interface). 

## GUIs
### 1 | Sample GUI
----------
The program creates a Sample GUI (that extends JFrame) with a File Menu which is displayed to the user : 
- User has 2 JMenu item options: 1) File or 2) Edit

<p><img style="margin-left: 20px;" width="510" alt="Screen Shot 2023-08-14 at 11 19 11 PM" src="https://github.com/emilyh12345/modified_alphabetical_GUI/assets/101225468/7d514dab-e5d0-41b6-b58a-9ffda28a88a0"></p>

<ul style="list-style-type: none; padding-left: 0;">
   <li style="margin-left: 20px;">1) File - 2 options:
       <ul style="list-style-type: none; padding-left: 0;">
           <li>a. Open (user can choose any file to be read and displayed in the proper cells of the grid layout in the *Word GUI) or</li>
           <li>b. Quit (exits program)</li>
       </ul>
   </li>
</ul>

<p><img style="margin-left: 20px;" width="507" alt="Screen Shot 2023-08-14 at 11 21 33 PM" src="https://github.com/emilyh12345/modified_alphabetical_GUI/assets/101225468/8fcfd8b0-d8b9-439d-974d-b12d041b4d41"></p>

<ul style="list-style-type: none; padding-left: 0;">
   <li style="margin-left: 20px;">2) Edit - option to “Add Word”:
       <ul style="list-style-type: none; padding-left: 0;">
           <li>user is then prompted to “Enter another word: ”</li>
           <li>**if valid, word will be added into the alphabetized *Word GUI</li>
       </ul>
   </li>
</ul>

<p><img style="margin-left: 20px;" width="506" alt="Screen Shot 2023-08-14 at 11 22 56 PM" src="https://github.com/emilyh12345/modified_alphabetical_GUI/assets/101225468/80dc7096-6508-47e6-9e63-a7bcebc246b3"></p>

<p><img style="margin-left: 20px;" width="395" alt="Screen Shot 2023-08-14 at 11 23 20 PM" src="https://github.com/emilyh12345/modified_alphabetical_GUI/assets/101225468/e4950a26-6766-4f10-9b26-1057bb2b440f"></p>


### 2 | *Word GUI
The program also creates a Word GUI that will display words from file chosen by user in alphabetical grids
- Uses a TreeMap to sort the words alphabetically using comparator (instantiated as TreeMap<Word><Word>) 
    - Keys: words
    - Values: null
- as the words are read from the file, they are displayed in the GUI as follows:  
    - The GUI has a grid layout of 2 rows and 13 columns
    - all words that start with an ‘A’ or ‘a’ should be displayed in row 1, column 1. All words that start with a ‘B’ or ‘b’ should be displayed in row 1, column 2, etc. Starting with ‘N’ or ‘n’ in row 2 column 1, with ‘O’ or ’o’ in row 1 column 2.
    - Example Word GUI which sorted a file of book authors alphabetically:
 
>NOTE:
>- **the constructor of the Word class checks that the word is valid (has only letters) and throws an IllegalWordException if it is not
>    - Invalid words are displayed to user
>- input files can contain any symbols, and any number of words and spaces on each line because a string tokenizer separates the different words in the chosen file


