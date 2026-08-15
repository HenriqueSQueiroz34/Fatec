import java.util.Scanner;
public class Ex18 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        int a,b,dif;
        
        do{
            System.out.print("Informe o primeiro valor: ");
            a = s.nextInt();
            
            System.out.print("Qual o segundo valor: ");
            b = s.nextInt();
            
            System.out.println();
            
        } while (a <=0 || b <=0);
        
        dif = a - b;
        
        if (b > a){
            dif = dif * (-1);
        }
        
        System.out.println("A diferença entre os valores é " + dif);
        
        s.close();
    }
}
