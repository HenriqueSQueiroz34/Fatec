import javax.swing.JOptionPane;
public class Proc_Ex24 {
    public static void main (String args[]){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
        Divisivel(a);
    }
    
    static void Divisivel(int n){
        if (n%2==0 && n%3==0){System.out.println(n+" é divisível por 2 e 3.");}
        else {System.out.println(n+" não é divisível por 2 e 3.");}
    }
}
