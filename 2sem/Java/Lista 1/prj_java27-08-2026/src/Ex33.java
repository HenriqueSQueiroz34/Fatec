import javax.swing.*;
public class Ex33 {
    public static void main (String args[]){
        int i;
        double s;
        
        i= Integer.parseInt(JOptionPane.showInputDialog("Digite o termo final da sequência: "));
        s = 0;
        
        while (i>=1){
            s += 1/i;
            i -= 1;
        }
        
        System.out.println("A soma total da sequência é: "+s);
    }
}
