package adapter;

import javax.swing.*;

public class ListToComboBoxAdapter<T> extends JList<T> {

    private JComboBox<T> comboBox;

    public ListToComboBoxAdapter(JComboBox<T> comboBox) {
        this.comboBox = comboBox;
    }

    @Override
    public ListModel<T> getModel() {
        DefaultListModel<T> listModel = new ComboBoxModelAdapter<T>(comboBox);
        return listModel;
    }

    @Override
    public T getSelectedValue() {
        return (T) comboBox.getSelectedItem();
    }

    private class ComboBoxModelAdapter<E> extends DefaultListModel<E> {

        private JComboBox<E> comboBox;

        public ComboBoxModelAdapter(JComboBox<E> comboBox) {
            this.comboBox = comboBox;
        }

        @Override
        public void addElement(E element) {
            comboBox.addItem(element);
        }

        @Override
        public boolean removeElement(Object obj) {
            comboBox.removeItem(obj);
            return true;
        }
    }
}
