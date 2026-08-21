import java.util.Scanner;
public class Ex06 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        int x,y,z;
        
        System.out.print("Digite o primeiro valor: ");
        x = s.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        y = s.nextInt();
        
        z=x;
        x=y;
        y=z;
        
        System.out.print(x+" "+y);
        s.close();
    }
}
