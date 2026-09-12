import javax.swing.JOptionPane;
public class Proc_Ex20 {
    static int  a, b, c, delta, d, ra;
    static double r1,r2;
    
    public static void main (String args[]){
        a = Integer.parseInt(JOptionPane.showInputDialog("Dê o valor de A: "));
            
        b = Integer.parseInt(JOptionPane.showInputDialog("Dê o valor de B: "));
            
        c = Integer.parseInt(JOptionPane.showInputDialog("Dê o valor de C: "));
        
        Raiz();
        
        if (delta > 0){
            System.out.println("2 raízes distintas reais:\n"+r1+"\n"+r2);
        } else if (delta < 0) {
            JOptionPane.showMessageDialog(null, "Sem raízes reais.");
        } else {
            JOptionPane.showMessageDialog(null, "1 raíz real:\n"+r1+"\n"+r2);
        }

    }
    
    static void Raiz(){
        delta = (b*b) - (4 * a * c);
        
        d = 1;
        ra = 0;
        
        // Raíz inteira
        while (delta >= d){
            delta -= d;
            d += 2;
            ra += 1;
        }
        
        r1 = (((-1)*b) + ra)/(2.0 * a);
        r2 = (((-1)*b) - ra)/(2.0 * a);
    }
}
