import javax.swing.JOptionPane;
public class Func_Ex27 {
    public static void main (String args[]){
        int circuito,tempo;
        double voltas;
        
        do {
            voltas = Double.parseDouble(JOptionPane.showInputDialog("Quantas voltas foram dadas? "));
            circuito = Integer.parseInt(JOptionPane.showInputDialog("E quantos metros tem o circuito? "));
            tempo = Integer.parseInt(JOptionPane.showInputDialog("Quantos minutos levou no total? "));
        } while (voltas<=0 || circuito<=0 || tempo<=0);
        
        System.out.printf("A velocidade média em km/h foi de "+Corrida(voltas,circuito,tempo));
    }
    
    static double Corrida(double v, int c, int t){
        v *= c;
        v = v / (t*60);
        v *= 3.6;
        return v;
    }
}