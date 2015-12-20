package decorator.impl;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class BorderDecorator extends JComponent {

    public BorderDecorator(JComponent component) {
        this.setLayout(new BorderLayout());
        EmptyBorder ep = new EmptyBorder(4,4,4,4);
        LineBorder lb = new LineBorder(Color.black, 2);
        component.setBorder(new CompoundBorder(lb, ep));
        this.add(component);
    }
}
