
public class ControllingMenuButtonsClick {

    static boolean isDashMenuSelected = false;
    static boolean isConfigMenuSelected = false;
    static boolean isSmtpMenuSelected = false;
    static boolean isDatabaseMenuSelected = false;

    public void changeMenuAction(Gui gui) {

//        if (isDashMenuSelected) {
//            gui.dashMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
//            gui.configMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
//            gui.smtpMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
//            gui.databaseMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
//        } else if (isConfigMenuSelected) {
//            gui.dashMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
//            gui.configMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
//            gui.smtpMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
//            gui.databaseMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
//        } else if (isSmtpMenuSelected) {
//            gui.dashMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
//            gui.configMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
//            gui.smtpMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
//            gui.databaseMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
//        } else if (isDatabaseMenuSelected) {
//            gui.dashMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
//            gui.configMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
//            gui.smtpMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
//            gui.databaseMenuLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
//        }

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

}
