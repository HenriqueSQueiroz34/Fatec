import javax.swing.JOptionPane;
public class Ex03 {
    public static void main (String args[]){
        int v1[] = new int[3];
        int v2[] = new int[3];
        int v3[] = new int[6];
        
        for (int i=0;i<3;i++){
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor "+(i+1)+" do vetor 1: "));
            v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor "+(i+1)+" do vetor 2: "));
            
            v3[i] = v1[i];
            v3[i+3] = v2[i];
        }
        
        v3 = Troca(v3);
        
        for (int i=0;i<6;i++){System.out.println(v3[i]);}
    }
    
    // Testar lógica
    static int[] Troca (int v[]){
        int mai, len = v.length;
        for (int a=1;a<len;a++){
            for (int i=0;i<a;i++){
                if (v[i]>v[a]){
                    mai = v[i];
                    v[i] = v[a];
                    v[a] = mai;
                }
            }
        }
        return v;
    }
}
