import javax.swing.*;
public class Ex21 {
    public static void main(String args[]){
        double a,b,c,d,nota;
        a = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota bimestral: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota bimestral: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota bimestral: "));
        d = Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota bimestral: "));
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
