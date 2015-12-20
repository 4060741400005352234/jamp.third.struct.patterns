package decorator.impl;

import javax.swing.*;
import java.awt.*;

public class BorderDecorator extends JComponent {

    private final JComponent component;

    public BorderDecorator(JComponent component) {
        this.component = component;
        this.setLayout(new BorderLayout());
        this.add(component);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int height = this.getHeight();
        int width = this.getWidth();
        g.drawRect(0, 0, width - 1, height - 8);
    }
}
