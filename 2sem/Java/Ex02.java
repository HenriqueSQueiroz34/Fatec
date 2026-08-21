import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        
        double sal;
        
        do {
        System.out.print("Dê o salário do funcionário: R$ ");
        sal = s.nextDouble();
        } while (sal <= 0);
        
        System.out.print("Salário reajustado: R$ " + sal*1.15);
        s.close();
    }
}
