import javax.swing.JOptionPane;
public class Func_Ex37 {
    public static void main (String args[]){
        int i;
        do {
            i = Integer.parseInt(JOptionPane.showInputDialog("Informe a ordem do termo: "));
        } while (i < 1);
        
        if (i == 1){
            System.out.println("1");
        } else {
            
            if (i == 2){
                System.out.println("1\n1");
            }
                
            i-=2;
            System.out.println("1\n1\n"+Fibo(i));
        }
    }
    
    static String Fibo(int i){
        int ant=1,dep=1,num;
        String t=""; 
        while (i >= 1){
            num = ant+dep;
            t += num+"\n";
            if(i%2==0){
                ant=num;
            } else{
                dep=num;
            }
            i--;
        }
        return t;
    }
}
