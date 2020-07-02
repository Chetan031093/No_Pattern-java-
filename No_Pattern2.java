
/*
 * 
  java programme for below given pattern
 
54321
54321
54321
54321
54321
 */


public class No_Pattern2 
{
	public static void main(String[] args) 
	{
		
		int lines = 5;
		int num = 5;
		
		for(int i = 1; i<=lines; i++)
		{
			for(int j =1; j<=lines; j++)
			{
				System.out.print(num);
				num--;
			}
			System.out.println();
			num = 5;
		}
	
    }
}
