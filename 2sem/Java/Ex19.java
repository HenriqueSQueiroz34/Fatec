import java.util.Scanner;
public class Ex19 {

    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        double a,b;
        
        do {
            
            System.out.print("Informe o primeiro valor: ");
            a = s.nextInt();
            
            System.out.print("Digite o segundo valor: ");
            b = s.nextInt();
            
        } while (a <= 0 || b <= 0);
        
        if (b > a){
            System.out.println("O maior deles é " + b);
        } else if (a > b){
            System.out.println("O maior deles é " + a);
        } else {
            System.out.println("Os valores são iguais");
        }
        
        s.close();
    }
}
