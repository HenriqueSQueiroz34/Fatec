import javax.swing.*;
public class Principal {
    public static void main (String args[]){
        Cidade[] cidade = new Cidade[10]; // faz a classe ser entendida como vetor
        Methods m = new Methods();
        
        // Construindo espaço na memo
        for (int i=0;i<10;i++){
            cidade[i] = new Cidade();
        }
        
        int opc = Integer.parseInt(JOptionPane.showInputDialog
            ("Estatísticas de cidades em 2020\n1- Cadastro Estatísticas\n2- Consulta por quantidade de acidentes"
                    + "\n3- Consulta por estatísticas de acidentes\n4- Acidentes acima da média das 10 cidades"
                    + "\n9- Fim do Programa"));
        
        while (opc != 9){
            switch (opc){
                case 1: m.Registra(cidade);
                    break;
                    
                case 2: m.Acidentes(cidade);
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
                    
                case 9: JOptionPane.showMessageDialog(null,"O programa foi finalizado.");
                    break;
                    
                default:
                    System.out.println("Digite uma opção válida.");
            }
        }
    }
}
