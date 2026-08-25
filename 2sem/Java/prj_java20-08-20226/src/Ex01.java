import javax.swing.JOptionPane;
public class Ex01 {
    public static void main(String args[]){
        
        int lado;
        
        do {
            lado = Integer.parseInt(JOptionPane.showInputDialog("Informe o lado do quadrado: "));
        } while (lado <= 0);
        
        JOptionPane.showMessageDialog(null,"Área do quadrado: " + lado*lado);
    }
}
