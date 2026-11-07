import java.io.*;
import javax.swing.*;
public class Votacao {
    int[] candidatos = {1,2,3,4};
    
    String nome;
    int numero;
    int cand;
    int secao;
    
    void Votacao(){
        this.nome = "";
        this.numero = 0;
        this.cand = 0;
        this.secao = 0;
    }
    
    public void V1(Eleitor[] e) throws IOException{
        String arquivo = "Votacao1.txt";
        BufferedWriter grava = new BufferedWriter(new FileWriter(arquivo));
        Votacao[] v = new Votacao[5];
        int vot=0;

        for (int i=0;i<v.length;i++){
            v[i] = new Votacao();
        }
        
        for (int i=0;i<10;i++){
            switch(e[i].secao){
                case 1,3,4:
                    do{
                        v[vot].nome = e[i].nome;
                        v[vot].numero = e[i].numero;
                        v[vot].cand = Integer.parseInt(JOptionPane.showInputDialog(
                                                    "Candidato "+v[vot].numero+". Selecione o candidato:\n"
                                                    + "1- José\n"
                                                    + "2- Maria\n"
                                                    + "3- Branco\n"
                                                    + "4- Nulo"));
                        v[vot].secao = e[i].secao;
                    } while (v[vot].cand < 1 || v[vot].cand > 4);
                    vot++;
                break;
                
                default:
                break;
            }
        }
        
        for (int i=0;i<v.length;i++){
            grava.write(v[i].numero);
            grava.newLine();
            grava.write(v[i].nome);
            grava.newLine();
            grava.write(v[i].cand);
            grava.newLine();
            grava.write(v[i].secao);
            grava.newLine();
        }
    }
    
    public void V2(Eleitor[] e) throws IOException{
        String arquivo = "Votacao2.txt";
        BufferedWriter grava = new BufferedWriter(new FileWriter(arquivo));
        Votacao[] v = new Votacao[5];
        int vot=0;
        
        for (int i=0;i<v.length;i++){
            v[i] = new Votacao();
        }
        
        for (int i=0;i<10;i++){
            switch(e[i].secao){
                case 5,9,10:
                    do{
                        v[vot].nome = e[i].nome;
                        v[vot].numero = e[i].numero;
                        v[vot].cand = Integer.parseInt(JOptionPane.showInputDialog(
                                                    "Candidato "+v[vot].numero+". Selecione o candidato:\n"
                                                    + "1- José\n"
                                                    + "2- Maria\n"
                                                    + "3- Branco\n"
                                                    + "4- Nulo"));
                        v[vot].secao = e[i].secao;
                    } while (v[vot].cand < 1 || v[vot].cand > 4);
                    vot++;
                break;
                
                default:
                break;
            }
        }
        
        for (int i=0;i<v.length;i++){
            grava.write(v[i].numero);
            grava.newLine();
            grava.write(v[i].nome);
            grava.newLine();
            grava.write(v[i].cand);
            grava.newLine();
            grava.write(v[i].secao);
            grava.newLine();
        }
    }
}
