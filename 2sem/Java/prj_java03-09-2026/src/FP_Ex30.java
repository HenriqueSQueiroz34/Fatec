import javax.swing.JOptionPane;
public class FP_Ex30 {
    /*
        Dê a idade de uma pessoa considerando os dias do mês e anos bissextos
    */
    static int ano=0, mes=0, dia=0;
    public static void main(String args[]){
        int an,aa,mn,ma,dn,da;
        
        do{
            an = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento: "));
            aa = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));
            mn = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês de nascimento: "));
            ma = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês atual: "));
            dn = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de nascimento: "));
            da = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia atual: "));
            
            if (an>aa){
                JOptionPane.showMessageDialog(null, "Os anos não tem concistência");
                aa=0;
            } else{
                
                if (an==aa && mn>ma){
                    JOptionPane.showMessageDialog(null, "Os meses não tem concistência");
                    ma=0;
                } else{
                    
                    if (an==aa && mn==ma && dn>da){
                        JOptionPane.showMessageDialog(null, "Os dias não tem concistência");
                        da=0;
                    }
                }
            }
        } while (an<1 || aa<1 || mn<1 || ma<1 || dn<1 || da<1);
        
        if (aa > an){
            anoB(an,aa);
        }
    }
}
