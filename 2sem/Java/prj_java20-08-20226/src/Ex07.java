import javax.swing.JOptionPane;
public class Ex07 {
    public static void main(String args[]) {
        int c,l,a;
        
        do {
            c = Integer.parseInt(JOptionPane.showInputDialog("Dê o comprimento: "));
            
            l = Integer.parseInt(JOptionPane.showInputDialog("Dê a largura: "));
            
            a = Integer.parseInt(JOptionPane.showInputDialog("Dê a altura: "));
        } while (c <=0 || l <= 0 || a <= 0);
        
        JOptionPane.showMessageDialog(null, "Área: "+ c*l*a);
    }
}
