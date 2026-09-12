import javax.swing.JOptionPane;
public class Ex05 {
    public static void main(String args[]) {
        int a,b,c,delta;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Dê o valor de A: "));
        
        System.out.print("Dê o valor de B: ");
        b = Integer.parseInt(JOptionPane.showInputDialog("Dê o valor de B: "));
        
        System.out.print("Dê o valor de C: ");
        c = Integer.parseInt(JOptionPane.showInputDialog("Dê o valor de C: "));
        
        delta = (b*b) - (4 * a * c);
        
        if (delta > 0){
            JOptionPane.showMessageDialog(null,"2 raízes distintas reais.");
        } else if (delta < 0) {
            JOptionPane.showMessageDialog(null,"sem raízes reais.");
        } else {
            JOptionPane.showMessageDialog(null,"1 raíz real.");
        }
    }
}
