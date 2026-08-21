import java.util.Scanner;
public class Ex09 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        int a,b;
        
        System.out.print("Digite o primeiro valor: ");
        a = s.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        b = s.nextInt();
        
        System.out.print("Soma dos quadrados: " + (a*a+b*b));
    }
}
