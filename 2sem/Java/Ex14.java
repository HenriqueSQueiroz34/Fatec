import java.util.Scanner;
public class Ex14 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        int a,b;
        
        do {
            System.out.print("Qual o primeiro ângulo? ");
            a = s.nextInt();
            
            System.out.print("Qual o segundo ângulo? ");
            b = s.nextInt();
        } while (a <= 0 || b <= 0 || a+b >= 180);
        
        System.out.print("Terceiro ângulo: "+ (180-(a+b)));
        s.close();
    }
}
