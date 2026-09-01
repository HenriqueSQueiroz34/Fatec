import javax.swing.*;
public class Ex27 {
    public static void main (String args[]){
        int circuito,tempo;
        
        double voltas = Double.parseDouble(JOptionPane.showInputDialog("Quantas voltas foram dadas? "));
        circuito = Integer.parseInt(JOptionPane.showInputDialog("E quantos metros tem o circuito? "));
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Quantos minutos levou no total? "));
        
        voltas *= circuito;
        voltas = voltas / (tempo*60);
        System.out.printf("A velocidade média em km/h foi de "+voltas*3.6);
    }
}
