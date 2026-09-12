import javax.swing.*;
public class Ex22 {
    public static void main (String args[]){
        int a,b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
        
        if (a > b) {
            System.out.println("O primeiro é maior: "+a+" "+b);
        } else {
            if (a < b) {
                System.out.println("O segundo é maior: "+a+" "+b);
            } else {
                System.out.println("São iguais. REPITA");
            }
        }
    }
}
