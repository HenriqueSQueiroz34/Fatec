import java.io.*;
import javax.swing.*;
public class Methods {
    
    int v1=0;
    int v2=0;
    boolean sec=false; // Validador da Seção
    boolean num=false; // Número de Eleitor repetido

    
    public Eleitor[] Eleitores(Eleitor[] e){
        int[] secoes = {1,3,4,5,9,10};
        
        for (int i=0;i<e.length;i++){
                        
            e[i].nome = JOptionPane.showInputDialog("Informe o nome do Eleitor "+(i+1)+":");
            e[i].numero = Integer.parseInt(JOptionPane.showInputDialog("Dê o número do Eleitor "+(i+1)+":"));
            e[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Dê a seção do Eleitor "+(i+1)+" entre\n"
                                                                    + "1,3,4,5,9 ou 10:"));
            
            // Numero Eleitor
            for (int a=0;a<e.length;a++){
                if (e[i].numero == e[a].numero){
                    System.out.print("Número de Eleitor já existe.");
                    num=true;
                }
            }
            
            if (num){
                do{
                    e[i].numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um Número de Eleitor válido:"));
                    for (int a=0;a<secoes.length;a++){
                        if(e[i].numero == secoes[a]){
                            num=false;
                        }
                    }
                    
                } while(!num);
            }
            
            // Seção
            for (int a=0;a<secoes.length;a++){
                if(e[i].secao == secoes[a]){
                    sec=true;
                }
            }
            
            AreaVotacao(e[i].secao);
            
            if (!sec){
            System.out.println("Informe uma seção válida.");
                do{
                    e[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Dê a seção do Eleitor "+(i+1)+" entre\n"
                                                                        + "1,3,4,5,9 ou 10:"));
                    for (int a=0;a<secoes.length;a++){
                        if(e[i].secao == secoes[a]){
                            sec=true;
                        }
                    }
                    
                    if (sec){
                        AreaVotacao(e[i].secao);
                    }
                    
                } while(!sec);
            }
            
            System.out.printf("Eleitor %d cadastrado.\n",i+1);
        }
        return e;
    }
    
    public void Votacoes(Eleitor[] e) throws IOException{
        Votacao vota = new Votacao();
        int opc=0;
        
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("Cadastro Votação 1 e 2\n"
                                                             + "1- Cadastro Votação 1\n"
                                                             + "2- Cadastro Votação 2\n"
                                                             + "9- Fim"));
            
            switch(opc){
                case 1: vota.V1(e);
                break;
                case 2: vota.V2(e);
            }
        }while (opc!=9);
        
        System.out.println("Votação 1 e 2 registradas.");
    }
    
    public void Agrupar() throws IOException{
        /*
            Ordenar os eleitores em ordem (talvez a partir do voto) em cada arquivo
            Menu das Estatísticas
        */
        
        String agrupado = "Agrupado.txt";
        String votac1 = "Votacao1.txt";
        String votac2 = "Votacao2.txt";
        BufferedWriter grava = new BufferedWriter(new FileWriter(agrupado));
        BufferedReader leitor1 = new BufferedReader(new FileReader(votac1));
        BufferedReader leitor2 = new BufferedReader(new FileReader(votac2));
        
        // Entender de qual classe tem q instanciar
        Votacao[] v1 = new Votacao[5];
        Votacao[] v2 = new Votacao[5];
        
        // Leitura
        for (int i=0;i<5;i++){
            
        }
        
        // Gravação
        for (int i=0;i<10;i++){
            
        }
    }
    
    public void Estatistica(){
        
    }
    
    public void AreaVotacao(int e){
        switch(e){
            case 1,3,4:
                if(v1 < 5){
                    v1++;
                } else{
                    System.out.println("A Votação 1 não aceita mais Eleitores (1, 3, 4).");
                    tem=false;
                }
            break;

            case 5,9,10: 
                if(v2 < 5){
                    v2++;
                } else{
                    System.out.println("A Votação 2 não aceita mais Eleitores (5, 9, 10).");
                    tem=false;
                }
            break;
            
            default: tem=false;
            break;
        }
    }
}
