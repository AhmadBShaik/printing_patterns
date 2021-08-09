import java.util.Scanner;

public class Pattern1{
    public static void main(String args[]){
        var sc = new Scanner(System.in);
        System.out.print("Enter limit : ");
        var limit = sc.nextInt();
        sc.close();
        for(int i=1;i<=limit;i++){
            for(int j=1;j<=i;j++){
                if(i%2==1){
                    System.out.print("* ");
                }else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

    }
}


