import javax.swing.*;
public class Methods {
    // Todos os methods recebem a lista
    int i;
    
    // Ao registrar valores, sempre retornar a lista
    public Cidade[] FCadastraEstatistica(Cidade[] cidade){
        
        for (i=0;i<10;i++){
            cidade[i].codCid = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da cidade "+(i+1)+": "));
            cidade[i].nomeCid = JOptionPane.showInputDialog("Qual o nome da cidade? ");
            cidade[i].acid = Integer.parseInt(JOptionPane.showInputDialog("Quantos acidentes aconteceram no ano passado? "));
        }
        
        return cidade;
    }
    
    public void PQtdAcidentes(Cidade[] cidade){
        String acidentes = "";
                
        for (i=0;i<10;i++){
            if (cidade[i].acid > 100 && cidade[i].acid < 500){
                acidentes = "ID: "+cidade[i].codCid+"\nAcidentes: "+cidade[i].acid+"\n********";
            }
        }
        
        if (acidentes == ""){
            acidentes = "Nenhuma cidade registrada entra na média de 100 a 500 acidentes.";
        }
        
        System.out.println(acidentes);
    }
    
    // menor e maior num de acidentes
    public void PMaiorMenor(Cidade[] cidade){ 
        int men=0,mai=0;
        
        for (i=0;i<10;i++){
            
            if (i==0){
                men=cidade[i].acid;
                mai=cidade[i].acid;
            }
            
            if (men > cidade[i].acid) {men = cidade[i].acid;}
            if (mai < cidade[i].acid) {mai = cidade[i].acid;}
        }
        
        System.out.println("Quantidade de acidentes\nMaior: "+mai+"\nMenor: "+men);
    }
    
    public void PAcima(Cidade[] cidade){
        float media = 0;
        
        for (int i=0;i<10;i++){
            media += cidade[i].acid;
        }
        
        media =(float) media/10;
        
        System.out.println("Média de acidentes no Registro: "+media);
        System.out.println("Cidades Acima da média:");
        
        for (int i=0;i<10;i++){
            if (cidade[i].acid > media){
                System.out.println(cidade[i].nomeCid);
            }
        }
    }
}
