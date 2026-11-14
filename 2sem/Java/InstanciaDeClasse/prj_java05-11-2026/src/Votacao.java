import java.io.*;
import javax.swing.*;
public class Votacao {
    int[] candidatos = {1,2,3,4};
    
    int numero;
    String nome;
    int cand;
    int secao;
    
    public void V1(Eleitor[] e) throws IOException{
        String arquivo = "Votacao1.txt";
        BufferedWriter grava = new BufferedWriter(new FileWriter(arquivo));
        int vot=0;
        
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
                    
                    vot++;
                break;
                
                default:
                break;
            }
        }
    }
    
    public void V2(Eleitor[] e) throws IOException{
        String arquivo = "Votacao2.txt";
        BufferedWriter grava = new BufferedWriter(new FileWriter(arquivo));
        int vot=0;
        
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
                    
                    vot++;
                break;
                
                default:
                break;
            }
        }
    }
}
