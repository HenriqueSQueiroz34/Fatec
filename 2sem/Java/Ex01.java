import java.util.Scanner;
public class Ex01 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        int lado;
        
        do {
        System.out.print("Informe o lado do quadrado: ");
        lado = s.nextInt();
        } while (lado <= 0);
        
        System.out.print("Área do quadrado: " + lado*lado);
        s.close();
    }
}
