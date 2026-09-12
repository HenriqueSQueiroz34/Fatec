import javax.swing.JOptionPane;
public class Ex09 {
    public static void main(String args[]) {
        int a,b;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        JOptionPane.showMessageDialog(null, "Soma dos quadrados: " + (a*a+b*b));
    }
}
