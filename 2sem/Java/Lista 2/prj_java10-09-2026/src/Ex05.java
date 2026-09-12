import javax.swing.JOptionPane;
public class Ex05 {
    public static void main (String args[]){
        int v[] = new int[20];
        int soma = 0;
        
        for (int i=0;i<20;i++){
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo "+(i+1)+": "));
            soma += v[i] - v[19-i];
        }
        
        System.out.println("A soma dos termo é "+soma);
    }
}
