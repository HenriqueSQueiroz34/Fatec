import javax.swing.JOptionPane;
public class Ex03 {
    public static void main(String args[]){
        int base, alt;
        
        do {
        base = Integer.parseInt(JOptionPane.showInputDialog("Dê a base do triângulo: "));
        alt = Integer.parseInt(JOptionPane.showInputDialog("Dê a altura do triângulo: "));
        } while (base <= 0 || alt <= 0);
        
        JOptionPane.showMessageDialog(null, "Área do triângulo: " + (base * alt) / 2);
    }
}
