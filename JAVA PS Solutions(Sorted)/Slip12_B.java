import java.util.*;
import javax.swing.*;

public class Slip12_B {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField input = new JTextField(5);
        JButton button = new JButton("Show Table");
        JList<String> list = new JList<>();
        button.addActionListener(e -> {
            int n = Integer.parseInt(input.getText());
            List<String> data = new ArrayList<>();
            for (int i = 1; i <= 10; i++) 
                data.add(n + " x " + i + " = " + (n * i));
            list.setListData(data.toArray(new String[0]));
        });
        
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(input);
        frame.add(button);
        frame.add(new JScrollPane(list));
        frame.setSize(200, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}