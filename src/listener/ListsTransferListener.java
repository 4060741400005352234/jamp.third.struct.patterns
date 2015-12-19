package listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListsTransferListener implements ActionListener {

    private JList<String> fromList;
    private JList<String> toList;

    public ListsTransferListener(JList<String> from, JList<String> to) {
        fromList = from;
        toList = to;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        transferValue(fromList, toList);
    }

    private void transferValue(JList<String> fromList, JList<String> toList) {
        String value = fromList.getSelectedValue();
        if (value == null) {
            return;
        }
        DefaultListModel<String> fromListModel = (DefaultListModel<String>) fromList.getModel();
        DefaultListModel<String> toListModel = (DefaultListModel<String>) toList.getModel();
        boolean removed = fromListModel.removeElement(value);
        if (removed) {
            toListModel.addElement(value);
        } else {
            throw new RuntimeException("Can't remove element from list.");
        }
    }
}
