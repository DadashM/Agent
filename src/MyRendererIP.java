
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MyRendererIP extends DefaultTableCellRenderer {

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        System.out.println("MyRender start --------");
        System.out.println("row: " + row);
        System.out.println("Gui.currentRowNumber: " + Gui.currentRowNumber);
        if (row == Gui.currentRowNumber) {
            System.out.println("inside if");
            System.out.println("Gui.ip: " + Gui.ip);
            setText(Gui.ip);
        }
        System.out.println("MyRender end --------");
        setBackground(new Color(224, 223, 222));
        setHorizontalAlignment(JLabel.CENTER);
        setFont(new Font("Consolas", Font.PLAIN, 14));
        return this;

    }
}

class MyRendererHostname extends DefaultTableCellRenderer {

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setBackground(new Color(224, 223, 222));
        setHorizontalAlignment(JLabel.CENTER);
        setFont(new Font("Consolas", Font.PLAIN, 14));
        return this;

    }
}

class MyRendererDescription extends DefaultTableCellRenderer {

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setBackground(new Color(224, 223, 222));
        setHorizontalAlignment(JLabel.CENTER);
        setFont(new Font("Consolas", Font.PLAIN, 14));
        return this;

    }
}

class MyRendererStatus extends DefaultTableCellRenderer {

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        setHorizontalAlignment(JLabel.CENTER);
        setText("Stopped");
        setBackground(new Color(244, 102, 102));
        setFont(new Font("Consolas", Font.PLAIN, 14));
        return this;

    }

}
