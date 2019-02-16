import javax.swing.*;
import java.awt.*;

public class AppletOnWeb extends JApplet {

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Wow this actually worked?", 25, 25);
    }

}
