import javax.swing.JOptionPane;
public class Func_Ex29 {
    public static void main (String args[]){
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de investimento:\n1- poupança\n2- renda fixa"));
        float val = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor:"));
        
        if (tipo == 1){
            System.out.println("Valor em 30 dias: R$ "+ Invest(val,0.03));
        } else{
            
            if(tipo == 2) {
                System.out.println("Valor em 30 dias: R$ "+ Invest(val,0.05));
            } else{
                System.out.println("Refaça a operação. Tipo inválido.");
            }
        }
    }
    
    static double Invest(float v,double n){
        return v + v*n;
    }
}
