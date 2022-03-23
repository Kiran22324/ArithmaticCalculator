package arrayPackage;


public class ArrayClass 
{

	public static void main(String[] args) 
	{
		//initialize an array
		int arr[]=new int[] {1,2,3,4,5,6,7};
		
		//number of times should be rotate
		int n=3;
		System.out.println("ORIGINAL ARRAY:");
		for (int i=0;i<arr.length;i++)

		{
			System.out.println(arr[i]);
		}
		//rotate given array for n times towards right
		for (int i=0;i<n;i++)
		{
			int j,last;
			//stores last element of array
			last=arr[arr.length-1];
			for (j=arr.length-1;j>0;j--)
			{
				//shift element of array by one
				arr[j]=arr[j-1];
			}
				//last element of array will be added to the start of array
				arr[0]=arr[last];
		}
		System.out.println("Array After Right Rotation:");
		for (int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
