import javax.swing.*;
import Classes.Contas;
import Classes.Movimento;
import Classes.Atualizados;
public class Metodos {
    public Contas[] CadastrarConta(Contas[] c){
        return c;
    }
    
    public Movimento[] CadastrarMovimento(Movimento[] mo){
        return mo;
    }
    
    public Atualizados[] AtualizarContas(Atualizados[] a){
        return a;
    }
    
    public void Consultar(){
        Consultas con = new Consultas();
        int opc = 0;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("Consultar Cadastros\n"
                                                    + "1- Contas Correntes\n"
                                                    + "2- Movimento\n"
                                                    + "3- Atualizadas\n"
                                                    + "9- FIM"));
            switch(opc){
                case 1: con.Conta();
                break;
                
                case 2: con.Movimento();
                break;
                
                case 3: con.Atualizados();
                break;
            }
        } while (opc!=9);
    }
}
