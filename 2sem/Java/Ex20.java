import java.util.Scanner;
public class Ex20 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        int  a, b, c, delta, d, ra;
        double r1,r2;
        
        System.out.print("Dê o valor de A: ");
        a = s.nextInt();
            
        System.out.print("Dê o valor de B: ");
        b = s.nextInt();
            
        System.out.print("Dê o valor de C: ");
        c = s.nextInt();
        
        delta = (b*b) - (4 * a * c);
        
        // temp
        System.out.print(delta);
        
        if (delta > 0){
            System.out.println("2 raízes distintas reais:");
        } else if (delta < 0) {
            System.out.println("sem raízes reais.");
        } else {
            System.out.println("1 raíz real:");
        }
        
        d = 1;
        ra = 0;
        // Raíz inteira
        while (delta >= d){
            delta -= d;
            d += 2;
            ra += 1;
        }
        
        r1 = (((-1)*b) + ra)/(2.0 * a);
        r2 = (((-1)*b) - ra)/(2.0 * a);
        
        System.out.println(r1 + "\n" + r2);
        
        s.close();
    }
}
