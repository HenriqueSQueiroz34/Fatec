import javax.swing.JOptionPane;
public class Ex01 {
    static int media=0;
    static int imp=0, num=1;
    public static void main (String args[]){
        int vet[] = new int[50];
        
        for (int i=0;i<50;i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição "+(i+1)+": "));
            
            if (vet[i] >= 10 && vet[i] <= 200){
                Med10200(vet[i]);
            }
            if (vet[i]%2==1){
                Impares(vet[i]);
            }
        }
        
        System.out.println("Média dos valores entre 10 e 200: "+(float)media/num);
        System.out.println("Soma dos ímpares: "+imp);
    }
    
    static void Med10200 (int n){
        media += n;
        num++;
    }
    
    static void Impares (int n){
        imp += n;
    }
}
