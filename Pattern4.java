import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Enter limit : ");
        var limit = sc.nextInt();
        sc.close();
        
        for(int i=1;i<=limit;i++){
            for(int j=i;j<=limit;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }



    }
}
