package GUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*JFrame frame = new JFrame(); //created your new JFrame

        frame.setTitle("Health Beat"); //sets title / window name/ frame name
        frame.setVisible(true); //makes "frame" visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when hiting the exit button close windows
        frame.setResizable(false);
        frame.setSize(500,700);

        ImageIcon frameImage = new ImageIcon( Main.class.getResource("FrameImage.png"));
        frame.setIconImage(frameImage.getImage()); //this changes the Icon of the frame*/

        Home homescreen = new Home();
    }
}
