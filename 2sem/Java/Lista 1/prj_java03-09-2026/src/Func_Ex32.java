import javax.swing.JOptionPane;
public class Func_Ex32 {
    public static void main (String args[]){
        int i;
        
        i = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para fatorear: "));
        
        System.out.println("O fatorial é: "+Fat(i));
    }
    
    static int Fat(int i){
        int s=1;
        while (i >= 1){
            s*=i;
            i-=1;
        }
        
        return s;
    }
}
