package decorator.main;

import decorator.impl.BlueButtonDecorator;
import decorator.impl.PinkButtonDecorator;
import decorator.impl.RedButtonDecorator;

import javax.swing.*;
import java.awt.*;

public class DecoratorFrame extends JFrame {

    public DecoratorFrame() {
        JPanel buttonPanel = new JPanel();
        setLayout(new GridLayout(1, 3));
        JButton red = new RedButtonDecorator("Red highlighted");
        buttonPanel.add(red);
        JButton blue = new BlueButtonDecorator("Blue highlighted");
        buttonPanel.add(blue);
        JButton pink = new PinkButtonDecorator("Pink highlighted");
        buttonPanel.add(pink);

        add(buttonPanel);

        this.setVisible(true);
        this.setSize(500, 100);
        this.setLocationRelativeTo(null);
    }

}
