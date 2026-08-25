import javax.swing.JOptionPane;
public class Ex02 {
    public static void main(String args[]){
        double sal;
        
        do {
        sal = Double.parseDouble(JOptionPane.showInputDialog("Dê o salário do funcionário: R$ "));
        } while (sal <= 0);
        
        JOptionPane.showMessageDialog(null, "Salário Reajustado: R$ " + sal*1.15);
    }
}
