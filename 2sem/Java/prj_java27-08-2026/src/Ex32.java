import javax.swing.*;
public class Ex32 {
    public static void main (String args[]){
        int i,s;
        
        i = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para fatorear: "));
        s=1;
        
        while (i >= 1){
            s*=i;
            i-=1;
        }
        
        System.out.println("O fatorial é: "+s);
    }
}
