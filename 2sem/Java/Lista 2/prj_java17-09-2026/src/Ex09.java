public class Ex09 {
    public static void main (String args[]){
        int mat[][] = new int[4][4];
        int obg = 1;
        
        for (int l=0;l<4;l++){
            for (int c=0;c<4;c++){
                if (l == c){
                    mat[l][c] = obg;
                    obg*=4;
                } else {
                    mat[l][c] =(int)(Math.random() * 100);
                }
            }
        }
        Mostra(mat);
    }
    
    static void Mostra (int mat[][]){
        System.out.println("A matriz ficou:");
        
        for (int l=0;l<4;l++){
            for (int c=0;c<4;c++){
                System.out.print(mat[l][c] + " ");
            }
            System.out.println(" ");
        } 
    }
}
