public class Ex01 {
    public static void main (String args[]){
        int n = 1;
        
        System.out.println("A soma dos numerais de 1 a 100 fica: "+Soma(n));
    }
    
    static int Soma (int n){
        if (n < 100){
            n += Soma(n+1);
        }
        return n;
    }
}
