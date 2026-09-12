import javax.swing.JOptionPane;
public class Ex12 {
    public static void main(String args[]) {
        int aa, an;
        
        do {
            an = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano que você nasceu? "));
            
            aa = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano atual? "));
        }while (aa <= 0 || an <= 0 || aa < an);
        
        JOptionPane.showMessageDialog(null, "Idade hoje: "+ (aa-an) + " anos");
        JOptionPane.showMessageDialog(null, "Idade em 17 anos: "+ (aa-an) + " anos");
    }
}
