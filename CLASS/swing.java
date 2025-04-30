
import javax.swing.*;

public class swing {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World");
        JLabel label = new JLabel("Hello, World!", JLabel.CENTER);
        frame.setSize(400, 200);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
