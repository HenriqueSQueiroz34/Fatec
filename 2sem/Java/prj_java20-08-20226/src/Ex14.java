import javax.swing.JOptionPane;
public class Ex14 {
    public static void main(String args[]) {
        int a,b;
        
        do {
            a = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro ângulo? "));
            
            b = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo ângulo? "));
        } while (a <= 0 || b <= 0 || a+b >= 180);
        
        JOptionPane.showMessageDialog(null, "Terceiro ângulo: "+ (180-(a+b)));
    }
}