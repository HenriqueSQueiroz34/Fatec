import javax.swing.JOptionPane;
public class Func_Ex35 {
    public static void main (String args[]){
        int a,b,c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numeral: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numeral: "));
    
        if (a < b){
            c = a;
            a = b;
            b = c;
        }
        c=0;
        
        while ( a >= b){
            if (b%2==0){
                b++;
            } else {
                c += Par(b,c);
                b++;
            }
        }
        
        System.out.println("Soma dos ímpares: "+c);
    }
    
    static int Par(int n, int s){
        s += n;
        return s;
    }
}
