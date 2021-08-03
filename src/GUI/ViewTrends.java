package GUI;

import javax.swing.*;
import java.awt.*;

public class ViewTrends extends JFrame {

    public ViewTrends() {
        //

        this.setTitle("Health Beat"); //sets title / window name/ frame name
        this.setVisible(true); //makes "frame" visible
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when hiting the exit button close windows
        this.setResizable(false);
        this.setSize(500,700);

        ImageIcon frameImage = new ImageIcon( Main.class.getResource("FrameImage.png"));
        this.setIconImage(frameImage.getImage()); //this changes the Icon of the frame
    }
}
