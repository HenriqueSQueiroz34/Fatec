import java.util.Scanner;
public class Ex10 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        float a,b,dif;
        
        System.out.print("Informe um valor real: ");
        a = s.nextFloat();
        
        System.out.print("Informe outro valor real: ");
        b = s.nextFloat();
        
        dif = a-b;
        
        if (dif < 0) dif *=-1;
        
        System.out.print("A diferença entre os números é "+dif);
        s.close();
    }
}
