import java.util.Scanner;
public class Ex17 {  
    public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);
        
        int tempo, vel;
        double litros;
        
        do{
        System.out.print("Informe o tempo do percurso (min): ");
        tempo = s.nextInt();
        
        System.out.print("Dê a velocidade média (km/h): ");
        vel = s.nextInt();
        
        System.out.println("");
        } while (tempo <= 0 || vel <=0);
        
        litros = ((tempo/60) * vel) / 12.0;
        
        System.out.println("Litros gastos: "+ litros);
        
        s.close();
    }
}