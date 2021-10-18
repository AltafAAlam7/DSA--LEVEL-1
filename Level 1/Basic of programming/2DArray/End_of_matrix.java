import java.util.Scanner;

public class End_of_matrix {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();

            int [][] arr = new int[n][m];
            for(int i=0 ;i<arr.length;i++)
            {
                for(int j=0;j<arr[0].length;j++)
                    arr[i][j]=scn.nextInt();
            }
            int dir=0;
            int i=0,j=0;
            while(true)
            {
                dir = (dir + arr[i][j])%4;

                if(dir==0) //east direction
                {
                    j++;
                    if(j==arr[0].length)
                    {
                        j--;
                        break;
                    }
                }
                else if(dir==1) //south
                {
                    i++;
                    if(i==arr.length)
                    {
                        i--;
                        break;
                    }
                }
                else if(dir==2) // west
                {
                    j--;
                    if(j==-1)
                    {
                        j++;
                        break;
                    }  
                }
                else // north
                {
                    i--;
                    if(i==-1)
                    {
                        i++;
                        break;
                    }

                }
             }
            System.out.println(i);
            System.out.println(j);
            scn.close();
    }
}
