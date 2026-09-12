import javax.swing.JOptionPane;
public class Ex07 {
    public static void main (String args[]){
        int v[] = new int[20];
        int len = v.length;
        int mai;
        for (int i=0;i<20;i++){
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o termo "+i+": "));
        }
        
        for (int a=1;a<len;a++){
            for (int i=0;i<a;i++){
                if (v[i]>v[a]){
                    mai = v[i];
                    v[i] = v[a];
                    v[a] = mai;
                }
            }
        }
        
        int op = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe se o valor existe na lista: "));
        
        for (int i=0;i<20;i++){
            if (v[i] == op){ 
                System.out.println("Acertou!");
                break;
            }
            if (i==19){System.out.println("Você errou.");}
        }
    }
}
