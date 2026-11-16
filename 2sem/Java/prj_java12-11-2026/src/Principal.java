import java.io.*;
import javax.swing.*;
import Classes.Contas;
import Classes.Movimento;
import Classes.Atualizados;
public class Principal {
    public static void main(String[] args){
        Contas[] c = new Contas[5];
        Movimento[] mo = new Movimento[10];
        Atualizados[] a = new Atualizados[5];
        Metodos me = new Metodos();
        int opc = 0;
        
        for (int i=0;i<c.length;i++){
            c[i] = new Contas();
        }
        for (int i=0;i<mo.length;i++){
            mo[i] = new Movimento();
        }
        for (int i=0;i<a.length;i++){
            a[i] = new Atualizados();
        }
        
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n"
                                                    + "1- Cadastrar Contas Correntes\n"
                                                    + "2- Cadastra Movimento\n"
                                                    + "3- Gera Contas Atualizadas\n"
                                                    + "4- Consultar Cadastros\n"
                                                    + "9- FIM"));
            switch(opc){
                case 1: me.CadastrarConta(c);
                break;
                
                case 2: me.CadastrarMovimento(mo);
                break;
                
                case 3: me.AtualizarContas(a);
                break;
                
                case 4: me.Consultar();
                break;
            }
        } while (opc!=9);
    }
}
