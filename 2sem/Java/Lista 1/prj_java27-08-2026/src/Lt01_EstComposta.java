import javax.swing.*;
public class Lt01_EstComposta {
    public static void main (String args[]){
        int num1,num2,num3;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        
        int soma = num1+num2+num3;
        System.out.println("A soma dos 3 valores é: "+soma);
        if (soma > 100) {
            System.out.println("A soma é maior que 100");
        }
        else {
            System.out.println("A soma é menor ou igual a 100");
        }
    }
}
