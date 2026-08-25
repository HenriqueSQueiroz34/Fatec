import javax.swing.JOptionPane;
public class Ex10 {
    public static void main(String args[]) {
        float a,b,dif;
        
        a = Float.parseFloat(JOptionPane.showInputDialog("Informe um valor real: "));
        
        b = Float.parseFloat(JOptionPane.showInputDialog("Informe outro valor real: "));
        
        dif = a-b;
        
        if (dif < 0) dif *=-1;
        
        JOptionPane.showMessageDialog(null, "A diferença entre os números é "+dif);
    }
}
