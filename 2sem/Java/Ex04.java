import java.util.Scanner;
public class Ex04 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        int cel;
        
        do {
            System.out.print("Qual a temperatura (ºC): ");
            cel = s.nextInt();
        } while (cel <= 0);
        
        System.out.print("Temperatura em F: " + (float) (9*cel + 160)/5);
        s.close();
    }
}
