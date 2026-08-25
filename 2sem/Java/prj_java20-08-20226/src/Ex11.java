import javax.swing.JOptionPane;
public class Ex11 {
    public static void main(String args[]) {
        float raio;
        
        do{
            raio = Float.parseFloat(JOptionPane.showInputDialog("Informe o raio da circunferência: "));
        } while (raio <= 0);
        
        JOptionPane.showMessageDialog(null, "O comprimento da circunferência é "+ (raio*2*3.14));
    }
}
