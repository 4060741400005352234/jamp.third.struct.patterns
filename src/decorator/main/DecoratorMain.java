package decorator.main;

import javax.swing.*;
import java.awt.*;

public class DecoratorMain {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new DecoratorFrame();
                frame.setTitle("Structural patterns");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
