
import javax.swing.JOptionPane;

public class Aula01TabelaVerdade {
    public static void main(String[] args) {        
        JOptionPane.showMessageDialog(null, ""
                + "Tabela Verdade do AND:"
                + "\nT AND T : "+(true && true)
                + "\nT AND F : "+(true && false)
                + "\nF AND T : "+(false && true)
                + "\nF AND F : "+(false && false) );
        
        JOptionPane.showMessageDialog(null, ""
                + "Tabela Verdade do OR:"
                + "\nT OR T : "+(true || true)
                + "\nT OR F : "+(true || false)
                + "\nF OR T : "+(false || true)
                + "\nF OR F : "+(false || false) );
        
        JOptionPane.showMessageDialog(null, ""
                + "Tabela Verdade do NOT:"
                + "\nNOT T: "+(!true)
                + "\nNOT F: "+(!false));
    }
}
