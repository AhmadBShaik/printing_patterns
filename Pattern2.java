import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Enter limit : ");
        var limit = sc.nextInt();
        sc.close();
        
        for (int i=0;i<limit;i++){
            for(int j=0;j<=i;j++){
                int result = 65+j;
                System.out.printf("%c ",result);
            }
            System.out.println();
        }



    }
}
