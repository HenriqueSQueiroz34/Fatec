import javax.swing.JOptionPane;
public class Func_Ex33 {
    public static void main (String args[]){
        int i;
        
        i= Integer.parseInt(JOptionPane.showInputDialog("Digite o termo final da sequência: "));
        
        System.out.println("A soma total da sequência é: "+Soma(i));
    }
    
    static double Soma(int a){
        double s=0;
        while (a>=1){
            s += 1/a;
            a -= 1;
        }
        return s;
    }
}
