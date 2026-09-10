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
            mn = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês de nascimento: "));
            dn = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de nascimento: "));
            aa = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));
            ma = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês atual: "));
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
        } while (an<1 || aa<1 || mn<1 || mn>12 || ma<1 || ma>12 ||
                dn<1 || dn>diasN(an,mn) ||
                da<1 || da>diasA(aa,ma));
        
        System.out.println(Idade(an,aa,mn,ma,dn,da));
    }
    
    static int diasN(int an,int mn){
        int dias=0;
        if (an%4==0){
            if (mn == 2){dias = 30;}
        } else{
            if (mn == 2){dias = 29;}
        }
        
        if (mn==1 || mn==3 || mn==5 || mn==7 || mn==8 || mn==10 || mn==12){
            dias = 31;
        } else{
            if (mn==4 || mn==6 || mn==9 || mn==11){dias = 30;}
        }
        return dias;
    }
    
    static int diasA(int aa,int ma){
        int dias=0;
        if (aa%4==0){
            if (ma == 2){dias = 30;}   
        } else{
            if (ma == 2){dias = 29;}
        }
        
        if (ma==1 || ma==3 || ma==5 || ma==7 || ma==8 || ma==10 || ma==12){
            dias = 31;
        } else{
            if (ma==4 || ma==6 || ma==9 || ma==11){dias = 30;}
        }
        return dias;
    }
    
    static String Idade(int an,int aa,int mn,int ma,int dn,int da){
        ano = aa-an;
        mes = ma-mn;
        dia = da-dn;
        
        while (an<aa){
            if (dia < 0){
                mes--;
                dia = dia + diasN(an,mn);
            }
            
            if (mes < 0){
                mes = mes + 12;
            }
            
            an++;
        }
        
        if (aa-1==an && ma==1 && mn==12 && da==1 && dn==31){
            ano = 0;
            mes = 0;
            dia = 1;
        }
        
        return "Você tem "+ano+" anos, "+mes+" meses e "+dia+" dias de vida.";
    }
}