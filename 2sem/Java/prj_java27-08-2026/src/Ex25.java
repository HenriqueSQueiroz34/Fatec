import javax.swing.*;
public class Ex25 {
    public static void main (String args[]){
        int cmin,chr,fmin,fhr;
        do {
            chr = Integer.parseInt(JOptionPane.showInputDialog("Hora de início do jogo: "));
            cmin = Integer.parseInt(JOptionPane.showInputDialog("Dê os minutos de início do jogo: "));
            fhr = Integer.parseInt(JOptionPane.showInputDialog("Hora final do jogo: "));
            fmin = Integer.parseInt(JOptionPane.showInputDialog("Dê os minutos de fim do jogo: "));
        } while (chr<=0 || cmin<=0 || fhr<=0 || fmin<=0);
        
        int jhr = fhr-chr;
        int jmin = fmin-fmin;
        
        if (jhr < 0){ jhr += 24;}
        if (jmin < 0){
            jhr -=1;
            jmin += 60;
        }
        
        if (jhr >= 24 && jmin > 0){
            System.out.print("O jogo não pode acontecer por passar de 24 horas. "+jhr+":"+jmin);
        } else {
            System.out.print("O jogo vai durar "+jhr+":"+jmin);
        }
    }
}
