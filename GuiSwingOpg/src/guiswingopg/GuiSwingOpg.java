package guiswingopg;

import javax.swing.JFrame;


public class GuiSwingOpg {


    public static void main(String[] args) {
        JFrame gui = new MainWindow();
        
        gui.setSize(800, 800);
        
        gui.setVisible(true);
        
        Exchanger calc = new Exchanger();
    }  
}
