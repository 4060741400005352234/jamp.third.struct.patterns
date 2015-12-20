package decorator;

import javax.swing.*;
import java.awt.event.MouseAdapter;

public abstract class ButtonDecorator extends JButton {

    public ButtonDecorator(String text) {
        super(text);
    }

    protected void addMouseAdapter(MouseAdapter adapter) {
        addMouseListener(adapter);
    }

}
