import javax.swing.JOptionPane;
public class Func_Ex28 {
    public static void main (String args[]){
        double preco,media;
        preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor atual do produto? "));
        media = Double.parseDouble(JOptionPane.showInputDialog("Qual a média mensal do produto? "));
        
        if (media >= 1000 && preco >= 80){
            preco -= preco*0.05;
        } else{
            
            if (media < 500 && preco < 30){
                preco += preco*0.1;
            } else{
                if (media >= 500 && media < 1000 && preco >= 30 && preco < 80){
                    preco += preco*0.15;
                }
            }
        }
        
        System.out.println(Valor(preco));
    }
    
    static String Valor(double preco){
        return "O produto após alteração custará R$ "+preco;
    }
}
