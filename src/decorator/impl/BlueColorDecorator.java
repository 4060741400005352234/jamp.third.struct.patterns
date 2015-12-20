package decorator.impl;

import decorator.ColorDecorator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BlueColorDecorator extends ColorDecorator {

    public BlueColorDecorator(JComponent component) {
        super(component);
        decoratedComponent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setColor(Color.BLUE);
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
