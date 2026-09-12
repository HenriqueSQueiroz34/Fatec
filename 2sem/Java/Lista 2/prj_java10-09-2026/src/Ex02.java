import javax.swing.JOptionPane;
public class Ex02 {
    public static void main (String args[]){
        int v[] = new int[100];
        int men=0, mai=0, m=0;
        
        for (int i=0;i<100;i++){
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo "+(i+1)+": "));
            
            if (i == 0){
                men=v[i];
                mai=v[i];
            } else {
                
                if (v[i] < men){
                    men = v[i];
                }
                if (v[i] > mai){
                    mai = v[i];
                }
            }
            
            m += v[i];
        }
        
        System.out.println("Média dos valores: "+m/100);
        System.out.println("Maior: "+mai+"\nMenor: "+men);
    }
}
