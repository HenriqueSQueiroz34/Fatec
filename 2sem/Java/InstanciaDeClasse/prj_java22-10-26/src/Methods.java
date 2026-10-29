import java.io.*;
import javax.swing.*;
public class Methods{
    // Todos os methods recebem a lista
    int i;
    
    String file = "Acidentes.txt";
    
    // Ao registrar valores, sempre retornar a lista
    public Cidade[] FCadastraEstatistica(Cidade[] cidade) throws IOException{
        BufferedWriter grava = new BufferedWriter(new FileWriter(file));
        
        for (i=0;i<10;i++){
            cidade[i].codCid = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da cidade "+(i+1)+": "));
            cidade[i].nomeCid = JOptionPane.showInputDialog("Qual o nome da cidade "+(i+1)+"?");
            cidade[i].acid = Integer.parseInt(JOptionPane.showInputDialog("Quantos acidentes aconteceram no ano passado? "));
        
            // gravando no arquivo final
            grava.write(Integer.toString(cidade[i].codCid));
            grava.newLine();
            grava.write(cidade[i].nomeCid);
            grava.newLine();
            grava.write(Integer.toString(cidade[i].acid));
            grava.newLine();
        }
        
        grava.close();
        return cidade;
    }
    
    public void PQtdAcidentes(Cidade[] cidade) throws IOException{
        BufferedReader leitura = new BufferedReader(new FileReader(file));
        
        System.out.println("Cidades com quantidade de acidentes entre 100 e 500:");
        String acidentes = "";
                
        for (i=0;i<10;i++){
            
            //lendo o arquivo
            cidade[i].codCid = Integer.parseInt(leitura.readLine());
            cidade[i].nomeCid = leitura.readLine();
            cidade[i].acid = Integer.parseInt(leitura.readLine());
            
            if (cidade[i].acid > 100 && cidade[i].acid < 500){
                acidentes += Integer.toString(cidade[i].codCid) + ": ";
                acidentes += Integer.toString(cidade[i].acid) + "\n";
            }
        }
        
        if (acidentes == ""){
            acidentes = "Nenhuma cidade registrada entra na média.";
        }
        
        leitura.close();
        System.out.println(acidentes);
    }
    
    // menor e maior num de acidentes
    public void PMaiorMenor(Cidade[] cidade) throws IOException{
        BufferedReader leitura = new BufferedReader(new FileReader(file));
        
        int men=0,mai=0;
        
        for (i=0;i<10;i++){
            
            //lendo o arquivo
            cidade[i].codCid = Integer.parseInt(leitura.readLine());
            cidade[i].nomeCid = leitura.readLine();
            cidade[i].acid = Integer.parseInt(leitura.readLine());
            
            if (i==0){
                men=cidade[i].acid;
                mai=cidade[i].acid;
            }
            
            if (men > cidade[i].acid) {men = cidade[i].acid;}
            if (mai < cidade[i].acid) {mai = cidade[i].acid;}
        }
        
        System.out.println("Quantidade de acidentes\nMaior: "+mai+"\nMenor: "+men);
        leitura.close();
    }
    
    public void PAcima(Cidade[] cidade) throws IOException{
        BufferedReader leitura = new BufferedReader(new FileReader(file));
        
        float media = 0;
        
        for (int i=0;i<10;i++){
            //lendo o arquivo
            cidade[i].codCid = Integer.parseInt(leitura.readLine());
            cidade[i].nomeCid = leitura.readLine();
            cidade[i].acid = Integer.parseInt(leitura.readLine());
            
            media += cidade[i].acid;
        }
        
        media =(float) media/10;
        
        System.out.println("Média de acidentes no Registro: "+media);
        System.out.println("Cidades Acima da média:");
        
        for (int i=0;i<10;i++){
            if (cidade[i].acid > media){
                System.out.println(cidade[i].nomeCid+": "+cidade[i].acid);
            }
        }
        
        leitura.close();
    }
}