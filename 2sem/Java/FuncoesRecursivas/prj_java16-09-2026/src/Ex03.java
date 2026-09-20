import javax.swing.JOptionPane;
public class Ex03 {
    static float r=1;
    public static void main (String args[]){
        int n;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de N: "));
        } while (n < 1);
        
        float r = 1;
        
        System.out.println("Resultado: "+Soma(n));
    }
    
    static float Soma (int n){
        if (n > 1){
            r += (float) 1/n;
            Soma(n-1);
            return r;
        } else{ return 1;}
        
    }
}
