package decorator.impl;

import decorator.ColorDecorator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RedColorDecorator extends ColorDecorator {

    public RedColorDecorator(JComponent component) {
        super(component);
        decoratedComponent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setColor(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setColor(null);
            }
        });
    }

    @Override
    protected void setColor(Color color) {
        decoratedComponent.setBackground(color);
    }
}
