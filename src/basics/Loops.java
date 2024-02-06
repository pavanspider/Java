package basics;

public class Loops {

    public static void loops(){
        for (int i=1;i<=10;i++){
            int j=10;
            System.out.printf("%d * %d = %d",i,j,i*j).println();
        }
    }
    public static void main(String[] args) {
        Loops.loops();
    }
}
