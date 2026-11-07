import javax.swing.*;
public class Methods {    
    public Eleitor[] Eleitores(Eleitor[] e){
        int[] secoes = {1,3,4,5,9,10};
        
        for (int i=0;i<10;i++){
            int v1=0;
            int v2=0;
            boolean tem=false; // Validador da Seção
            
            e[i].nome = JOptionPane.showInputDialog("Informe o nome do Eleitor "+(i+1)+":");
            e[i].numero = Integer.parseInt(JOptionPane.showInputDialog("Dê o número do Eleitor "+(i+1)+":"));
            e[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Dê a seção do Eleitor "+(i+1)+" entre\n"
                                                                    + "1,3,4,5,9 ou 10:"));
            for (int a=0;a<secoes.length;a++){
                if(e[i].secao == secoes[a]){
                    tem=true;
                }
            }
            
            AreaVotacao(e[i].secao,v1,v2,tem);
            
            if (!tem){
            System.out.println("Informe uma seção válida.");
                do{
                    e[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Dê a seção do Eleitor "+(i+1)+" entre\n"
                                                                        + "1,3,4,5,9 ou 10:"));
                    for (int a=0;a<secoes.length;a++){
                        if(e[i].secao == secoes[a]){
                            tem=true;
                        }
                    }
                    
                    if (tem){
                        AreaVotacao(e[i].secao,v1,v2,tem);
                    }
                } while(!tem);
            }
            
            System.out.printf("Eleitor %d cadastrado.\n",i+1);
        }
        return e;
    }
    
    public void Votacoes(Eleitor[] e){
        Votacao vota = new Votacao();
        int opc=0;
        
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("Cadastro Votação 1 e 2"));
            
            switch(opc){
                case 1: vota.V1(e);
                break;
                case 2: vota.V2(e);
            }
        }while (opc!=9);
        
        System.out.println("Votação 1 e 2 registradas.");
    }
    
    public void Agrupar(){
        
    }
    
    public void Estatistica(){
        
    }
    
    public void AreaVotacao(int e,int v1,int v2,boolean t){
        switch(e){
            case 1,3,4:
                if(v1 < 5){
                    v1++;
                } else{
                    System.out.println("A Votação 1 não aceita mais Eleitores (1, 3, 4).");
                    t=false;
                }
            break;

            case 5,9,10: 
                if(v2 < 5){
                    v2++;
                } else{
                    System.out.println("A Votação 2 não aceita mais Eleitores (5, 9, 10).");
                    t=false;
                }
            break;
        }
    }
}
