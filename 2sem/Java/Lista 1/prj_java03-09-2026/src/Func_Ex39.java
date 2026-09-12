import javax.swing.JOptionPane;
public class Func_Ex39 {
    public static void main (String args[]){
        long i=1;
        long s=0;
        
        System.out.println("Grãos no tabuleiro: "+Graos(i,s));
    }
    
    static long Graos(long i, long s){
        for (int c=1;c < 65;c++){
            s+=i;
            i*=2;
        }
        return s;
    }
}
