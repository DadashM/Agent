
import java.util.Comparator;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class AddToTable {

    boolean isAddressSpecified = false;
    boolean isHostnameSpecified = false;
    DefaultTableModel defaultTableModel;

    public void addRecord(Gui gui) {
        if (gui.firstOctet.getText().isEmpty() || gui.secondOctet.getText().isEmpty() || gui.thirdOctet.getText().isEmpty() || gui.fourthOctet.getText().isEmpty()) {
            isAddressSpecified = false;
        } else {
            isAddressSpecified = true;
        }

        if (!gui.hostNameTextField.getForeground().toString().endsWith("b=128]") && !gui.hostNameTextField.getText().isEmpty()) {
            isHostnameSpecified = true;
        } else {
            isHostnameSpecified = false;
        }

        if (isAddressSpecified && isHostnameSpecified) {
            gui.ip = gui.firstOctet.getText() + "." + gui.secondOctet.getText() + "." + gui.thirdOctet.getText() + "." + gui.fourthOctet.getText();
            checkTableForDublicate(gui);
        } else {
            JOptionPane.showMessageDialog(gui, "IP address or Hostname isn't specified", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void checkTableForDublicate(Gui gui) {
        defaultTableModel = (DefaultTableModel) gui.tableOfHosts.getModel();

        for (int i = 0; i < defaultTableModel.getRowCount(); i++) {

            if (defaultTableModel.getValueAt(i, 0).equals(gui.ip)) {
                JOptionPane.showMessageDialog(gui, "Host exist", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        defaultTableModel.addRow(new Object[]{gui.ip, gui.hostNameTextField.getText(), gui.descriptionTextField.getForeground().toString().endsWith("b=128]") ? "" : gui.descriptionTextField.getText()});

        System.out.println("for start -----------------");
        for (int i = 1; i <= defaultTableModel.getRowCount(); i++) {
            System.out.println("i = " + i);
            System.out.println("rowcount = " + gui.tableOfHosts.getRowCount());
            System.out.println("Gui.ip: " + Gui.ip);
            if (defaultTableModel.getValueAt(i - 1, 0).equals(gui.ip)) {
                Gui.currentRowNumber = i - 1;
            }
        }
        System.out.println("for end -----------------");

        clearFields(gui.firstOctet, gui.secondOctet, gui.thirdOctet, gui.fourthOctet, gui.hostNameTextField, gui.descriptionTextField);
    }

    public void deleteRecord(Gui gui) {
        defaultTableModel = (DefaultTableModel) gui.tableOfHosts.getModel();
        if (defaultTableModel.getRowCount() != 0) {
            if (gui.tableOfHosts.getSelectedRow() != -1) {
                defaultTableModel.removeRow(gui.tableOfHosts.getSelectedRow());
            }
        }
    }

    public void clearFields(JTextField first, JTextField second, JTextField third, JTextField fourth, JTextField hostName, JTextField description) {
        first.setText("");
        second.setText("");
        third.setText("");
        fourth.setText("");
        hostName.setText("");
        description.setText("");
    }

}
