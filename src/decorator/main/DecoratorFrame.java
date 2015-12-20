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

        JButton redButton = new JButton("Red highlighted");
        redButton = new RedButtonDecorator(redButton);
        buttonPanel.add(redButton);

        JButton blueButton = new JButton("Blue highlighted");
        blueButton = new BlueButtonDecorator(blueButton);
        buttonPanel.add(blueButton);

        JButton pinkButton = new JButton("Pink highlighted");
        pinkButton = new PinkButtonDecorator(pinkButton);
        buttonPanel.add(pinkButton);

        add(buttonPanel);

        this.setVisible(true);
        this.setSize(500, 100);
        this.setLocationRelativeTo(null);
    }

}
