import javax.swing.*;   
import java.io.File;

public class gameDialog {
	
	  public static void main(String[] args){
	  
	    //A QUESTION WITH A TEXT FIELD
	    String numberOfPlayers = JOptionPane.showInputDialog("How many participants?");
	    int numPlayers = Integer.parseInt(numberOfPlayers);
	    System.out.println("Input: " + numberOfPlayers);
	    
	    // A MESSAGE TO THE USER
	    JOptionPane.showMessageDialog(null, "Your Average is " + 91 + "!");

	    //A YES/NO/CANCEL OPTION
	    int option =JOptionPane.showConfirmDialog(null, "Continue");
	    
	    System.out.println("Option: " + option);
	    
	    //A SELECTION BOX WITH AS MANY OPTIONS AS YOU LIKE
	    //Object[] options = { "APPLE", "ORANGE", "BANANA", "CARROT" };
	    //int selection = JOptionPane.showOptionDialog(null, "Choose your favourite fruit!", "FRUIT CHOOSER",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
	    //System.out.println("Selection: " + selection);

	  
	  }

}
