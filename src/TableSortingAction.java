
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TableSortingAction {

    DefaultTableModel defaultTableModel;

    public void sort(Gui gui) {
        defaultTableModel = (DefaultTableModel) gui.tableOfHosts.getModel();
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(defaultTableModel);

        rowSorter.setComparator(0, new iPSorting());
        gui.tableOfHosts.setRowSorter(rowSorter);
        gui.tableOfHosts.setAutoCreateRowSorter(false);
    }

}

class iPSorting implements Comparator<String> {

    static Long toNumeric(String ip) {

        Scanner sc = new Scanner(ip).useDelimiter("\\.");
        Long l = (sc.nextLong() << 24) + (sc.nextLong() << 16) + (sc.nextLong() << 8) + (sc.nextLong());
        sc.close();
        return l;

    }

    @Override
    public int compare(String o1, String o2) {
        return toNumeric(o1).compareTo(toNumeric(o2));
    }

}
