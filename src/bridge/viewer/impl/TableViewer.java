package bridge.viewer.impl;

import bridge.viewer.ListViewer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.List;

public class TableViewer<T> implements ListViewer<T> {

    private JTable table;

    public TableViewer(JTable table) {
        this.table = table;
    }

    @Override
    public void view(List<T> list) {
        Object[][] tableData = new Object[list.size()][];
        Object[] tableColumn = {"Values"};
        for (int i = 0; i < list.size(); ++i) {
            tableData[i] = new Object[] {list.get(i)};
        }
        TableModel tableModel = new DefaultTableModel(tableData, tableColumn);
        table.setModel(tableModel);
    }
}
