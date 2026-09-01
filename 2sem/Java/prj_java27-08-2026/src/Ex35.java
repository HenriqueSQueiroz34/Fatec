import javax.swing.*;
public class Ex35 {
    public static void main (String args[]){
        int a,b,c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numeral: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numeral: "));
    
        if (a < b){
            c = a;
            a = b;
            b = c;
        }
        
        while ( a >= b){
            if (b%2==0){
                b++;
            } else {
                System.out.println(b);
                b++;
            }
        }
    }
}
