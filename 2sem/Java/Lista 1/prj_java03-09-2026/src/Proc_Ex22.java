import javax.swing.JOptionPane;
public class Proc_Ex22 {
    static int a,b;
    
    public static void main (String args[]){
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
        
        Maior();
    }
    
    static void Maior(){
        if (a > b) {
            System.out.println("O primeiro é maior: "+a+" "+b);
        } else {
            if (a < b) {
                System.out.println("O segundo é maior: "+a+" "+b);
            } else {
                System.out.println("São iguais. REPITA");
            }
        }
    }
}
