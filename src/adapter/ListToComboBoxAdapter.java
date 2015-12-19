package adapter;

import javax.swing.*;

public class ListToComboBoxAdapter<T> extends JList<T> {

    private JComboBox<T> comboBox;

    public ListToComboBoxAdapter(JComboBox<T> comboBox) {
        this.comboBox = comboBox;
    }

    @Override
    public ListModel<T> getModel() {
        return new ComboBoxModelWrapper<T>(comboBox);
    }

    @Override
    public T getSelectedValue() {
        return (T) comboBox.getSelectedItem();
    }

    private class ComboBoxModelWrapper<T> extends DefaultListModel<T> {

        private JComboBox<T> comboBox;

        public ComboBoxModelWrapper(JComboBox<T> comboBox) {
            this.comboBox = comboBox;
        }

        @Override
        public void addElement(T element) {
            comboBox.addItem(element);
        }

        @Override
        public boolean removeElement(Object obj) {
            int size = comboBox.getItemCount();
            comboBox.removeItem(obj);
            return size > comboBox.getItemCount();
        }
    }
}
