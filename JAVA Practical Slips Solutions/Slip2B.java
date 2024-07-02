import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Slip2B extends JFrame {
    private JTextField textField;
    public Slip2B() {
        textField = new JTextField(20);
        textField.setEditable(false);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField.setText("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);
        setTitle("Mouse Event Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); 
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Slip2B());
    }
}
