import java.io.*;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String args[]) throws IOException{
        Votacao[] votos = new Votacao[200];
        Methods m = new Methods();
        
        for (int i=0;i<200;i++){
            votos[i] = new Votacao();
        }
        
        int opc = 0;
        
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Informe uma opção:\n"
                                + "1- Carregar Seção/Número eleitor\n"
                                + "2- Classificar por Seção\n"
                                + "3- Gravar Registros\n"
                                + "4- Mostrar indicadores\n"
                                + "9- Finalizar"));
            
            switch(opc){
                case 1:
                    m.FCadastraVotacao(votos);
                    break;
                    
                case 2:
                    m.FClassificasecao(votos);
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
            }
        }
    }
}
