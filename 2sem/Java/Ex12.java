import java.util.Scanner;
public class Ex12 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        int aa, an;
        
        do {
            System.out.print("Qual seu ano de nascimento? ");
            an = s.nextInt();
            
            System.out.print("Qual o ano atual? ");
            aa = s.nextInt();
        }while (aa <= 0 || an <= 0 || aa < an);
        
        System.out.println("Idade hoje: " + (aa-an) + " anos");
        System.out.println("Idade em 17 anos: " + ((aa-an)+17) + " anos");
        s.close();
    }
}
