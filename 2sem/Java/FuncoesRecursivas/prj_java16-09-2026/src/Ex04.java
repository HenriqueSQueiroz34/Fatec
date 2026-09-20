import javax.swing.JOptionPane;
public class Ex04 {
    static float r=0;
    public static void main (String args[]){
        int n;
        int c=1;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para N: "));
        } while (n < 1);
        
        System.out.println("Resultado final: "+Soma(n,c));
    }
    
    static float Soma (int n, int c){
        if (n == 1) { r =1; }
        if (c <= n){
            r += (float) (n-c+1)/c + Soma(n,c+1);
        }
        return r;
    }
}
