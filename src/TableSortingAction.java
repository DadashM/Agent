
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TableSortingAction {

    DefaultTableModel defaultTableModel;

    public void sort(Gui gui) {
        defaultTableModel = (DefaultTableModel) gui.tableOfHosts.getModel();
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(defaultTableModel);

        rowSorter.setComparator(0, new IntCompare());
        gui.tableOfHosts.setRowSorter(rowSorter);
        gui.tableOfHosts.setAutoCreateRowSorter(false);
    }

}

class IntCompare implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Integer int1 = (Integer) intO1(o1);
        Integer int2 = (Integer) o2;

        return int1.compareTo(int2);
    }

    @Override
    public boolean equals(Object obj) {
        return this.equals(obj);
    }

    public void intO1(Object o1) {
        String str1 = (String) o1;
        String[] final1 = str1.split("\\.");

        System.out.println(Arrays.toString(final1));
    }

}
