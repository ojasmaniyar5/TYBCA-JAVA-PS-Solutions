import java.awt.*;
import javax.swing.*;

public class Slip14_B {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField eno = new JTextField(5), ename = new JTextField(10), sal = new JTextField(7);
        JButton submit = new JButton("Submit");
        
        submit.addActionListener(e -> {
            JFrame nextFrame = new JFrame("Employee Details");
            JTextArea details = new JTextArea("Eno: " + eno.getText() + "\nEName: " + ename.getText() + "\nSalary: " + sal.getText());
            nextFrame.add(details);
            nextFrame.setSize(200, 200);
            nextFrame.setVisible(true);
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Eno:"));
        frame.add(eno);
        frame.add(new JLabel("EName:"));
        frame.add(ename);
        frame.add(new JLabel("Salary:"));
        frame.add(sal);
        frame.add(submit);
        frame.setSize(300, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
