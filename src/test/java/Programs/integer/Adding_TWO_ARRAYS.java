package Programs.integer;

public class Adding_TWO_ARRAYS 
{
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {4,5,6,1,1,6,20};
		int[] c = a;
		int length = a.length;
		if (a.length<b.length) 
		{
			length = b.length;
		}
		
		for (int i = 0; i < length; i++) 
		{
			try {
				
				System.out.print(a[i]+b[i]+" ");
				
			} catch (Exception e) {
				if (a.length<b.length) 
				{
					System.out.print(b[i]+" ");
				}else {
					System.out.print(a[i]+" ");

				}
			}
		}
		for (int i = 0; i < c.length; i++)
		{
			System.out.println(c[i]);
		}
 	}
}
