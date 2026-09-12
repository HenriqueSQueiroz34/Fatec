public class Ex43 {
    public static void main (String args[]){
        double ana = 1.1;
        double maria = 1.5;
        int d=0;
        
        do {
            ana += 0.03;
            maria += 0.02;
            d+=1;
            System.out.println(ana+" "+maria);
        } while (ana < maria);

        System.out.println("Anos até Ana ser maior que Maria: "+d);
    }
}
