import javax.swing.JOptionPane; 
public class Ex18 {
    public static void main(String args[]) {
        int a,b,dif;
        
        do{
            a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
            
            b = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo valor? "));
        } while (a <=0 || b <=0);
        
        dif = a - b;
        
        if (b > a){
            dif = dif * (-1);
        }
        
        JOptionPane.showMessageDialog(null, "A diferença entre os valores é " + dif);
    }
}