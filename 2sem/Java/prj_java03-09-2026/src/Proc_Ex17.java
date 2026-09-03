import javax.swing.JOptionPane;
public class Proc_Ex17 {
    static int tempo, vel;
    static double litros;
        
    public static void main (String args[]){
        do{
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo do percurso (min): "));
        
        vel = Integer.parseInt(JOptionPane.showInputDialog("Dê a velocidade média (km/h): "));
        
        } while (tempo <= 0 || vel <=0);
        
        Percorre();
        System.out.println("Litros gastos: "+ litros);
    }
    
    static void Percorre(){
        litros = ((tempo/60) * vel) / 12.0;
    }
}
