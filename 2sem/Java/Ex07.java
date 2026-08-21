import java.util.Scanner;
public class Ex07 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        int c,l,a;
        
        do {
            System.out.print("Dê o comprimento: ");
            c = s.nextInt();
            
            System.out.print("Dê a largura: ");
            l = s.nextInt();
            
            System.out.print("Dê a altura: ");
            a = s.nextInt();
        } while (c <=0 || l <= 0 || a <= 0);
        
        System.out.print("Área: " + c*l*a);
        s.close();
    }
}
