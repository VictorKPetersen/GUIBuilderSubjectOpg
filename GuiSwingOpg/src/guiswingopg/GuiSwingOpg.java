package guiswingopg;

import javax.swing.JFrame;


public class GuiSwingOpg {


    public static void main(String[] args) {
        JFrame gui = new MainWindow(); //Creates a new MainWindow which inherits from JFrame
        
        gui.setSize(700, 700); //Sets the size of the window
        
        gui.setVisible(true); //Displays the window
    }  
}
