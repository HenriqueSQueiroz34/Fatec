import java.util.Random;
import java.io.*;
public class Methods {
    Random r = new Random();
    String arquivo = "Votacao2026.txt";
    int[] secoes = new int[10];
    int[][] cand = new int[10][200];
    
    public Votacao[] FCadastraVotacao(Votacao[] votos){
        
        for (int i=0;i<200;i++){
            votos[i].secao = r.nextInt(1,11);
            votos[i].candidato = r.nextInt(1,301);
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
        
        System.out.println("Votos classificados.\n");
        return votos;
    }
    
    // problema não identificado ao executar: não faz a gravação
    public  void FGravaVotacao(Votacao[] votos) throws IOException{
        BufferedWriter grava = new BufferedWriter(new FileWriter(arquivo));
        
        grava.write("Seção: "+Integer.toString(1));
            grava.newLine();
            System.out.println("Linha concluída: ");
        
        for (int a=0;a<10;a++){
            grava.write("Seção: "+Integer.toString(a+1));
            grava.newLine();
            System.out.println("Linha concluída: "+a);
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
}
