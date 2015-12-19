package bridge.viewer.impl;

import bridge.viewer.ListViewer;

import javax.swing.*;
import java.util.List;

public class ListBoxViewer<T> implements ListViewer<T> {

    private JList<T> listBox;

    public ListBoxViewer(JList<T> listBox) {
        this.listBox = listBox;
    }

    @Override
    public void view(List<T> list) {
        DefaultListModel<T> listModel = (DefaultListModel<T>) listBox.getModel();
        listModel.removeAllElements();
        for (T item : list) {
            listModel.addElement(item);
        }
    }
}
