public class Func_Ex31 {
    public static void main (String args[]){
        int n = 10;
    
        while(n < 151){
            System.out.println(Tab(n));
            n+=1;
        }
    }
    
    static String Tab(int n){
        return n+": "+n*n;
    }
}
