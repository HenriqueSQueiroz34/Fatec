import javax.swing.JOptionPane;
public class Func_Ex40 {
    public static void main (String args[]){
        int a,b,c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor: "));
        
        if (a > b){
            c=a; a=b; b=c;
        }
        
        System.out.println("Primos entre "+a+" e "+b+"\n"+Primo(a,b));
    }
    
    static String Primo(int a, int b){
        String txt="";
        for (int n=a+1; n < b; n++){
            if (n > 1){
                for (int i=2; n < (n/2)+1; i++){
                    if (n%i==0){break;}
                }
            } else {
                txt += n+"\n";
            }
        }
        return txt;
    }
}
