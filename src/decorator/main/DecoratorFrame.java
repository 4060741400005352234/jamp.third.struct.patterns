package decorator.main;

import decorator.impl.BlueColorDecorator;
import decorator.impl.BorderDecorator;
import decorator.impl.PinkColorDecorator;
import decorator.impl.RedColorDecorator;

import javax.swing.*;
import java.awt.*;

public class DecoratorFrame extends JFrame {

    public DecoratorFrame() {
        JPanel buttonPanel = new JPanel();
        setLayout(new GridLayout(1, 4));

        RedColorDecorator redButton = new RedColorDecorator(new JButton("Red highlighted"));
        buttonPanel.add(redButton);

        BlueColorDecorator blueButton = new BlueColorDecorator(new JButton("Blue highlighted"));
        buttonPanel.add(blueButton);

        PinkColorDecorator pinkButton = new PinkColorDecorator(new JButton("Pink highlighted"));
        buttonPanel.add(pinkButton);

        BorderDecorator borderedRedButton = new BorderDecorator(new RedColorDecorator(new JButton("Another one")));
        buttonPanel.add(borderedRedButton);

        add(buttonPanel);

        this.setVisible(true);
        this.setSize(600, 100);
        this.setLocationRelativeTo(null);
    }

}
