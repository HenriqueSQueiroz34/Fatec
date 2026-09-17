import javax.swing.JOptionPane;
public class Ex03 {
    public static void main (String args[]){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de N: "));
        float r = 1;
        
        System.out.println("Resultado: "+Soma(n-1,r));
    }
    
    static float Soma (int n, float r){
        if (n > 1){
            r += (float) 1/n;
            Soma(n-1,r);
        }
        return r;
    }
}
