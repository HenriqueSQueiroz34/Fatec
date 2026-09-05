import javax.swing.JOptionPane;
public class Func_Ex38 {
    public static void main (String args[]){
        int a,b,men,mai;
        
        b=1; a = 0; men = a; mai = a;
        
        do{
            do{
                a = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de ordem "+b));
            } while (a < 0);
            
            if (b == 1){men=a;  mai=a;}
            
            if (a < men){men = a;}
            if (a > mai){mai = a;}
            
            b ++;
        } while (b < 11);
        
        System.out.println(Ordem(men,mai));
    }
    
    static String Ordem(int a, int e){
        return "Menor: "+e+"\nMaior: "+a;
    }
}
