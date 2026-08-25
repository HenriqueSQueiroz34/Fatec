import javax.swing.JOptionPane;
public class Ex19 {
    public static void main(String args[]) {
        double a,b;
        
        do {
            a = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor: "));
            
            b = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor: "));
        } while (a <= 0 || b <= 0);
        
        if (b > a){
            JOptionPane.showMessageDialog(null, "O maior deles é: "+b);
        } else if (a > b){
            JOptionPane.showMessageDialog(null, "O maior deles é: "+a);
        } else {
            JOptionPane.showMessageDialog(null, "Os dois são iguais");
        }
    }
}