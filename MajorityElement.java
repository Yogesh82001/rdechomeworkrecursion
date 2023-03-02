import java.util.HashMap;
class MajorityElement
{
	private static void findMajority(int[] arr)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

		for(int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
					int count = map.get(arr[i]) +1;
					if (count > arr.length /2) {
						System.out.println("Majority found :->  " + arr[i]);
						return;
					} else
						map.put(arr[i], count);

			}
			else
				map.put(arr[i],1);
			}
			System.out.println(" No Majority element");
	}



	public static void main(String[] args)
	{
		int arr[] = {2,2,1,1,1,2,2};
		
		findMajority(arr);
	}
}

