package listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerImpl implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("AA");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("AA");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("AA");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("AA");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("AA");
    }
}
