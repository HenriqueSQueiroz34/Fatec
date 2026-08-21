import java.util.Scanner;
public class Ex11 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        float raio;
        
        do{
            System.out.print("Informe o raio da circunferência: ");
            raio = s.nextFloat();
        } while (raio <= 0);
        
        System.out.print("O comprimento da circunferência é "+ (raio*2*3.14));
        s.close();
    }
}
