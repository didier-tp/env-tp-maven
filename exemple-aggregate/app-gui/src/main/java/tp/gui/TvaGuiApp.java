package tp.gui;

import javax.swing.*;

public class TvaGuiApp {
    public static void main(String[] args) {
        double ht = Double.parseDouble(JOptionPane.showInputDialog(null,"ht:" , "montant ht ?" ,JOptionPane.INFORMATION_MESSAGE));
        double taux = Double.parseDouble(JOptionPane.showInputDialog(null,"taux:" , "taux de tva (en %)?" ,JOptionPane.INFORMATION_MESSAGE));
        tp.service.MyService myService = new tp.service.impl.MyServiceImpl();
        double tva= myService.calculerTva(ht, taux);
        double ttc= myService.calculerTtc(ht, taux);
        JOptionPane.showMessageDialog(null,"tva="+tva + "  ttc="+ttc);
    }
}
