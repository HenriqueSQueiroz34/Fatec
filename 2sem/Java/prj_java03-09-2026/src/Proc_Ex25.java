import javax.swing.JOptionPane;
public class Proc_Ex25 {
    static int cmin,chr,fmin,fhr;
    
    public static void main (String args[]){
        do {
            chr = Integer.parseInt(JOptionPane.showInputDialog("Hora de início do jogo: "));
            cmin = Integer.parseInt(JOptionPane.showInputDialog("Dê os minutos de início do jogo: "));
            fhr = Integer.parseInt(JOptionPane.showInputDialog("Hora final do jogo: "));
            fmin = Integer.parseInt(JOptionPane.showInputDialog("Dê os minutos de fim do jogo: "));
        } while (chr<0 || cmin<0 || fhr<0 || fmin<0);
        
        int jhr = fhr-chr;
        int jmin = fmin-fmin;
        
        Jogo(jhr,jmin);
    }
    
    static void Jogo(int h, int m){
        if (h <= 0){ h += 24;}
        if (m < 0){
            h -=1;
            m += 60;
        }
        
        if (h >= 24 && m > 0){
            System.out.println("O jogo não pode acontecer por passar de 24 horas. "+h+":"+m);
        } else {
            System.out.println("O jogo vai durar "+h+":"+m);
        }
    }
}
