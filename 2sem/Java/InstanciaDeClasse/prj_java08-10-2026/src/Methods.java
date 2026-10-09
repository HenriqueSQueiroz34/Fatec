import javax.swing.*;
public class Methods {
    // Todos os methods recebem a lista
    int i;
    
    // Ao registrar valores, sempre retornar a lista
    public Cidade[] Registra(Cidade[] cidade){
        
        for (i=0;i<10;i++){
            cidade[i].codCid = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da cidade "+(i+1)+": "));
            cidade[i].nomeCid = JOptionPane.showInputDialog("Qual o nome da cidade? ");
            cidade[i].acid = Integer.parseInt(JOptionPane.showInputDialog("Quantos acidentes aconteceram no ano passado? "));
        }
        
        return cidade;
    }
    
    public void Acidentes(Cidade[] cidade){
        for (i=0;i<10;i++){
            if (cidade[i].acid > 100 || cidade[i].acid < 500){
                System.out.println("ID: "+cidade[i].codCid+"\nAcidentes: "+cidade[i].acid+"\n********\n");
            }
        }
    }
}
