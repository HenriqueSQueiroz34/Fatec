import java.io.*;
import javax.swing.*;
public class Votacao {
    Votos[] v = new Votos[10];
    
    void Reset(){
        for (int i=0;i<v.length;i++){
            v[i] = new Votos();
        }
    }
    
    public int[] V1(Eleitor[] e, int[] c) throws IOException{
        Reset();
        String arquivo = "Votacao1.txt";
        BufferedWriter grava = new BufferedWriter(new FileWriter(arquivo));
        
        for (int i=0;i<10;i++){
            switch(e[i].secao){
                case 1,3,4:
                    do{
                        v[i].cand = Integer.parseInt(JOptionPane.showInputDialog(
                                                    "Eleitor "+e[i].numero+". Selecione o candidato:\n"
                                                    + "1- José\n"
                                                    + "2- Maria\n"
                                                    + "3- Branco\n"
                                                    + "4- Nulo"));
                    } while (v[i].cand < 1 || v[i].cand > 4);
                    
                    grava.write(Integer.toString(e[i].numero));
                    grava.newLine();
                    grava.write(e[i].nome);
                    grava.newLine();
                    grava.write(Integer.toString(v[i].cand));
                    grava.newLine();
                    grava.write(Integer.toString(e[i].secao));
                    grava.newLine();
                    
                    c[v[i].cand-1]++;
                break;
                
                default:
                break;
            }
        }
        return c;
    }
    
    public int[] V2(Eleitor[] e, int[] c) throws IOException{
        Reset();
        String arquivo = "Votacao2.txt";
        BufferedWriter grava = new BufferedWriter(new FileWriter(arquivo));
        
        for (int i=0;i<10;i++){
            switch(e[i].secao){
                case 5,9,10:
                    do{
                        v[i].cand = Integer.parseInt(JOptionPane.showInputDialog(
                                                    "Eleitor "+e[i].numero+". Selecione o candidato:\n"
                                                    + "1- José\n"
                                                    + "2- Maria\n"
                                                    + "3- Branco\n"
                                                    + "4- Nulo"));
                    } while (v[i].cand < 1 || v[i].cand > 4);
                    
                    grava.write(Integer.toString(e[i].numero));
                    grava.newLine();
                    grava.write(e[i].nome);
                    grava.newLine();
                    grava.write(Integer.toString(v[i].cand));
                    grava.newLine();
                    grava.write(Integer.toString(e[i].secao));
                    grava.newLine();
                    
                    c[v[i].cand-1]++;
                break;
                
                default:
                break;
            }
        }
        return c;
    }
}
