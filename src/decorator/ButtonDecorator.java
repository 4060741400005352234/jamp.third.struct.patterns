package decorator;

import javax.swing.*;
import java.awt.event.MouseAdapter;

public abstract class ButtonDecorator extends JButton {

    protected JButton decoratedButton;

    public ButtonDecorator(JButton button) {
        super(button.getText());
        decoratedButton = button;
    }

    protected void addMouseAdapter(MouseAdapter adapter) {
        addMouseListener(adapter);
    }

}
