import javax.swing.*;
public class Ex29 {
    public static void main (String args[]){
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de investimento:\n1- poupança\n2- renda fixa"));
        float val = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor:"));
        
        if (tipo == 1){
            System.out.println("Valor em 30 dias: R$ "+ (val +val*0.03));
        } else{
            
            if(tipo == 2) {
                System.out.println("Valor em 30 dias: R$ "+ (val +val*0.05));
            } else{
                System.out.println("Refaça a operação. Tipo inválido.");
            }
        }
    }
}
