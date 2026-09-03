import javax.swing.JOptionPane;
public class Proc_Ex18 {
    static int a,b,dif;
    
    public static void main (String args[]){
        do{
            a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
            
            b = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo valor? "));
        } while (a <=0 || b <=0);
        
        Diferenca();
        System.out.println("A diferença entre os valores é " + dif);
    }
    
    static void Diferenca(){
        dif = a - b;
        
        if (b > a){
            dif = dif * (-1);
        }
    }
}
