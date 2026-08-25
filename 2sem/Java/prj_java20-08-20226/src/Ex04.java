import javax.swing.JOptionPane;
public class Ex04 {
    public static void main(String args[]) {
        int cel;
        
        do {
            cel = Integer.parseInt(JOptionPane.showInputDialog("Qual a temperatura (ºC): "));
        } while (cel <= 0);
        
        JOptionPane.showMessageDialog(null, "Temperatura em F: " + (float) (9*cel + 160)/5);
    }
}
