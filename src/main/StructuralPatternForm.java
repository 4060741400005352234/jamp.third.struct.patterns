package main;

import adapter.ListToComboBoxAdapter;
import listener.ListsTransferListener;

import javax.swing.*;

public class StructuralPatternForm extends JFrame {

    private JTabbedPane tabbedPane;
    private JPanel panel;
    private JList<String> left;
    private DefaultListModel<String> leftListModel;
    private JButton transferRight;
    private JButton transferLeft;
    private JComboBox<String> comboBox1;
    private ListToComboBoxAdapter<String> listToComboBoxAdapter = new ListToComboBoxAdapter<String>(comboBox1);

    public StructuralPatternForm() {
        setContentPane(panel);

        initLeftListModel();
        left.setModel(leftListModel);
        left.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        transferRight.addActionListener(new ListsTransferListener(left, listToComboBoxAdapter));
        transferLeft.addActionListener(new ListsTransferListener(listToComboBoxAdapter, left));

        pack();
    }

    private void initLeftListModel() {
        leftListModel = new DefaultListModel<String>();
        leftListModel.addElement("One");
        leftListModel.addElement("Two");
        leftListModel.addElement("Three");
        leftListModel.addElement("Four");
    }
}
