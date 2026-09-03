import javax.swing.JOptionPane;
public class Proc_Ex16 {
    static int horas,fi;
    static float desc,valh,sal;
    
    public static void main (String args[]){
        do {
            horas = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas trabalhadas: "));
            
            valh = Float.parseFloat(JOptionPane.showInputDialog("Valor da hora: "));
            
            desc = Float.parseFloat(JOptionPane.showInputDialog("Qual a porcentagem de desconto: "));
            
            fi = Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos: "));
        } while (horas <= 0 || valh <= 0 || desc < 0 || fi < 0);
        
        Salario();
        System.out.println("Salário líquído: R$ "+ sal);
    }
    
    static void Salario(){
        sal = horas * valh;
        sal = sal - sal * (desc/100);
        sal += fi*100;
    }
}
