import java.util.Random;
import java.io.*;
import javax.swing.*;
public class MethodsVotos {
    Random r = new Random();
    String arquivo = "Votacao2026.txt";
    int[] secoes = new int[10];
    int[][] cand = new int[10][200];
    
    public Votacao[] FCadastraVotacao(Votacao[] votos){
        
        for (int i=0;i<200;i++){
            votos[i].secao = r.nextInt(1,11);
            votos[i].candidato = r.nextInt(301);
        }
        
        System.out.println("Fim do cadastro.");
        return votos;
    }
    
    public Votacao[] FClassificasecao(Votacao[] votos){
        
        for (int x=0;x<10;x++){
            secoes[x] = x+1;
            for (int y=0;y<200;y++){
                cand[x][y] = -1;
            }
        }
        
        for (int i=0;i<200;i++){
            for (int a=0;a<10;a++){
                if (secoes[a] == votos[i].secao){
                    // ordenar os valores da classe
                    cand[a][i] = votos[i].candidato;
                }
            }
        }
        
        System.out.println("Votos classificados.");
        return votos;
    }
    
    public void FGravaVotacao(Votacao[] votos) throws IOException{
        BufferedWriter grava = new BufferedWriter(new FileWriter(arquivo));
        
        for (int a=0;a<10;a++){
            grava.write("Seção: "+Integer.toString(a+1));
            grava.newLine();
            for (int i=0;i<200;i++){
                if (cand[a][i] != -1){
                    grava.write(Integer.toString(cand[a][i]));
                    grava.newLine();
                }
            }
        }
        
        System.out.println("Arquivo gerado.");
        grava.close();
    }
    
    public void Indicadores(Votacao[] votos) throws IOException{
        Indicadores di = new Indicadores();
        
        int opc=0;
        
        while(opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Estatísticas de Votação em 2026\n"
                                    + "1- Quantidade Eleitores por Seção"
                                    + "2- Seção com Maior e Menor número de Eleitores"
                                    + "3- Quantidade de votos por candidato"
                                    + "4- 10 primeiros colocados"
                                    + "9- Finaliza Consulta"));
            switch(opc){
                case 1:
                    di.EleitoresSecao(votos, arquivo);
                    break;
            }
        }
    }
}
