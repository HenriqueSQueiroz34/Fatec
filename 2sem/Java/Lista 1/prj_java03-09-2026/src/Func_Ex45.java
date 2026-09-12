public class Func_Ex45 {
    public static void main (String args[]){
        double s=1;
        
        System.out.println(Res(s));
    }
    
    static String Res(double s){
        for (int i=2;i<16;i+=2){
            s-= (double)i/(i*i);
            s+= (double)i+1/((i+1)*(i+1));
        }
        return "Resultado: "+s;
    }
}
