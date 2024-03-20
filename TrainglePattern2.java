class TrainglePattern2
{
	public static void main(String[] args) {
		// for(int i=1;i<=5;i++)
		// {
		// 	char ch='a';
		// 	for(int j=1;j<=i;j++)
		// 	{
		// 		System.out.print(ch++ +" ");
		// 	}
		// 	System.out.println();
		// }
		for(int i=1;i<=5;i++)
		{
			int ch=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}