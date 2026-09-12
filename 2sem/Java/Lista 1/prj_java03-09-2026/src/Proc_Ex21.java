import javax.swing.JOptionPane;
public class Proc_Ex21 {
    static double a,b,c,d,nota;
    
    public static void main (String args[]){
        do{
            a = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota bimestral: "));
            b = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota bimestral: "));
            c = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota bimestral: "));
            d = Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota bimestral: "));
        } while (a<0 || b<0 || c<0 || d<0);
        
        Nota();
    }
    
    static void Nota(){
        nota = (a + b + c + d) /4;
        if (nota >= 6.0){
            System.out.println("APROVADO: %.1d"+nota);
        } else {
            if (nota >= 3.0){
                System.out.println("EXAME: %.1d"+nota);
            } else {
                System.out.println("RETIDO: %.1d"+nota);
            }
        }
    }
}
