import javax.swing.JOptionPane;
public class Ex06 {
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
        
        System.out.println("Ordenando: ");
        for (int i=0;i<20;i++){
            System.out.print(v[i]+ " ");
        }
    }
}
