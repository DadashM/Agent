
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ControllingMenuButtonsClick {

    static boolean isDashMenuSelected = false;
    static boolean isConfigMenuSelected = false;
    static boolean isSmtpMenuSelected = false;
    static boolean isDatabaseMenuSelected = false;

    public void changeMenuAction(Gui gui) {

        if (isDashMenuSelected) {
            gui.dashMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/dash_pressed.png")));
            gui.configMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/config.png")));
            gui.smtpMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/email.png")));
            gui.databaseMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/report.png")));
        } else if (isConfigMenuSelected) {
            gui.dashMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/dash.png")));
            gui.configMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/config_pressed.png")));
            gui.smtpMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/email.png")));
            gui.databaseMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/report.png")));
        } else if (isSmtpMenuSelected) {
            gui.dashMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/dash.png")));
            gui.configMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/config.png")));
            gui.smtpMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/email_pressed.png")));
            gui.databaseMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/report.png")));
        } else if (isDatabaseMenuSelected) {
            gui.dashMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/dash.png")));
            gui.configMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/config.png")));
            gui.smtpMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/email.png")));
            gui.databaseMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/report_pressed.png")));
        }

    }

    public void dashMenuCheckAndCorrectFlags(Gui gui) {
        isConfigMenuSelected = false;
        isSmtpMenuSelected = false;
        isDatabaseMenuSelected = false;

        gui.parentPanel.removeAll();
        gui.parentPanel.add(gui.dashPanel);
        gui.parentPanel.repaint();
        gui.parentPanel.revalidate();
    }

    public void configMenuCheckAndCorrectFlags(Gui gui) {
        isDashMenuSelected = false;
        isSmtpMenuSelected = false;
        isDatabaseMenuSelected = false;

        gui.parentPanel.removeAll();
        gui.parentPanel.add(gui.configPanel);
        gui.parentPanel.repaint();
        gui.parentPanel.revalidate();
    }

    public void smtpMenuCheckAndCorrectFlags(Gui gui) {
        isDashMenuSelected = false;
        isConfigMenuSelected = false;
        isDatabaseMenuSelected = false;

        gui.parentPanel.removeAll();
        gui.parentPanel.add(gui.smtpPanel);
        gui.parentPanel.repaint();
        gui.parentPanel.revalidate();
    }

    public void databaseMenuCheckAndCorrectFlags(Gui gui) {
        isDashMenuSelected = false;
        isConfigMenuSelected = false;
        isSmtpMenuSelected = false;

        gui.parentPanel.removeAll();
        gui.parentPanel.add(gui.databasePanel);
        gui.parentPanel.repaint();
        gui.parentPanel.revalidate();
    }

    //---------Mouse Entering Events-----------
    public void dashMenuButtonMouseEntered(Gui gui) {
        if (!isDashMenuSelected) {
            gui.dashMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/dash_entered.png")));
        }
    }

    public void dashMenuButtonMouseExited(Gui gui) {
        if (!isDashMenuSelected) {
            gui.dashMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/dash.png")));
        }
    }

    public void configMenuButtonMouseEntered(Gui gui) {
        if (!isConfigMenuSelected) {
            gui.configMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/config_entered.png")));
        }
    }

    public void configMenuButtonMouseExited(Gui gui) {
        if (!isConfigMenuSelected) {
            gui.configMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/config.png")));
        }
    }

    public void emailMenuButtonMouseEntered(Gui gui) {
        if (!isSmtpMenuSelected) {
            gui.smtpMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/email_entered.png")));
        }
    }

    public void emailMenuButtonMouseExited(Gui gui) {
        if (!isSmtpMenuSelected) {
            gui.smtpMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/email.png")));
        }
    }

    public void reportMenuButtonMouseEntered(Gui gui) {
        if (!isDatabaseMenuSelected) {
            gui.databaseMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/report_entered.png")));
        }
    }

    public void reportMenuButtonMouseExited(Gui gui) {
        if (!isDatabaseMenuSelected) {
            gui.databaseMenuLabel.setIcon(new ImageIcon(getClass().getResource("/res/report.png")));
        }
    }

    public void addToTableButtonMouseEntered(Gui gui) {
        gui.addToTable.setIcon(new ImageIcon(getClass().getResource("/res/add_pressed.png")));
        gui.addToTable.requestFocus();
    }

    public void addToTableButtonMouseExited(Gui gui) {
        gui.addToTable.setIcon(new ImageIcon(getClass().getResource("/res/add.png")));
    }

    public void removeFromTableButtonMouseEntered(Gui gui) {
        gui.removeFromTable.setIcon(new ImageIcon(getClass().getResource("/res/delete_entered.png")));
        gui.removeFromTable.requestFocus();
    }

    public void removeFromTableButtonMouseExited(Gui gui) {
        gui.removeFromTable.setIcon(new ImageIcon(getClass().getResource("/res/delete.png")));
    }

    public void clearTableButtonMouseEntered(Gui gui) {
        gui.clearTableButton.setIcon(new ImageIcon(getClass().getResource("/res/clear_all_button_entered.png")));
        gui.clearTableButton.requestFocus();
    }

    public void clearTableButtonMouseExited(Gui gui) {
        gui.clearTableButton.setIcon(new ImageIcon(getClass().getResource("/res/clear_all_button.png")));
    }

}
