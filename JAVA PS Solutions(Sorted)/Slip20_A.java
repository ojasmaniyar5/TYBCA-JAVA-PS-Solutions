import java.awt.*;

public class Slip20_A {
    public static void main(String[] args) {
        Frame f = new Frame("TYBBACA");
        f.setSize(300, 200);
        f.setBackground(Color.RED);
        f.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent we) {
                f.dispose();
            }
        });
        f.setVisible(true);
    }
}
