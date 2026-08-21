import java.util.Scanner;
public class Ex13 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        float q;
        
        do {
            System.out.print("Quantos kg tem de alimento? ");
            q = s.nextFloat();
        } while (q <= 0);
        
        q *= 1000; // kg -> g
        
        for (int d=1; q >= 50 ;d++){
            q -= 50;
            
            if (q < 50){
                System.out.print("Dias de alimento: " + d);
            }
        }
        s.close();
    }
}
