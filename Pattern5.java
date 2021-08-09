import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Enter limit : ");
        var limit = sc.nextInt();
        sc.close();
        
        for(int i=1;i<=limit;i++){
            for(int j=1;j<=5;j++){
                if(i%2==1){
                    if(j!=5){
                        System.out.print(i+" ");
                    }else{
                        System.out.print(i+1+" ");
                    }
                }else{
                    if(j==1){
                        System.out.print(i+1+" ");
                    }else{
                        System.out.print(i+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
