import javax.swing.*;
public class Lt01_EstSimples {
    public static void main (String args[]){
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
        
        if (x > 0){
            System.out.println(x+" é positivo");
        }

    }
}
