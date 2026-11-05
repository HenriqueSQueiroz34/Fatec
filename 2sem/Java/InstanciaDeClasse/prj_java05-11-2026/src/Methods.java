import javax.swing.*;
public class Methods {    
    public Eleitor[] Eleitores(Eleitor[] e){
        int[] secoes = {1,3,4,5,9,10};
        
        for (int i=0;i<10;i++){
            boolean tem=false; // Validador da Seção
            
            e[i].nome = JOptionPane.showInputDialog("Informe o nome do Eleitor "+(i+1)+":");
            e[i].numero = Integer.parseInt(JOptionPane.showInputDialog("Dê o número do Eleitor "+(i+1)+":"));
            e[i].secao = Integer.parseInt(JOptionPane.showInputDialog("\"Dê a seção do Eleitor "+(i+1)+" entre\n"
                                                                    + "1,3,4,5,9 ou 10:"));
            for (int a=0;a<secoes.length;a++){
                if(e[i].secao == secoes[a]){
                    tem=true;
                }
            }
            
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
                } while(!tem);
            }
            System.out.printf("Eleitor %d cadastrado.\n",i+1);
            
            // Verificar limite de 5 eleitores por Votação
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
}
