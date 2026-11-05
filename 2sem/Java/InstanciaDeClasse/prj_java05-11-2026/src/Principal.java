import java.io.*;
import javax.swing.*;
public class Principal {
    public static void main (String[] args) throws IOException{
        Methods m = new Methods();
        Eleitor[] e = new Eleitor[10];
        int opc=0;
        
        for (int i=0;i<10;i++){
            e[i] = new Eleitor();
        }
        
        while(opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL\n"
                                                + "1- Cadastrar Eleitor\n2- Cadastrar Votação 1 e 2\n"
                                                + "3- Agrupar Apuração\n4- Menu Estatística\n"
                                                + "9- Fim"));
            switch(opc){
                case 1: m.Eleitores(e);
                break;
                
                case 2: m.Votacoes(e);
                break;
                
                case 3: m.Agrupar();
                break;
                
                case 4: m.Estatistica();
                break;
            }
        }
        for (int i=0;i<10;i++){
            System.out.printf("Nome: %s // Numero: %d // Secao: %d \n",e[i].nome,e[i].numero,e[i].secao);
        }
    }
}
