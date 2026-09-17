import javax.swing.JOptionPane;
public class Ex08 {
    public static void main (String args[]){
        int matriz[][] = new int[4][3];
        
        for (int l=0;l<4;l++){
            for (int c=0;c<3;c++){
                matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog
                ("Informe a quantidade do produto "+ (c+1) +" da semana "+ (l+1) +": "));
            }
            JOptionPane.showMessageDialog(null, "Semana "+ (l+1) +" terminada.");
        }
        
        System.out.println("O total de produtos da semana é: "+Total(matriz)+
                "\nQtd. de cada produto no mês:\n"+Mes(matriz)+
                "\nQtd. de cada nas semanas:\n"+Semana(matriz));
    }
    
    static int Total (int m[][]){
        int tot = 0;
        
        for (int l=0;l<4;l++){
            for (int c=0;c<3;c++){
                tot += m[l][c];
            }
        }
        
        return tot;
    }
    
    static String Mes (int m[][]){
        int pmes[] = new int[3];
        String txt="";
        
        for (int l=0;l<4;l++){
            for (int c=0;c<3;c++){
                pmes[c] += m[l][c];
            }
        }
        
        for (int c=0;c<3;c++){
            txt += pmes[c] + " ";
        }
        
        return txt;
    }
    
    static String Semana (int m[][]){
        int psem[] = new int[4];
        String txt="";
        
        for (int l=0;l<4;l++){
            for (int c=0;c<3;c++){
                psem[l] += m[l][c];
            }
        }
        
        for (int l=0;l<4;l++){
            txt += psem[l] + " ";
        }
        
        return txt;
    }
}
