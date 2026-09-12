public class Func_Ex42 {
    public static void main (String args[]){
        int b=1;
        float s=0;
        
        System.out.printf("Total: %.2f\n",Soma(s,b));
    }
    
    static float Soma(float s, int b){
        for (int a=1;a<51;a++){
            s += (float)a/b;
            b +=2;
        }
        return s;
    }
}
