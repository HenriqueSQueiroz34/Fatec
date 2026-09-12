import javax.swing.JOptionPane;
public class Ex04 {
    public static void main (String args[]){
        float v[] = new float[30];
        float med = 0;
        int qa = 0; // Notas acima da média
        String pos = ""; // Posições abaixo
        
        for (int i=0;i<30;i++){
            v[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor real do "+(i+1)+" termo: "));
            med += v[i];
        }
        
        med = med/30;
        
        for (int i=0;i<30;i++){
            if (v[i] > med){
                qa++;
            }
            if (v[i] < med){
                pos += i + ", ";
            }
        }
        
        System.out.println("Média: "+med);
        System.out.println("Qtd. valores acima da média: " +qa);
        System.out.println("Posições de valores abaixo da média: "+pos);
        System.out.println("Valores informados: ");
        for (int i=0;i<30;i++){
            if (i%9==0){System.out.println("");}
            System.out.print(v[i]+" ");
        }
    }
}
