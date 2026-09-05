import javax.swing.JOptionPane;
public class Func_Ex36 {
    public static void main (String args[]){
        int s,c;
        int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um numeral para a sequência: "));
        
        s=1;
        c=i;
        
        System.out.println("Total: "+Res(s,c,i));
    }
    
    static float Res(int s, int c, int i){
        float t = 0;
        
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
        return t;
    }
}
