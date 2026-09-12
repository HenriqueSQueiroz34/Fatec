import javax.swing.JOptionPane;
public class Ex16 {
    public static void main(String args[]) {
        int horas,fi;
        float desc,valh,sal;
        
        do {
            horas = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas trabalhadas: "));
            
            valh = Float.parseFloat(JOptionPane.showInputDialog("Valor da hora: "));
            
            desc = Float.parseFloat(JOptionPane.showInputDialog("Qual a porcentagem de desconto: "));
            
            fi = Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos: "));
        } while (horas <= 0 || valh <= 0 || desc < 0 || fi < 0);
        
        sal = horas * valh;
        sal = sal - sal * (desc/100);
        sal += fi*100;
        
        JOptionPane.showMessageDialog(null, "Salário líquído: R$ "+ sal);
    }
}