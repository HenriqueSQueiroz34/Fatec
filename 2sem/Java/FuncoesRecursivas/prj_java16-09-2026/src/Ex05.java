import javax.swing.JOptionPane;
public class Ex05 {
    static int f;
    public static void main (String args[]){
        int n,t=0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para N: "));
        }while (n < 1);
        
        
        System.out.println("Resultado: "+Soma(n,t));
    }
    
    static int Soma (int n,int t){
        if (n > 1){
            t = Fat(n);
            t = t + Soma(n-1,t);
        } else {
            return 1;
        }
        return t;
    }
    
    static int Fat (int n){
        if (n > 1){
            f = n * Fat(n-1);
        } else{
            return 1;
        }
        return f;
    }
}
