import javax.swing.JOptionPane;
public class Ex12 {
    public static void main (String args[]){
        int pontos[] = new int[]{0,1,5,3,3,9,0,0};
        int tabul[][] = new int[8][8];
        int soma = 0;
        int peca = 0;
        
        for (int l=0;l<8;l++){
            for (int c=0;c<8;c++){
                
                do {
                    peca = Integer.parseInt(JOptionPane.showInputDialog(
                        "Escolha entre as opções abaixo para as peças do tabuleiro:\n"
                        + "1- Peão\n2- Torre\n3- Bispo\n4- Cavalo\n5- Rainha\n6- Rei\n7- Vazio\n"
                        + "Dê o código da peça na posição ["+(l+1)+"]["+(c+1)+"]:"
                    ));
                } while (peca < 1 || peca > 7);
                
                tabul[l][c] = peca;
                soma += pontos[peca];
            }
        }
        
        System.out.println("Soma das peças: "+soma);
        Tabuleiro(tabul);
    }
    
    static void Tabuleiro (int t[][]){
        for (int l=0;l<8;l++){
            for (int c=0;c<8;c++){
                System.out.print(t[l][c] + " ");
            }
            System.out.println();
        }
    }
}
