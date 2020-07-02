
/*
 * 
  java programme for below given pattern
  
12345
1   2
1   2
1   2
12345
 

 */
public class No_Pattern3 
{
	public static void main(String[] args) 
	{
		int lines = 5;
		int num = 1;
		int numcount = 5; 
		
		for(int i =1; i<=lines; i++)
		{
			for(int j = 1; j<=numcount; j++)
			{
				if(i == 1 || i == lines || j == 1 || j == numcount)
				{
				System.out.print(num);
				num++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			num = 1;
		}
	}
}
