public class Ex39 {
    public static void main (String args[]){
        long i=1;
        long s=0;
        
        for (int c=1;c < 65;c++){
            s+=i;
            i*=2;
            System.out.println(c+": "+i);
        }
        
        System.out.println("Grãos no tabuleiro: "+s);
    }
}
