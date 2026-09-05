import javax.swing.JOptionPane;
public class Func_Ex26 {
    public static void main (String args){
        int a,b;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe um numeral: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe outro numeral: "));
        
        if (a > b){
            if (a%b==0){
                System.out.printf(Divi(a,b));
            } else{
                System.out.printf(NDivi(a,b));
            }
        } else{
            if (b%a==0){
                System.out.printf(Divi(b,a));
            } else{
                System.out.printf(NDivi(b,a));
            }
        }
    }
    
    static String Divi(int n1, int n2){
        return n1+" é divisível por "+n2;
    }
    
    static String NDivi(int n1, int n2){
        return n1+" não é divisível por "+n2;
    }
}
