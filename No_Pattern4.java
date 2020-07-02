

/*
 * 
  java programme for below given pattern
  
54321
5   4
5   4
5   4
54321
 

 */
public class No_Pattern4
{
	public static void main(String[] args) 
	{
		int lines = 5;
		int num = 5;
		int numcount = 5; 
		
		for(int i =1; i<=lines; i++)
		{
			for(int j = 1; j<=numcount; j++)
			{
				if(i == 1 || i == lines || j == 1 || j == numcount)
				{
				System.out.print(num);
				num--;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			num = 5;
		}
	}
}
