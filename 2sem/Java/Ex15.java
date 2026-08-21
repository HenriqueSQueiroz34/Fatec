import java.util.Scanner;
public class Ex15 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        float a,b;
        
        do {
            System.out.print("Dê o primeiro cateto: ");
            a = s.nextFloat();
            
            System.out.print("Dê o segundo cateto: ");
            b = s.nextFloat();
        } while (a <= 0 || b <= 0);
        
        System.out.print("Hipotenusa: " + ((a*a)+(b*b)));
        s.close();
    }
}
