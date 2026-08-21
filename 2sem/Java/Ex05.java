import java.util.Scanner;
public class Ex05 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        int a,b,c,delta;
        
        System.out.print("Dê o valor de A: ");
        a = s.nextInt();
        
        System.out.print("Dê o valor de B: ");
        b = s.nextInt();
        
        System.out.print("Dê o valor de C: ");
        c = s.nextInt();
        
        delta = (b*b) - (4 * a * c);
        
        if (delta > 0){
            System.out.println("2 raízes distintas reais.");
        } else if (delta < 0) {
            System.out.println("sem raízes reais.");
        } else {
            System.out.println("1 raíz real.");
        }
        
        s.close();
    }
}
