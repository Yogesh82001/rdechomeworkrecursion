public class missingnumber2 {
	static int getMissingNo(int arr[], int n)
	{
		int x= arr[0];
		int y = 1;
		for (int i=1; i<n; i++)
			x = x ^ arr[i];

		for (int i=2; i<=n+1; i++)
			y = y ^ i;

		return (x ^ y);
	}
	public static void main(String args[])
	{
		int arr[] = { 1, 2, 3, 5 };
		int n = arr.length;
        int missnumber = getMissingNo(arr, n);
		System.out.println(missnumber);
	}
}
