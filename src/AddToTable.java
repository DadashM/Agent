
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddToTable {

    boolean isAddressSpecified = false;
    boolean isHostnameSpecified = false;

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
            DefaultTableModel defaultTableModel = (DefaultTableModel) gui.tableOfHosts.getModel();
            defaultTableModel.addRow(new Object[]{gui.ip, gui.hostNameTextField.getText(), gui.descriptionTextField.getForeground().toString().endsWith("b=128]") ? "" : gui.descriptionTextField.getText()});
        } else {
            JOptionPane.showMessageDialog(gui, "IP address or Hostname isn't specified", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

}
