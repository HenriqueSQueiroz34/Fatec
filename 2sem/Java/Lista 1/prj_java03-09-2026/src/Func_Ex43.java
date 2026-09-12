public class Func_Ex43 {
    public static void main (String args[]){
        double ana = 1.1;
        double maria = 1.5;

        System.out.println(Anos(ana,maria));
    }
    
    static String Anos(double a, double m){
        int d=0;
        do {
            a += 0.03;
            m += 0.02;
            d+=1;
            System.out.println(a+" "+m);
        } while (a < m);
        
        return "Anos até Ana ser maior que Maria: "+d;
    }
}
