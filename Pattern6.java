import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Enter limit : ");
        var limit = sc.nextInt();
        sc.close();
        int num;
        for(int i=1;i<=limit;i++){
            for(int j=1;j<=5;j++){
                if(i%2==1){
                    if(j!=5){
                        num=i;        
                    }else{
                        num=i+1;
                    }
                    if(num!=i){
                        System.out.print("  ");
                    }else{
                        System.out.print(i+1+" ");
                    }
                }else{
                    if(j==1){
                        num=i+1;
                    }else{
                        num=i;
                    }
                    if(num==i+1){
                        System.out.print(i+" ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
