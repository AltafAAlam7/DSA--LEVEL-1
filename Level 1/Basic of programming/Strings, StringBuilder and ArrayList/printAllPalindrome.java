import java.util.Scanner;
public class printAllPalindrome {

	public static void solution(String str){
		//write your code here
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				String sub = str.substring(i, j);

				boolean Palindrome=IsPalindrome(sub);
				if(Palindrome)
					System.out.println(sub);
			}
		}
		
	}

	public static boolean IsPalindrome(String str)
	{
		int left =0;
		int right = str.length()-1;

		while(left<right)
		{
			if(str.charAt(left)!=str.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
		scn.close();
	}

}