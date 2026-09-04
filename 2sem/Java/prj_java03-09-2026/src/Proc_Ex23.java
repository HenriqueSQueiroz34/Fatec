import javax.swing.JOptionPane;
public class Proc_Ex23 {
    static int a,b,c,d;
    
    public static void main (String args[]){
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro valor:"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto valor:"));
        
        Ordena();
    }
    
    static void Ordena(){
        if (d > a){
            System.out.println("A ordem final é: "+d+" "+a+" "+b+" "+c);
        } else {
            if (d > b){
                System.out.println("A ordem final é: "+a+" "+d+" "+b+" "+c);
            } else {
                if (d > c) {
                    System.out.println("A ordem final é: "+a+" "+b+" "+d+" "+c);
                } else {
                    System.out.println("A ordem final é: "+a+" "+b+" "+c+" "+d);
                }
            }
        }
    }
}
