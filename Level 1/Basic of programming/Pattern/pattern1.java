import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        
        Scanner scn =new Scanner(System.in);

        int n=scn.nextInt();

        int stars=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=stars;j++)
                System.out.print("*\t");
            
            System.out.println();
            stars++;
        }
        scn.close();
    }
}
