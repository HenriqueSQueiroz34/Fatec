import javax.swing.*;
public class Ex37 {
    public static void main (String args[]){
        int i, ant, dep,num;
        do {
            i = Integer.parseInt(JOptionPane.showInputDialog("Informe a ordem do termo: "));
        } while (i < 1);
        
        if (i == 1){
            System.out.println("1");
        } else {
            
            if (i == 2){
                System.out.println("1\n1");
            }
                
            ant=1;
            dep=1;
            i-=2;
            System.out.println("1\n1");
            while (i >= 1){
                num = ant+dep;
                System.out.println(num);
                if(i%2==0){
                    ant=num;
                } else{
                    dep=num;
                }
                i--;
            }
        }
    }
}
