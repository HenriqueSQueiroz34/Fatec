public class Func_Ex41 {
    public static void main (String args[]){
        for (int a=1;a<7;a++){
            for (int b=1;b<7;b++){
                if (a+b==7){System.out.println(Dados(a,b));}
            }
        }
    }
    
    static String Dados(int a, int b){
        return "Dados com resultado em 7: "+a+" e "+b;
    }
}
