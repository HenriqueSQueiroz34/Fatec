import javax.swing.*;
public class Ex34 {
    public static void main (String args[]){
        int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um numeral para a tabuada: "));
        
        for (int a=1;a<11;a++){
            System.out.println(i+" x "+a+" = "+(i*a));
        }
    }
}
