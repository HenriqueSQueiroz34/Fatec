import javax.swing.JOptionPane;
public class Func_Ex34 {
    public static void main (String args[]){
        int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um numeral para a tabuada: "));
        
        for (int a=1;a<11;a++){
            System.out.println(Tabuada(i,a));
        }
    }
    
    static String Tabuada(int i, int a){
        return i+" x "+a+" = "+(i*a);
    }
}
