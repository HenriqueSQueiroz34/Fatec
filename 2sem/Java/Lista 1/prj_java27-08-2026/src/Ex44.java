import javax.swing.*;
public class Ex44 {
    public static void main (String args[]){
        int base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base: "));
        int expo = Integer.parseInt(JOptionPane.showInputDialog("Agora informe o expoente: "));
        int n=1;
        do {
            n*=base;
            expo--;
        } while (expo > 0);
        
        System.out.println("resultado: "+n);
    }
}
