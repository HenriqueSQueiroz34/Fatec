import javax.swing.*;
public class Ex36 {
    public static void main (String args[]){
        int s,c;
        float t;
        int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um numeral para a sequência: "));
        
        t=0;
        s=1;
        c=i;
        
        while (i >= 1){
            s*=c;
            c--;
            
            if (c == 0){
                t += (float)1/s;
                i--;
                c=i;
                s=1;
            }
            
            
        }
        
        System.out.println("Total: "+t);
    }
}
