import java.util.Scanner;
public class Ex03 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        int base, alt;
        
        do {
        System.out.print("Dê a base do triângulo: ");
        base = s.nextInt();
        
        System.out.print("Dê a altura do triângulo: ");
        alt = s.nextInt();
        } while (base <= 0 || alt <= 0);
        
        System.out.print("Área do triângulo: " + (base * alt) / 2);
        
        s.close();
    }
}
