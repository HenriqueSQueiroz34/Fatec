import java.util.Random;
public class Ex12 {
    /*Carregar matriz[8,8] com tabuleiro e, sem decisão, somar a qtd de peças*/
    public static void main (String args[]){
        Random gera = new Random();
        
        int m[][] = new int[8][8];
        int pecas[] = new int[7];
        
        for (int l=0;l<8;l++){
            for (int c=0;c<8;c++){
                m[l][c] = gera.nextInt(1,8);
            }
        }
        
        for (int l=0;l<8;l++){
            for (int c=0;c<8;c++){
                int i = m[c][l] -1;
                pecas[i]++;
            }
        }
        
        for (int i=0;i<7;i++){
            System.out.print(pecas[i] + " ");
        }
    }
}
