import javax.swing.*;
public class Ex26 {
    public static void main (String agrs[]){
        int a,b;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe um numeral: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe outro numeral: "));
        
        if (a > b){
            if (a%b==0){
                System.out.printf("%d é divisível por %d\n",a,b);
            } else{
                System.out.printf("%d não é divisível por %d\n",a,b);
            }
        } else{
            if (b%a==0){
                System.out.printf("%d é divisível por %d\n",b,a);
            } else{
                System.out.printf("%d não é divisível por %d\n",b,a);
            }
        }
    }
}
