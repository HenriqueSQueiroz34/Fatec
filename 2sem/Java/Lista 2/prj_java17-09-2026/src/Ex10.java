public class Ex10 {
    public static void main (String args[]){
        long mat[][] = new long[8][8];
        long a = 1, s=0;
        
        for (int l=0;l<8;l++){
            for (int c=0;c<8;c++){
                mat[l][c] = a;
                s += a;
                a*=2;
            }
        }
        
        Matriz(mat);
        System.out.println("Soma total: "+s);
    }
    
    static void Matriz (long mat[][]){
        for (int l=0;l<8;l++){
            for (int c=0;c<8;c++){
                System.out.println(mat[l][c]);
            }
            System.out.print("\n");
        }
    }
}
