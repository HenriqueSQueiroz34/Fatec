import javax.swing.JOptionPane;
public class Ex08 {
    public static void main(String args[]) {
        float val;
        
        do {
            val = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor investido? R$ "));
        } while (val <= 0);
        
        JOptionPane.showMessageDialog(null, "Valor após este mês: R$ " + (val + val*0.013));
    }
}
