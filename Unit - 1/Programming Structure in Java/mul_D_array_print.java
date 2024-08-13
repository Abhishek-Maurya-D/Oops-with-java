public class mul_D_array_print
{
	public static void main(String[] args)
	{
		int[] a = {2424,3,534,534,6,34,634};
		int[] b = {5353,456,4344,53,45,3,5,34,53,45,3,34};
		int[] c = {345,35,3,45,3};
		int[][] x = {a,b,c};
		System.out.println(x.length);
		System.out.println(x[0].length);
		System.out.println(x[1].length);
		System.out.println(x[2].length);
		System.out.println(x[1][2]);
		for(int i=0; i<x.length;i++)
		{
			for(int j=0; j<x[i].length; j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		for(int[] m:x)
		{
			for(int item:m)
			{
				System.out.print(item+" ");
			}
			System.out.println();
		}
	}
}