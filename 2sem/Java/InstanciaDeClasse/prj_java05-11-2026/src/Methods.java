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
                    num=true;
                }
            }
            /*
            if (num){
                do{
                    System.out.print("Número de Eleitor já existe.");
                    e[i].numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um Número de Eleitor válido:"));
                    for (int a=0;a<e.length;a++){
                        if(e[i].numero != e[a].numero && a != 0){
                            num=false;
                        }
                    }
                } while(!num);
            }*/
            
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
        String agrupado = "Agrupado.txt";
        String votac1 = "Votacao1.txt";
        String votac2 = "Votacao2.txt";
        BufferedWriter grava = new BufferedWriter(new FileWriter(agrupado));
        BufferedReader leitor1 = new BufferedReader(new FileReader(votac1));
        BufferedReader leitor2 = new BufferedReader(new FileReader(votac2));
        
        Votacao[] v1 = new Votacao[5];
        Votacao[] v2 = new Votacao[5];
        Votacao[] aux = new Votacao[1];
        
        aux[0] = new Votacao();
        
        for (int i=0;i<5;i++){
            v1[i] = new Votacao();
            v2[i] = new Votacao();
            
            v1[i].numero = Integer.parseInt(leitor1.readLine());
            v1[i].nome = leitor1.readLine();
            v1[i].cand = Integer.parseInt(leitor1.readLine());
            v1[i].secao = Integer.parseInt(leitor1.readLine());
            
            v2[i].numero = Integer.parseInt(leitor2.readLine());
            v2[i].nome = leitor2.readLine();
            v2[i].cand = Integer.parseInt(leitor2.readLine());
            v2[i].secao = Integer.parseInt(leitor2.readLine());
        }
        
        // Ordenação
        for (int i=0;i<5;i++){
            for (int a=i+1;a<5;a++){
                if (v1[i].numero > v1[a].numero){
                    aux[0].numero = v1[i].numero;
                    aux[0].nome = v1[i].nome;
                    aux[0].cand = v1[i].cand;
                    aux[0].secao = v1[i].secao;
                    
                    v1[i].numero = v1[a].numero;
                    v1[i].nome = v1[a].nome;
                    v1[i].cand = v1[a].cand;
                    v1[i].secao = v1[a].secao;
                    
                    v1[a].numero = aux[0].numero;
                    v1[a].nome = aux[0].nome;
                    v1[a].cand = aux[0].cand;
                    v1[a].secao = aux[0].secao;
                }
                
                if (v2[i].numero > v2[a].numero){
                    aux[0].numero = v2[i].numero;
                    aux[0].nome = v2[i].nome;
                    aux[0].cand = v2[i].cand;
                    aux[0].secao = v2[i].secao;
                    
                    v2[i].numero = v2[a].numero;
                    v2[i].nome = v2[a].nome;
                    v2[i].cand = v2[a].cand;
                    v2[i].secao = v2[a].secao;
                    
                    v2[a].numero = aux[0].numero;
                    v2[a].nome = aux[0].nome;
                    v2[a].cand = aux[0].cand;
                    v2[a].secao = aux[0].secao;
                }
            }
        }
        
        // Inserir no arquivo conjunto com merge sort
        
        for (int i=0;i<v1.length;i++){
            for (int a=0;a<i;a++){
                if (v1[i].cand > v2[a].cand){
                    grava.write(v2[a].numero);
                    grava.newLine();
                    grava.write(v2[a].nome);
                    grava.newLine();
                    grava.write(v2[a].cand);
                    grava.newLine();
                    grava.write(v2[a].secao);
                    grava.newLine();
                }
                else{
                    grava.write(v1[i].numero);
                    grava.newLine();
                    grava.write(v1[a].nome);
                    grava.newLine();
                    grava.write(v1[i].cand);
                    grava.newLine();
                    grava.write(v1[i].secao);
                    grava.newLine();
                }
            }
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
                    sec=false;
                }
            break;

            case 5,9,10: 
                if(v2 < 5){
                    v2++;
                } else{
                    System.out.println("A Votação 2 não aceita mais Eleitores (5, 9, 10).");
                    sec=false;
                }
            break;
            
            default: sec=false;
            break;
        }
    }
}
