import javax.swing.*;

public class Simple_Window {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World!", SwingConstants.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }
}
