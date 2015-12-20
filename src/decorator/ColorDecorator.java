package decorator;

import javax.swing.*;
import java.awt.*;

public abstract class ColorDecorator extends JComponent {

    protected JComponent decoratedComponent;

    public ColorDecorator(JComponent component) {
        this.decoratedComponent = component;
        this.setLayout(new BorderLayout());
        this.add(component);
    }

    protected abstract void setColor(Color color);
}
