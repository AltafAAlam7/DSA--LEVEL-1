import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int k= scn.nextInt();

        int nod=0;
        int temp=n;

        while(temp!=0)
        {
            temp=temp/10;
            nod++;
        }
        
        k=k%nod;
        if(k<0)
            k=k+nod;
        
        int div=1;
        int multi=1;
        for(int i=1;i<=nod;i++)
        {
            if(i<=k)
                div=div*10;
            else 
                multi=multi*10;
        }

        int ans=0;
        int q=n/div;
        int r=n%div;
        ans=r*multi + q;
        System.out.println(ans);
    
    scn.close();
}
}