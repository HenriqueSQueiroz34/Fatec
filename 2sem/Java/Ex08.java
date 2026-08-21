import java.util.Scanner;
public class Ex08 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        float val;
        
        do {
            System.out.print("Qual o valor investido? R$ ");
            val = s.nextFloat();
        } while (val <= 0);
        
        System.out.print("Valor após este mês: R$ " + val*1.013);
        s.close();
    }
}
