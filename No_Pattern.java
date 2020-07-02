
/*
 * 
  java programme for below given pattern
 
12345
12345
12345
12345
12345
 */

public class No_Pattern 
{
	public static void main(String[] args) 
	{
		int lines = 5;
		int num = 1;
		
		for(int i = 1; i<=lines; i++)
		{
			for(int j = 1; j<=lines; j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
			num = 1;
		}
	}
}
