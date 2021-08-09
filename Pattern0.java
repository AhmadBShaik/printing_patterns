import java.util.Scanner;

public class Pattern0 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Enter limit : ");
        var limit = sc.nextInt();
        sc.close();
        
        for(int i=1;i<=limit;i++){
            System.out.print(i);
            if(i==limit){
                System.out.println();
            }else{
                System.out.print(",");
            }
        }



    }
}
