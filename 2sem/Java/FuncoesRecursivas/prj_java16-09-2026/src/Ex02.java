import javax.swing.JOptionPane;
public class Ex02 {
    public static void main (String args[]){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor máximo para N: "));
        
        n += Soma(n-1);
        
        System.out.println("O resultado final é: "+n);
    }
    
    static int Soma (int n){
        if (n > 1){
            n += Soma(n-1);
        }
        return n;
    }
}
