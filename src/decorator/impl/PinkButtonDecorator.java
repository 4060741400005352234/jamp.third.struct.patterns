package decorator.impl;

import decorator.ButtonDecorator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PinkButtonDecorator extends ButtonDecorator {

    public PinkButtonDecorator(JButton button) {
        super(button);
        addMouseAdapter(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(Color.PINK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(null);
            }
        });
    }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
    }
}
