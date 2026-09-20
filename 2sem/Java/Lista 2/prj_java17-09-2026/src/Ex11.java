public class Ex11 {
    public static void main (String args[]){
        int mat[][] = new int[8][8];
        
        for (int i=1;i<=4;i++){
            for (int l=(i-1);l<=(8-i);l++){
                for (int c=(i-1);c<=(8-i);c++){
                    mat[l][c] = i;
                }
            }
        }
        
        Mostra(mat);
    }
    
    static void Mostra (int m[][]){
        for (int l=0;l<8;l++){
            for (int c=0;c<8;c++){
                System.out.print(m[l][c] + " ");
            }
            System.out.println();
        }
    }
}
