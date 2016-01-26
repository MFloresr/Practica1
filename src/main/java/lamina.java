import javax.swing.*;
import java.awt.*;

public class lamina extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Me llamo mario",100,100);
    }
}
