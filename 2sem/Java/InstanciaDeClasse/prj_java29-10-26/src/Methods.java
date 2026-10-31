import java.util.Random;
import java.io.*;
import javax.swing.*;
public class Methods {
    Random r = new Random();
    String arquivo = "Votacao2026.txt";
    
    public Votacao[] FCadastraVotacao(Votacao[] votos){
        
        for (int i=0;i<200;i++){
            votos[i].secao = r.nextInt(1,11);
            votos[i].candidato = r.nextInt(0,301);
        }
        
        System.out.println("Fim do cadastro.");
        return votos;
    }
    
    public Votacao[] FClassificasecao(Votacao[] votos){
        Votacao[] aux = new Votacao[1];
        
        // Iniciando vetor auxiliar
        aux[0] = new Votacao();
        
        // Lógica de ordenação (bubble)
        for (int i=0;i<200;i++){
            for (int a=i+1;a<200;a++){
                if (votos[i].secao > votos[a].secao){
                    aux[0].secao = votos[i].secao;
                    aux[0].candidato = votos[i].candidato;
                    
                    votos[i].secao = votos[a].secao;
                    votos[i].candidato = votos[a].candidato;
                    
                    votos[a].secao = aux[0].secao;
                    votos[a].candidato = aux[0].candidato;
                }
            }
        }
        
        System.out.println("Votos classificados.");
        return votos;
    }
    
    public void FGravaVotacao(Votacao[] votos) throws IOException{
        BufferedWriter grava = new BufferedWriter(new FileWriter(arquivo));
        
        for (int i=0;i<199;i++){
            if (i==0){
                grava.write("Secao: "+Integer.toString(votos[i].secao));
                grava.newLine();
            }
            
            if (votos[i].secao == votos[i+1].secao){
                grava.write(Integer.toString(votos[i].candidato));
                grava.newLine();
            } else{ // apura as diferentes seções
                grava.write(Integer.toString(votos[i].candidato));
                grava.newLine();
                if (i != 198){
                    grava.write("Secao: "+Integer.toString(votos[i+1].secao));
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
                                    + "1- Quantidade Eleitores por Seção\n"
                                    + "2- Seção com Maior e Menor número de Eleitores\n"
                                    + "3- Quantidade de votos por candidato\n"
                                    + "4- 10 primeiros colocados\n"
                                    + "9- Finaliza Consulta"));
            switch(opc){
                case 1:
                    System.out.println();
                    di.EleitoresSecao(votos);
                    System.out.println();
                    break;
                    
                case 2:
                    di.MaiorMenor(votos);
                    System.out.println();
                    break;
                    
                case 3:
                    di.CandidatoVotos(votos);
                    System.out.println();
                    break;
                    
                case 4:
                    di.Colocados(votos);
                    break;
            }
        }
    }
}
