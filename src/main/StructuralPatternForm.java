package main;

import adapter.ListToComboBoxAdapter;
import bridge.reflect.impl.ListBridge;
import bridge.viewer.impl.ListBoxViewer;
import bridge.viewer.impl.TableViewer;
import listener.BridgeTransferListener;
import listener.ListsTransferListener;

import javax.swing.*;

public class StructuralPatternForm extends JFrame {

    private JTabbedPane tabbedPane;
    // For adapter
    private JPanel panel;
    private JList<String> left;
    private DefaultListModel<String> listModel;
    private JButton transferRight;
    private JButton transferLeft;
    private JComboBox<String> comboBox;
    // For bridge
    private JButton asListButton;
    private JButton asTableButton;
    private JTable table;
    private JList<String> sourceList;
    private JList<String> list;

    public StructuralPatternForm() {
        setContentPane(panel);
        initLeftListModel();
        this.setLocationRelativeTo(null);
        // For adapter
        left.setModel(listModel);
        left.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListToComboBoxAdapter<String> listToComboBoxAdapter = new ListToComboBoxAdapter<String>(comboBox);
        transferRight.addActionListener(new ListsTransferListener(left, listToComboBoxAdapter));
        transferLeft.addActionListener(new ListsTransferListener(listToComboBoxAdapter, left));
        // For bridge
        sourceList.setModel(listModel);
        list.setModel(new DefaultListModel<String>());
        ListBridge listForListBridge = new ListBridge<String>(new ListBoxViewer<String>(list), sourceList);
        asListButton.addActionListener(new BridgeTransferListener(listForListBridge));
        ListBridge listBridgeForTable = new ListBridge<String>(new TableViewer<String>(table), sourceList);
        asTableButton.addActionListener(new BridgeTransferListener(listBridgeForTable));

        pack();
    }

    private void initLeftListModel() {
        listModel = new DefaultListModel<String>();
        listModel.addElement("One");
        listModel.addElement("Two");
        listModel.addElement("Three");
        listModel.addElement("Four");
    }
}
