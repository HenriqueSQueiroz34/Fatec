import javax.swing.JOptionPane;
public class Ex06 {
    public static void main(String args[]) {
        int x,y,z;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        z=x;
        x=y;
        y=z;
        
        JOptionPane.showMessageDialog(null,x+" = x e y = "+y);
    }
}
