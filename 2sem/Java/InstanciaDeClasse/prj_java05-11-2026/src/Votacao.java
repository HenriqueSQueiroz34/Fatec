import java.io.*;
import javax.swing.*;
public class Votacao {
    
    int numero;
    String nome;
    int cand;
    int secao;
    
    void Votacao(){
        this.numero = 0;
        this.nome = "";
        this.cand = 0;
        this.secao = 0;
    }
    
    public int[] V1(Eleitor[] e, int[] c) throws IOException{
        String arquivo = "Votacao1.txt";
        BufferedWriter grava = new BufferedWriter(new FileWriter(arquivo));
        
        for (int i=0;i<10;i++){
            switch(e[i].secao){
                case 1,3,4:
                    do{
                        cand = Integer.parseInt(JOptionPane.showInputDialog(
                                                    "Eleitor "+e[i].numero+". Selecione o candidato:\n"
                                                    + "1- José\n"
                                                    + "2- Maria\n"
                                                    + "3- Branco\n"
                                                    + "4- Nulo"));
                    } while (cand < 1 || cand > 4);
                    
                    grava.write(Integer.toString(e[i].numero));
                    grava.newLine();
                    grava.write(e[i].nome);
                    grava.newLine();
                    grava.write(Integer.toString(cand));
                    grava.newLine();
                    grava.write(Integer.toString(e[i].secao));
                    grava.newLine();
                    
                    c[cand-1]++;
                break;
                
                default:
                break;
            }
        }
        return c;
    }
    
    public int[] V2(Eleitor[] e, int[] c) throws IOException{
        String arquivo = "Votacao2.txt";
        BufferedWriter grava = new BufferedWriter(new FileWriter(arquivo));
        
        for (int i=0;i<10;i++){
            switch(e[i].secao){
                case 5,9,10:
                    do{
                        cand = Integer.parseInt(JOptionPane.showInputDialog(
                                                    "Eleitor "+e[i].numero+". Selecione o candidato:\n"
                                                    + "1- José\n"
                                                    + "2- Maria\n"
                                                    + "3- Branco\n"
                                                    + "4- Nulo"));
                    } while (cand < 1 || cand > 4);
                    
                    grava.write(Integer.toString(e[i].numero));
                    grava.newLine();
                    grava.write(e[i].nome);
                    grava.newLine();
                    grava.write(Integer.toString(cand));
                    grava.newLine();
                    grava.write(Integer.toString(e[i].secao));
                    grava.newLine();
                    
                    c[cand-1]++;
                break;
                
                default:
                break;
            }
        }
        return c;
    }
}
