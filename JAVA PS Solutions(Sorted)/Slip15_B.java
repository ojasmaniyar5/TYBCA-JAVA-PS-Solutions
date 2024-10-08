import java.applet.Applet;
import java.awt.*;

public class Slip15_B extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 100, 100); // Face
        g.setColor(Color.BLACK);
        g.fillOval(70, 80, 20, 20);   // Left Eye
        g.fillOval(110, 80, 20, 20);  // Right Eye
        g.drawArc(70, 100, 60, 30, 0, -180); // Smile
    }
}
