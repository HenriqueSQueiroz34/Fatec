import javax.swing.*;
public class Ex23 {
    public static void main (String args[]){
        int a,b,c,d;
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro valor:"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto valor:"));
        
        if (d > a){
            System.out.println("A ordem final é: "+d+" "+a+" "+b+" "+c);
        } else {
            if (d > b){
                System.out.println("A ordem final é: "+a+" "+d+" "+b+" "+c);
            } else {
                if (d > c) {
                    System.out.println("A ordem final é: "+a+" "+b+" "+d+" "+c);
                } else {
                    System.out.println("A ordem final é: "+a+" "+b+" "+c+" "+d);
                }
            }
        }
    }
}
