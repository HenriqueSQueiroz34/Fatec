import javax.swing.JOptionPane;
public class Ex15 {
    public static void main(String args[]) {
        float a,b;
        
        do {
            a = Float.parseFloat(JOptionPane.showInputDialog("Dê o primeiro cateto: "));
            
            b = Float.parseFloat(JOptionPane.showInputDialog("Dê o segundo cateto: "));
        } while (a <= 0 || b <= 0);
        
        JOptionPane.showMessageDialog(null, "Hipotenusa: " + ((a*a)+(b*b)));  
    }
}
