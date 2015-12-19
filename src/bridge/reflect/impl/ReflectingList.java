package bridge.reflect.impl;

import bridge.reflect.Reflecting;
import bridge.viewer.ListViewer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ReflectingList<T> implements Reflecting {

    private ListViewer<T> listViewer;
    private JList<T> list;

    public ReflectingList(ListViewer<T> listViewer, JList<T> list) {
        this.listViewer = listViewer;
        this.list = list;
    }

    @Override
    public void reflect() {
        List<T> listItems = getListItemsAsList();
        listViewer.view(listItems);
    }

    private List<T> getListItemsAsList() {
        List<T> listItems = new ArrayList<T>();
        DefaultListModel<T> listModel = (DefaultListModel<T>) list.getModel();
        for(int i = 0; i < listModel.getSize(); i++){
            listItems.add(listModel.getElementAt(i));
        }
        return listItems;
    }
}
