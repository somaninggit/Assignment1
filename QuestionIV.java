package Assigment;

public class QuestionIV {

	public static void main(String[] args) {
		
		int n=19;// TODO Auto-generated method stub
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i-j>=(n-1)/2 || i+j>=3*(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println( );
		}

	}

}
