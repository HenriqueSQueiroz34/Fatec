import javax.swing.*;
public class Ex24 {
    public static void main (String args[]){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
        if (a%2==0 && a%3==0){System.out.println(a+" é divisível por 2 e 3.");}
        else {System.out.println(a+" não é divisível por 2 e 3.");}
    }
}
