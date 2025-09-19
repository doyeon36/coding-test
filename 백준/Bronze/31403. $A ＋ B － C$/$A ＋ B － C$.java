import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
         int A=in.nextInt();
         int B=in.nextInt();
        int C=in.nextInt();
        String d="";
        d+=A;
        d+=B;
        int e=Integer.parseInt(d);

        System.out.println(A+B-C);
        System.out.println(e-C);
    }    
}