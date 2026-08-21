import java.util.Scanner;
public class Ex16 {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in);
        
        int horas,fi;
        float desc,valh,sal;
        
        do {
            System.out.print("Quantas horas trabalhadas: ");
            horas = s. nextInt();
            
            System.out.print("Valor da hora: ");
            valh = s. nextFloat();
            
            System.out.print("Qual a porcentagem de desconto: ");
            desc = s. nextFloat();
            
            System.out.print("Quantos filhos: ");
            fi = s. nextInt();
        } while (horas <= 0 || valh <= 0 || desc < 0 || fi < 0);
        
        sal = horas * valh;
        sal = sal - sal * (desc/100);
        sal += fi*100;
        
        System.out.print("Salário líquído: R$ "+ sal);
        s.close();
    }
}
