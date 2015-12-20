package decorator.main;

import decorator.impl.BlueColorDecorator;
import decorator.impl.PinkColorDecorator;
import decorator.impl.RedColorDecorator;

import javax.swing.*;
import java.awt.*;

public class DecoratorFrame extends JFrame {

    public DecoratorFrame() {
        JPanel buttonPanel = new JPanel();
        setLayout(new GridLayout(1, 3));

        RedColorDecorator redButton = new RedColorDecorator(new JButton("Red highlighted"));
        buttonPanel.add(redButton);

        BlueColorDecorator blueButton = new BlueColorDecorator(new JButton("Blue highlighted"));
        buttonPanel.add(blueButton);

        PinkColorDecorator pinkButton = new PinkColorDecorator(new JButton("Pink highlighted"));
        buttonPanel.add(pinkButton);

        add(buttonPanel);

        this.setVisible(true);
        this.setSize(500, 100);
        this.setLocationRelativeTo(null);
    }

}
