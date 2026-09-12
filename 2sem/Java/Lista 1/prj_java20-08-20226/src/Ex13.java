import javax.swing.JOptionPane;
public class Ex13 {
    public static void main(String args[]) {
        float q;
        
        do {
            q = Integer.parseInt(JOptionPane.showInputDialog("Quantos kg tem de alimento? "));
        } while (q <= 0);
        
        q *= 1000; // kg -> g
        
        for (int d=1; q >= 50 ;d++){
            q -= 50;
            
            if (q < 50){
                JOptionPane.showMessageDialog(null, "Dias de alimento: "+ d);
            }
        }
    }
}
